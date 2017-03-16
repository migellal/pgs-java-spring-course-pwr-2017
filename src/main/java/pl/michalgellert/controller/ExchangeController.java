package pl.michalgellert.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.michalgellert.service.ExchangeService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.List;

/**
 * Created by micha on 07.03.2017.
 */
@RestController
@RequestMapping("/exchange")
public class ExchangeController {

    @Autowired
    private ExchangeService exchangeService;

    @Autowired
    private Collection<ExchangeService> services;

    @Autowired
    private String string;

    @RequestMapping("/allExchanges")
    public List<String> allExchanges() {
        List<String> result = new ArrayList<>();
        services.forEach(((x)->result.add(x.getExchange())));
        result.add(string);
        return result;
    }

//    @RequestMapping("/allExchanges")
//    public ResponseEntity<List<String>> allExchangesResponse() {
//        List<String> result = new ArrayList<>();
//        service.forEach(((x)->result.add(x.getExchange())));
//        return new ResponseEntity<List<String>>(result, HttpStatus.OK);
//    }

//    @Qualifier("cute")
    @RequestMapping("/getExchange")
    public String getExchange() {
        String ourExchange = "";
        for (ExchangeService exchangeService : services) {
            ourExchange += exchangeService.getExchange();
        }
//        return exchangeService.getExchange();
        return ourExchange;
    }

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
