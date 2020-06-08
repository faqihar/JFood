package faqih.jfood.controller;

import faqih.jfood.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;

/**
 * class PromoController
 * @author Faqih Achmad
 * @version 6/6/2020
 */

@RequestMapping("/promo")
@CrossOrigin(origins = "*", allowedHeaders = "")
@RestController

public class PromoController {
    /**
     * Get database promo
     * @return DatabasePromo.getPromoDatabase()
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Promo> getAllPromo() {
        return DatabasePromo.getPromoDatabase();
    }

    /**
     * Get database promo by promo code
     * @param code promo code
     * @return DatabasePromo.getPromoByCode(code)
     */
    @RequestMapping(value = "/{code}", method = RequestMethod.GET)
    public Promo getPromoByCode(@PathVariable String code) throws SellerNotFoundException {
        return DatabasePromo.getPromoByCode(code);
    }

    /**
     * Add promo
     * @param code promo code
     * @param discount discount
     * @param minPrice minimum price
     * @param active promo status
     * @return promo
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Promo addPromo(@RequestParam(value="code") String code,
                          @RequestParam(value="discount") int discount,
                          @RequestParam(value="minPrice") int minPrice,
                          @RequestParam(value="active") boolean active) throws PromoCodeAlreadyExistsException {
        Promo promo = new Promo(DatabasePromo.getLastId() + 1, code, discount, minPrice, active);
        DatabasePromo.addPromo(promo);
        return promo;
    }

}
