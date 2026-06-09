package org.example.oficina.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI()
                .info(new Info()
                        .title("API de Oficina Mecânica")
                        .description("API para gerenciamento de clientes, veículos e ordens de serviço de uma oficina mecânica.")
                        .version("1.0.0"));
    }
}
