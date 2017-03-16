package pl.michalgellert.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pl.michalgellert.model.ExchangeParams;
import pl.michalgellert.service.OpenWeatherClient;

/**
 * Created by micha on 16.03.2017.
 */
@RestController
@RequestMapping("/api")
public class NewExchangeController {

    @Autowired
    private OpenWeatherClient openWeatherClient;

    @RequestMapping("weatherclient")
    private String weatherClient() {
        return openWeatherClient.getExchange();
    }

    @RequestMapping("/hello")
    private String hello() {
        return "hello";
    }

    @RequestMapping(value = "/helloName", method = RequestMethod.GET)
    private String hello(@RequestParam(name = "imie", required = false, defaultValue = "Michał") String name) {
        return "hello " + name;
    }

    @RequestMapping("/exchange")
    private String getExchange(ExchangeParams exchangeParams) {
        return exchangeParams.toString();
    }

    @RequestMapping("/exchange/params")
    private ExchangeParams getExchangeParams(@Validated ExchangeParams exchangeParams) {
        exchangeParams.setCurrent(false);
        return exchangeParams;
    }

    @RequestMapping(value = "/exchange/params/request", method = RequestMethod.POST)
    private ExchangeParams getExchangeParamsRequest(@RequestBody ExchangeParams exchangeParams) {
        exchangeParams.setCurrent(false);
        return exchangeParams;
    }
}
