package faqih.jfood;

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

    public static Customer getCustomerById(int id) throws CustomerNotFoundException{
        for(Customer customer : CUSTOMER_DATABASE){
            if(customer.getId() == id){
                return customer;
            }
        }
        throw new CustomerNotFoundException(id);
    }

    public static boolean addCustomer(Customer customer) throws EmailAlreadyExistsException
    {
        for(Customer cust : CUSTOMER_DATABASE){
            if(cust.getEmail() == customer.getEmail()){
                throw new EmailAlreadyExistsException(customer);
            }
        }
        CUSTOMER_DATABASE.add(customer);
        lastId = customer.getId();
        return true;
    }

    public static boolean removeCustomer(int id) throws CustomerNotFoundException{
        for(Customer customer : CUSTOMER_DATABASE){
            if(customer.getId() == id){
                CUSTOMER_DATABASE.remove(customer);
                return true;
            }
        }
        throw new CustomerNotFoundException(id);
    }

    public static Customer getCustomerLogin(String email, String password){
        for (Customer customerPtr : CUSTOMER_DATABASE){
            if (customerPtr.getEmail().equals(email) && customerPtr.getPassword().equals(password))
            {
                return customerPtr;
            }
        }
        return null;
    }
}