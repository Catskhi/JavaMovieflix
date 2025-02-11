package com.movieflix.config;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@SecurityScheme(
        name = "BearerAuth",
        type = SecuritySchemeType.HTTP,
        scheme = "Bearer"
)
public class SwaggerConfig {

    @Bean
    public OpenAPI getOpenAPI() {
        Contact contact = new Contact();
        contact.name("Catskhi");

        Info info = new Info();
        info.title("Movieflix");
        info.version("v1");
        info.description("Application for managing movie catalogs.");
        info.contact(contact);

        return new OpenAPI().info(info);
    }
}
