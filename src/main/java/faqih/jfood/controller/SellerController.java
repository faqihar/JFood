package faqih.jfood.controller;

import faqih.jfood.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;

/**
 * class SellerController
 * @author Faqih Achmad
 * @version 7/6/2020
 */

@RequestMapping("/seller")
@CrossOrigin(origins = "*", allowedHeaders = "")
@RestController
public class SellerController {
    /**
     * Get database seller
     * @return DatabaseSeller.getSellerDatabase()
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Seller> getAllSeller() {
        return DatabaseSeller.getSellerDatabase();
    }

    /**
     * Get database seller by id
     * @param id seller id
     * @return DatabaseSeller.getSellerById(id)
     * @throws SellerNotFoundException seller not found exceptions
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Seller getSellerById(@PathVariable int id) throws SellerNotFoundException {
        return DatabaseSeller.getSellerById(id);
    }

    /**
     * Add seller
     * @param name seller name
     * @param email seller email
     * @param phoneNumber phone number
     * @param city city
     * @param province province
     * @param description description
     * @return seller
     */
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
