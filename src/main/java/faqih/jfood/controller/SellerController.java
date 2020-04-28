package faqih.jfood.controller;

import faqih.jfood.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RequestMapping("/seller")
@CrossOrigin(origins = "*", allowedHeaders = "")
@RestController
public class SellerController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Seller> getAllSeller() {
        return DatabaseSeller.getSellerDatabase();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Seller getSellerById(@PathVariable int id) throws SellerNotFoundException {
        return DatabaseSeller.getSellerById(id);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Seller addSeller(@RequestParam(value="name") String name,
                            @RequestParam(value="email") String email,
                            @RequestParam(value="phoneNumber") String phoneNumber,
                            @RequestParam(value="city") String city,
                            @RequestParam(value="province") String province,
                            @RequestParam(value="description") String description) {
        Seller seller = new Seller(DatabaseSeller.getLastId() + 1, name, email, phoneNumber, new Location(city, province, description));
        DatabaseSeller.addSeller(seller);
        return seller;
    }
}
