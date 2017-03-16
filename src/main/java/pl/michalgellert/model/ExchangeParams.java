package pl.michalgellert.model;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.Size;

/**
 * Created by micha on 16.03.2017.
 */
@Data
public class ExchangeParams {

    @Valid
    @Size(min = 3, max = 58)
    private String city;
    private String country;
    private Boolean current;
    private Integer someNumber;
}
