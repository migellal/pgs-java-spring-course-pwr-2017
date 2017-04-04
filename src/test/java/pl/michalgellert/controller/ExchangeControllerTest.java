package pl.michalgellert.controller;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import pl.michalgellert.matchers.NumberMatcher;

import static org.junit.Assert.*;

/**
 * Created by micha on 28.03.2017.
 */
public class ExchangeControllerTest {

    @Test(expected = Exception.class)
    public void returnAllExchanges() {
        ExchangeController exchangeController = new ExchangeController();
        Assert.assertTrue(exchangeController.allExchanges().size()>0);
    }

    @Test
    public void checkIsMultiplyBy2() {
        ExchangeController exchangeController = new ExchangeController();
        int testNumber = 2;
        int result = 4;
        Assert.assertTrue(result == exchangeController.multiplyBy2(testNumber));
    }


//    @Test
//    public void shouldReturnEvenWhenMultiplyingFiveByFour() {
//        ExchangeController exchangeController = new ExchangeController();
//        int testNumber = 2;
//        Assert.assertThat(NumberMatcher.isEven(), exchangeController.multiplyBy2(testNumber));
//    }

}