package ibf2022.ssf.day12workshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//generates constructors, getters and setters
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    
    //declare variables -> go to repo after this
    private String itemName;
    private Integer quantity;

}
