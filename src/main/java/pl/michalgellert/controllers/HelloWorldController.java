package pl.michalgellert.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by micha on 07.03.2017.
 */
@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/world")
    public String helloWorld() {
        return "HelloWorld";
    }

    @RequestMapping("/{name}")
    public String helloName(@PathVariable String name) {
        return "Hello " + name;
    }
}
