package pl.michalgellert;

import jdk.nashorn.internal.runtime.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

@SpringBootApplication
@Logger
public class PgsWorkshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(PgsWorkshopApplication.class, args);
        log.print("log");
    }
}
