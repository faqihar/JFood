package faqih.jfood;

import java.util.ArrayList;
import java.util.*;


/**
 * class DatabasePromo
 * @author Faqih Achmad
 * @version 7/6/2020
 */

public class DatabasePromo
{
    // instance variables - replace the example below with your own
    //private String[] listPromo;

    private static ArrayList<Promo> PROMO_DATABASE = new ArrayList<Promo>();
    private static int lastId = 0;

    /**
     * Get promo database
     * @return PROMO_DATABASE
     */
    public static ArrayList<Promo> getPromoDatabase()
    {
        return PROMO_DATABASE;
    }

    /**
     * Get Last Id
     * @return lastId
     */
    public static int getLastId()
    {
        return lastId;
    }

    /**
     * Get promo by id.
     * @param id id
     * @return promo
     * @throws PromoNotFoundException the promo not found exception
     */
    public static Promo getPromoById(int id) throws PromoNotFoundException
    {
        for(Promo promo : PROMO_DATABASE)
        {
            if (promo.getId() == id)
            {
                return promo;
            }
        }
        throw new PromoNotFoundException(id);
    }

    /**
     * Get promo by code.
     * @param code code
     * @return promo
     */
    public static Promo getPromoByCode(String code)
    {
        for(Promo promo : PROMO_DATABASE)
        {
            if (promo.getCode() == code)
            {
                return promo;
            }
        }
        return null;
    }

    /**
     * Add promo boolean.
     * @param promo the id
     * @return boolean
     * @throws PromoCodeAlreadyExistsException promo code already exist exception
     */
    public static boolean addPromo(Promo promo) throws PromoCodeAlreadyExistsException
    {
        for(Promo pro : PROMO_DATABASE){
            if(pro.getCode() == promo.getCode()){
                throw new PromoCodeAlreadyExistsException(promo);
            }
        }
        PROMO_DATABASE.add(promo);
        lastId = promo.getId();
        return true;
    }

    /**
     * Remove promo boolean.
     * @param id id
     * @return boolean
     * @throws PromoNotFoundException the promo not found exception
     */
    public static boolean removePromo(int id) throws PromoNotFoundException
    {
        for(int i = 0;  i < PROMO_DATABASE.size(); i++)
        {
            Promo promo = PROMO_DATABASE.get(i);
            if (id == promo.getId())
            {
                PROMO_DATABASE.remove(id);
                return true;
            }
        }
        throw new PromoNotFoundException(id);
    }

    /**
     * Activated promo boolean.
     * @param id the id
     * @return boolean
     */
    public static boolean activatePromo(int id)
    {
        for(Promo promo: PROMO_DATABASE)
        {
            if(promo.getId() == id)
            {
                promo.setActive(true);
                return true;
            }
        }
        return false;
    }

    /**
     * Deactivated promo boolean.
     * @param id the id
     * @return boolean
     */
    public static boolean deactivatePromo(int id)
    {
        for(Promo promo:PROMO_DATABASE)
        {
            if (id == promo.getId())
            {
                promo.setActive(false);
                return true;
            }
        }
        return false;
    }


}