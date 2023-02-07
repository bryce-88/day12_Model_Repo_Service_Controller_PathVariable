package ibf2022.ssf.day12workshop.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ibf2022.ssf.day12workshop.model.Country;
import ibf2022.ssf.day12workshop.service.CountryService;

@Controller
@RequestMapping("countries") //can do this if only one path variable to go into entry point
public class CountryController {
    
    CountryService ctySvc; //instantiate

    public CountryController() {
        ctySvc = new CountryService();
    }

    //@GetMapping(produces = {"application/xml"})
    @GetMapping
    public @ResponseBody List<Country> getAllCountries() {
        return ctySvc.getAllCountries();
    }

    @PostMapping() //creating new record
    public @ResponseBody Boolean createCountry(@RequestBody Country cty) {
        return ctySvc.createCountry(cty);
    }

    @GetMapping("/list")
    public String displayCountryList(Model model) {
        List<Country> ctyList = ctySvc.getAllCountries();
        model.addAttribute("countryList", ctyList);
        return "countryList";
    }
}
