package io.igventurelli.weather_processor.aws;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.aws.secretsmanager.SecretsManagerConstants;
import org.springframework.stereotype.Component;

@Component
public class AWSSecretsManagerRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:aws-secrets-manager").routeId("secrets-manager")
            .setHeader(SecretsManagerConstants.SECRET_ID, constant("prod/weatherstack/apikey"))
            .to("aws-secrets-manager://weatherstack-secret?useDefaultCredentialsProvider=true&operation=getSecret")
            .unmarshal().json().setVariable("apiKey", simple("${body.get('key')}"));
    }
}
