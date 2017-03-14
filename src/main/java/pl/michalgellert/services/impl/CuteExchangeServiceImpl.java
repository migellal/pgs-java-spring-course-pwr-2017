package pl.michalgellert.services.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pl.michalgellert.services.ExchangeService;

/**
 * Created by micha on 14.03.2017.
 */
@Primary
@Service("cute")
//@Profile("cute_profile")
public class CuteExchangeServiceImpl implements ExchangeService {
    @Override
    public String getExchange() {
        return "You win";
    }
}
