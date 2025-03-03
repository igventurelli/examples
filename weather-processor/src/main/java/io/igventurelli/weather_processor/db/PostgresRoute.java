package io.igventurelli.weather_processor.db;

import io.igventurelli.weather_processor.model.WeatherData;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class PostgresRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:postgres")
            .unmarshal().json(WeatherData.class)
            .to("jpa:io.igventurelli.weather_processor.model.WeatherData");
    }
}
