package pl.michalgellert;

import jdk.nashorn.internal.runtime.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

@SpringBootApplication
@Logger
public class PgsWorkshopApplication {

    public static void main(String[] args) {
//        System.getProperties().put(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "cute_profile");
        SpringApplication.run(PgsWorkshopApplication.class, args);
        log.print("log");
    }

    @Bean
    String getWeatherType() {
        return "weatherType";
    }
}
