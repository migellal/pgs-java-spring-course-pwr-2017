package pl.michalgellert.services.impl;

import org.springframework.stereotype.Service;
import pl.michalgellert.services.ExchangeService;

/**
 * Created by micha on 14.03.2017.
 */
@Service
public class UglyExchangeServiceImpl implements ExchangeService {
    @Override
    public String getExchange() {
        return "You loose";
    }
}
