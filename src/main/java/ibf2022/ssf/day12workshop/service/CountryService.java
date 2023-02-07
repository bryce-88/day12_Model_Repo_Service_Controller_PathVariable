package ibf2022.ssf.day12workshop.service;

import java.util.List;


import ibf2022.ssf.day12workshop.model.Country;
import ibf2022.ssf.day12workshop.repository.CountryRepo;

//example without Annotations
public class CountryService {
    
    CountryRepo ctyRepo;

    public CountryService() {
        ctyRepo = new CountryRepo(); //without annotation, so need to instantiate
    }

    public List<Country> getAllCountries() {
        return ctyRepo.getAllCountries();
    }

    public Boolean createCountry(Country cty) {
        Boolean result = ctyRepo.createCountry(cty);
        return result;
    }
}
