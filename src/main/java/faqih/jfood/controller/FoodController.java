package faqih.jfood.controller;

import faqih.jfood.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;

/**
 * class FoodController
 * @author Faqih Achmad
 * @version 7/6/2020
 */

@RequestMapping("/food")
@CrossOrigin(origins = "*", allowedHeaders = "")
@RestController
public class FoodController {

    /**
     * Get database food
     * @return DatabaseFood.getFoodDatabase()
     */

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Food> getAllFood() {
        return DatabaseFood.getFoodDatabase();
    }

    /**
     * Get food by id
     * @param id id
     * @return DatabaseFood.getFoodById(id)
     * @throws FoodNotFoundException food not found exceptions
     */

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Food getFoodById(@PathVariable int id) throws FoodNotFoundException {
        Food food = DatabaseFood.getFoodById(id);
        return food;
    }

    /**
     * Get food by seller id
     * @param sellerId seller id
     * @return DatabaseFood.getFoodBySeller(sellerId)
     * @throws FoodNotFoundException food not found exceptions
     */

    @RequestMapping(value = "/seller/{sellerId}", method = RequestMethod.GET)
    public ArrayList<Food> getFoodBySeller (@PathVariable int sellerId) throws FoodNotFoundException {
        return DatabaseFood.getFoodBySeller(sellerId);
    }

    /**
     * Get food by category
     * @param category category
     * @return DatabaseFood.getFoodByCategory(category)
     * @throws FoodNotFoundException food not found exceptions
     */

    @RequestMapping(value = "/category/{category}", method = RequestMethod.GET)
    public ArrayList<Food> getFoodByCategory (@PathVariable FoodCategory category) throws FoodNotFoundException {
        return DatabaseFood.getFoodByCategory(category);
    }

    /**
     * Add food
     * @param name name
     * @param sellerId seller id
     * @param price price
     * @param category category
     * @throws SellerNotFoundException seller not found exceptions
     * @return food
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Food addFood(@RequestParam(value="name") String name,
                        @RequestParam(value="sellerID") int sellerId,
                        @RequestParam(value="price") int price,
                        @RequestParam(value="category") FoodCategory category) throws SellerNotFoundException {
        Food food = new Food(DatabaseFood.getLastId()+1, name, DatabaseSeller.getSellerById(sellerId), price, category);
        DatabaseFood.addFood(food);
        return food;
    }

}