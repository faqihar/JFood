import java.util.ArrayList;

/**
 * Write a description of class DatabaseFood here.
 *
 * @author Faqih Achmad
 * @version 1.2 (27 feb 2020)
 * 
 */
public class DatabaseCustomer{
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<>();
    private static int lastId = 0;

    public static ArrayList<Customer> getCustomerDatabase(){
        return CUSTOMER_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Customer getCustomerById(int id){
        for(Customer customer : CUSTOMER_DATABASE){
            if(customer.getId() == id){
                return customer;
            }
        }
        return null;
    }

    public static boolean addCustomer(Customer customer){
        for(Customer cust : CUSTOMER_DATABASE){
            if(cust.getEmail() == customer.getEmail()){
                return false;
            }
        }
        CUSTOMER_DATABASE.add(customer);
        lastId = customer.getId();
        return true;
    }

    public static boolean removeCustomer(int id){
        for(Customer customer : CUSTOMER_DATABASE){
            if(customer.getId() == id){
                CUSTOMER_DATABASE.remove(customer);
                return true;
            }
        }
        return false;
    }





}