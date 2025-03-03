package io.igventurelli.weather_processor.aws;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class AWSSQSRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("aws2-sqs://weather-processor?useDefaultCredentialsProvider=true").routeId("sqs")
            .unmarshal().json().setVariable("city", simple("${body.get('city')}"))
            .to("direct:orchestrator");
    }
}
