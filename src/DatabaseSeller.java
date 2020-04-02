import java.util.ArrayList;
import java.util.*;

/**
 * Write a description of class DatabaseFood here.
 *
 * @author Faqih Achmad
 * @version 1.2 (27 feb 2020)
 * 
 */

public class DatabaseSeller//create class DatabaseSeller
{
    /**
     * membuat variabel di class databaseFood
     * variabel instance
     * private hanya bisa diberikan pada member class
     */
    private static ArrayList<Seller> SELLER_DATABASE = new ArrayList<Seller>();
    private static int LastId = 0;

    public DatabaseSeller()
    {

    }
    public static ArrayList<Seller> getSellerDatabase()
    {
        return SELLER_DATABASE;
    }
    public static int getLastId()
    {
        return LastId;
    }

    public static Seller getSellerById(int id)
    {
        Seller returnValue = null;
        for(Seller sellerDB : SELLER_DATABASE)
        {
            if(sellerDB.getId() == id)
            {
                returnValue = sellerDB;
            }
        }
        return returnValue;
    }

    public static boolean addSeller(Seller seller)
    {

        for(Seller sellerDB : SELLER_DATABASE)
        {
            if(seller.getName().equals(sellerDB.getName()) &&
                    seller.getEmail().equals(sellerDB.getEmail()) &&
                    seller.getPhoneNumber().equals(sellerDB.getPhoneNumber()))
            {
                return false;
            }
        }
        SELLER_DATABASE.add(seller);
        LastId = seller.getId();
        return true;
    }

    public static boolean removeSeller(int id)
    {
        return true;
    }

}
