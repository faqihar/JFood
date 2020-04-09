import java.util.ArrayList;
import java.util.*;

/**
 * Write a description of class DatabaseFood here.
 *
 * @author Faqih Achmad
 * @version 1.2 (27 feb 2020)
 * 
 */

public class DatabaseSeller
{
    private static ArrayList<Seller> SELLER_DATABASE = new ArrayList<>();
    private static int lastId = 0;

    public static ArrayList<Seller> getSellerDatabase(){
        return SELLER_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    public static Seller getSellerById(int id) throws SellerNotFoundException{
        for (Seller sell : SELLER_DATABASE){
            if(sell.getId() == id){
                return sell;
            }
        }
        throw new SellerNotFoundException(id);
    }
    public static boolean addSeller(Seller seller){

        SELLER_DATABASE.add(seller);
        lastId = seller.getId();
        return true;

    }

    public static boolean removeSeller(int id) throws SellerNotFoundException{
        for(Seller sell : SELLER_DATABASE){
            if(sell.getId()==id){
                SELLER_DATABASE.remove(sell);
                return true;
            }
        }
        throw new SellerNotFoundException(id);
    }

}