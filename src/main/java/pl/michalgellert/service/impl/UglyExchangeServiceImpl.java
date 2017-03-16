package pl.michalgellert.service.impl;

import org.springframework.stereotype.Service;
import pl.michalgellert.service.ExchangeService;

/**
 * Created by micha on 14.03.2017.
 */
@Service
//@Profile("ugly_profile")
public class UglyExchangeServiceImpl implements ExchangeService {
    @Override
    public String getExchange() {
        return "You loose";
    }
}
