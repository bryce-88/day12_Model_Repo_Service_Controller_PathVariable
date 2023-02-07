package ibf2022.ssf.day12workshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



//model consists of constructors, getters and setters
//lombok dependency will settle everything with the below Annotations
//just need to declare the variables in Country class
//move on to Repo after this
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Country {

    private String code;
    private String name;
    private Integer population;
    
}
