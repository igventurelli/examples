package io.igventurelli.weather_processor.orchestrator;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class WeatherProcessor extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:orchestrator").routeId("orchestrator")

            // load WeatherStack API Key
            .to("direct:aws-secrets-manager")

            // call WeatherStack API
            .to("direct:weather-stack")

            // send to Postgres
            .to("direct:postgres")

            .log("finished");
    }
}
