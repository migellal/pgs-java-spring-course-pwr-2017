package pl.michalgellert.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Currency;

/**
 * Created by micha on 07.03.2017.
 */
@RestController
@RequestMapping("/exchange")
public class ExchangeController {

    @RequestMapping("/{number}")
    public Integer multiplyBy2(@PathVariable Integer number) {
        return 2 * number;
    }

    @RequestMapping("/c/{number}")
    public String addCurencySignature(@PathVariable Long number, @RequestParam("currency") String currency) {
        return number + currency;
    }

    @RequestMapping("/multiplier/{value}/{multiplier}")
    public String currencyMultiplier(@RequestParam("from") String from, @RequestParam("to") String to,
                                     @PathVariable Long value, @RequestParam("currency") String multiplier) {
        Currency f = Currency.getInstance(from);
        Currency t = Currency.getInstance(to);
        return value + multiplier;
    }


}
