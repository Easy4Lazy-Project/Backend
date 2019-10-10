package com.easy4lazy.proj.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

import static springfox.documentation.builders.PathSelectors.regex;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.easy4lazy.proj"))
                .paths(regex("/api/v1.*"))
                .build()
                .apiInfo(metaInfo());
    }


    private ApiInfo metaInfo() {
        Contact contact = new Contact(
                "Dany,Ali,Hedra,Jose,Abeola",
                "http://www.appsdeveloperblog.com",
                "developer@mum.edu"
        );
        List<VendorExtension> vendorExtensions = new ArrayList<>();

        ApiInfo apiInfo = new ApiInfo(
                " Easy4laszy Project Web Service documentation",
                "This pages documents Easy4laszy app  Web Service endpoints", "1.0",
                "http://www.....html", contact,
                "Apache 5.0", "http://www.apache.org/licenses/LICENSE-2.0",vendorExtensions);
        return apiInfo;
    }
}
