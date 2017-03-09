package pl.michalgellert.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Currency;

/**
 * Created by micha on 09.03.2017.
 */
@Getter
@Setter
public class ExchangeDTO {

    private BigDecimal value;
    private Currency string;

}
