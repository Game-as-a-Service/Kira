package com.Kira;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 參考資料:
// https://www.baeldung.com/spring-rest-openapi-documentation
// https://medium.com/@javedalikhan50/comprehensive-guide-to-openapi-swagger-integration-in-spring-boot-with-spring-security-jwt-edf8c84e7d91
// 設定 jwt
@Configuration
public class SwaggerConfig {
    String schemeName = "bearerAuth";
    String bearerFormat = "JWT";
    String scheme = "bearer";
    @Bean
    public OpenAPI caseOpenAPI() {
        return new OpenAPI()
            .addSecurityItem(new SecurityRequirement()
                .addList(schemeName)).components(new Components()
                .addSecuritySchemes(
                    schemeName, new SecurityScheme()
                        .name(schemeName)
                        .type(SecurityScheme.Type.HTTP)
                        .bearerFormat(bearerFormat)
                        .in(SecurityScheme.In.HEADER)
                        .scheme(scheme)
                )
            )
            .info(new Info()
                .title("Case Management Service")
                .description("Claim Event Information")
                .version("1.0")
            );
    }
}
