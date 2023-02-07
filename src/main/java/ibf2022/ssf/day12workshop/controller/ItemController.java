package ibf2022.ssf.day12workshop.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ibf2022.ssf.day12workshop.model.Item;
import ibf2022.ssf.day12workshop.service.ItemService;

@Controller
@RequestMapping(path={"/shoppingCart"})
public class ItemController {
    
    @Autowired
    ItemService itmSvc;

    @GetMapping(produces = "text/html")
    public String displayCart(Model model) {
        List<Item> items = itmSvc.retrieveItemList();
        model.addAttribute("cartItems", items);
        return "cartList";
    }

    @GetMapping("{itemname}")
    public String filteredCart(@PathVariable(name="itemname") String itemname, Model model) {
        List<Item> items = itmSvc.retrieveItemList();
        List<Item> foundItems = items.stream().filter(i -> i.getItemName().equalsIgnoreCase(itemname)).collect(Collectors.toList());
        model.addAttribute("cartItems", foundItems);

        return "cartList";
    }
}
