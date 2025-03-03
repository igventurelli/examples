package io.igventurelli.weather_processor.integration;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.http.HttpMethods;
import org.springframework.stereotype.Component;

@Component
public class WeatherStackRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:weather-stack").routeId("weather-stack")
            .setHeader(Exchange.HTTP_METHOD, constant(HttpMethods.GET))
            .setHeader(Exchange.HTTP_QUERY, simple("access_key=${variable.apiKey}&query=${variable.city}"))
            .to("https://api.weatherstack.com/current");
    }
}
