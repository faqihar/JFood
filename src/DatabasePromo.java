import java.util.ArrayList;
import java.util.*;
/**
 * Write a description of class DatabaseFood here.
 *
 * @author Faqih Achmad
 * @version 1.2 (27 feb 2020)
 * 
 */
public class DatabasePromo
{
    private ArrayList<Promo> PROMO_DATABASE;
    private int lastId = 0;

    public ArrayList<Promo> getPromoDatabase(){
        return PROMO_DATABASE;
    }

    public int getLastId(){
        return lastId;
    }

    public Promo getPromoById(int id){
        for (Promo promo : PROMO_DATABASE) {
            if (promo.getId() == id) {
                return promo;
            }
        }
        return null;
    }

    public Promo getPromoByCode(String code){
        for (Promo promo : PROMO_DATABASE) {
            if (promo.getCode() == code) {
                return promo;
            }
        }
        return null;
    }

    public boolean addPromo(Promo promo){
        PROMO_DATABASE.add(promo);
        lastId = promo.getId();
        return true;
    }

    public boolean activetePromo(int id){
        for (Promo promo : PROMO_DATABASE) {
            if (!promo.getActive()) {
                promo.setActive(true);
                return true;
            }
        }
        return false;
    }

    public boolean deactivatePromo(int id){
        for (Promo promo : PROMO_DATABASE) {
            if (promo.getActive()) {
                promo.setActive(false);
                return true;
            }
        }
        return false;
    }

    public boolean remove(int id){
        for(int i = 0; i < PROMO_DATABASE.size(); i++){
            Promo promo = PROMO_DATABASE.get(i);
            if (promo.getId() == id){
                PROMO_DATABASE.remove(i);
                return true;
            }
        }
        return false;
    }
}