package com.test.example.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("!prod")
public class SpringDocConfig {
  @Bean
  public OpenAPI customOpenAPI(
      @Value("${info.app.name}") String appName,
      @Value("${info.app.description}") String appDescription,
      @Value("${info.app.version}") String appVersion) {

    return new OpenAPI()
        .info(new Info()
            .title(appName)
            .version(appVersion)
            .description(appDescription)
            .termsOfService("http://swagger.io/terms/")
            .license(
                new License()
                    .name("MIT")
                    .url("https://github.com/cvikupitz/driver-registry-api/blob/master/LICENSE")));
  }
}