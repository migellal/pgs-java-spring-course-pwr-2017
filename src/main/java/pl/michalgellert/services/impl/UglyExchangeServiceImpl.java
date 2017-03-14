package pl.michalgellert.services.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pl.michalgellert.services.ExchangeService;

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
