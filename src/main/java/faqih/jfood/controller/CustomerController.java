package faqih.jfood.controller;

import faqih.jfood.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * class CustomerController
 * @author Faqih
 * @version 7/6/2020
 */

@RequestMapping("/customer")
@CrossOrigin(origins = "*", allowedHeaders = "")
@RestController
public class CustomerController {

    /**
     * Get database customer
     * @return DatabaseCustomerPostgre.getDatabaseCustomer
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Customer> getDatabaseCustomer(){
        return DatabaseCustomerPostgre.getDatabaseCustomer();
    }

    /**
     * Get customer by id
     * @param id id
     * @return DatabaseCustomerPostgre.getDatabaseCustomer(id)
     */
    @RequestMapping("/{id}")
    public Customer getCustomerById(@PathVariable int id) {
        return DatabaseCustomerPostgre.getCustomer(id);
    }

    /**
     * Register customer
     * @param name name
     * @param email email
     * @param password password
     * @return DatabaseCustomerPostgre.insertCustomer(name, email, password)
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Customer registerCustomer(@RequestParam(value="name") String name,
                                     @RequestParam(value="email") String email,
                                     @RequestParam(value="password") String password)
    {
        return DatabaseCustomerPostgre.insertCustomer(name, email, password);
    }

    /**
     * Login customer
     * @param email email
     * @param password password
     * @return DatabaseCustomerPostgre.insertCustomer(email, password)
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Customer loginCustomer(@RequestParam(value="email") String email,
                                  @RequestParam(value="password") String password)
    {
        return DatabaseCustomerPostgre.getCustomer(email, password);
    }

    /**
     * Remove customer
     * @param id id
     * @return DatabaseCustomerPostgre.removeCustomer(id);
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Boolean removeCustomer(@RequestParam(value="id") int id){
        return DatabaseCustomerPostgre.removeCustomer(id);
    }

}