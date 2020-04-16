package faqih.jfood.controller;

import faqih.jfood.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RequestMapping("/promo")
@RestController
public class PromoController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Promo> getAllPromo() {
        return DatabasePromo.getPromoDatabase();
    }

    @RequestMapping(value = "/{code}", method = RequestMethod.GET)
    public Promo getPromoByCode(@PathVariable String code) throws SellerNotFoundException {
        return DatabasePromo.getPromoByCode(code);
    }

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
