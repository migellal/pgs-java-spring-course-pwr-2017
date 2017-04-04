package pl.michalgellert;

import jdk.nashorn.internal.runtime.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;
import static springfox.documentation.builders.PathSelectors.regex;

@SpringBootApplication
@Logger
public class PgsWorkshopApplication {

    public static void main(String[] args) {
//        System.getProperties().put(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "cute_profile");
        SpringApplication.run(PgsWorkshopApplication.class, args);
        log.print("log");
    }
//
//    @Bean
//    String getWeatherType() {
//        return "weatherType";
//    }

    @Bean
    public Docket newsApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("greetings")
                .apiInfo(apiInfo())
                .select()
                .paths(regex("/api.*"))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring REST Sample with Swagger")
                .description("Spring REST Sample with Swagger")
                .termsOfServiceUrl("http://www-03.ibm.com/software/sla/sladb.nsf/sla/bm?Open")
                .contact("Niklas Heidloff")
                .license("Apache License Version 2.0")
                .licenseUrl("https://github.com/IBM-Bluemix/news-aggregator/blob/master/LICENSE")
                .version("2.0")
                .build();
    }
}
