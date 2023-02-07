package ibf2022.ssf.day12workshop.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ibf2022.ssf.day12workshop.model.Country;


//this step comes after model
@Repository 
public class CountryRepo {
    
    List<Country> countryList;

    public List<Country> getAllCountries() {
        
        countryList = new ArrayList<>();
        Country cty = new Country("SG", "Singapore", 6000000);
        countryList.add(cty);
        cty = new Country("MY", "Malaysia", 33000000);
        countryList.add(cty);
        cty = new Country("CN", "China", 143000000);
        countryList.add(cty);
        cty = new Country("HK", "Hong Kong", 7000000);
        countryList.add(cty);

        return countryList;
    }

    public Boolean createCountry(Country cty) {

        if (countryList == null) {
            countryList = new ArrayList<>();
        }

        countryList.add(cty);
        return true;
    }
}
