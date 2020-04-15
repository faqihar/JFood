package faqih.jfood;

import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;
import java.util.*;
import java.text.*;
import java.util.regex.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.ArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Modul 6
@SpringBootApplication

public class JFood {
    public static void main(String[] args) throws SellerNotFoundException {
        SpringApplication.run(JFood.class, args);

        //MODUL 6
        Location location1 = new Location("DEPOK", "JAWA BARAT", "MARGONDA");
        Calendar calendar = new GregorianCalendar(2020, Calendar.SEPTEMBER, 16);


        //Seller
        DatabaseSeller.addSeller(new Seller(1, "Afif Abdurrahman", "apiplex@gmail.com", "+6281287567546", location1));
        DatabaseSeller.addSeller(new Seller(2, "Apiplex", "apiplex@gmail.com", "+6281287527546", location1));

        //Promo
        try {
            DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId() + 1, "PROMO PJJ-ASIK", 20000, 25000, false));
            DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId() + 1, "PROMO PJJ-ASIK", 10000, 15000, true));
        }
        catch (PromoCodeAlreadyExistsException p) {
            System.out.println(p.getMessage());
        }

        //Food
        try{
            DatabaseFood.addFood(new Food(1, "Fetuccinni", DatabaseSeller.getSellerById(1), 50000, FoodCategory.Western));
            DatabaseFood.addFood(new Food(2, "Russian Vodka", DatabaseSeller.getSellerById(2), 13000, FoodCategory.Beverages));
        }
        catch (SellerNotFoundException s){
            System.out.println(s.getMessage());
        }

        ArrayList<Food> food1 = new ArrayList<Food>();
        try{
            food1.add(DatabaseFood.getFoodById(1));
            food1.add(DatabaseFood.getFoodById(2));
        }catch(FoodNotFoundException e){
            System.out.println(e.getMessage());
        }

        try {
            DatabaseInvoice.removeInvoiceStatus(666);
        } catch (InvoiceNotFoundException i){
            System.err.println(i.getMessage());
        }
        try{
            DatabaseInvoice.addInvoice(new CashInvoice(1, food1, DatabaseCustomer.getCustomerById(3), 1001));
            DatabaseInvoice.addInvoice(new CashInvoice(1, food1, DatabaseCustomer.getCustomerById(1), 1001));

        }catch (CustomerNotFoundException | OngoingInvoiceAlreadyExistsException e){
            System.out.println(e.getMessage());
        }
        System.out.println("\nList invoice:");
        for(Invoice invoice : DatabaseInvoice.getInvoiceDatabase()) {
            invoice.setTotalPrice();
            System.out.println(invoice);
            System.out.println();
        }

        try {
            DatabaseInvoice.removeInvoiceStatus(666);
        } catch (InvoiceNotFoundException i){
            System.err.println(i.getMessage());
        }
    }
}

