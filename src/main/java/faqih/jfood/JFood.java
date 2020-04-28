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


@SpringBootApplication

public class JFood {
    public static void main(String[] args) throws SellerNotFoundException {
        Location location1 = new Location("DEPOK", "JAWA BARAT", "MARGONDA");
        Location location2 = new Location("Jakarta Timur", "Jakarta", "Bundaran HI");
        Location location3 = new Location("Bogor", "JAWA BARAT", "Jongol");

        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId() + 1, "Renaldi", "renaldi@gmail.com", "+6281287567546", location1));
        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId() + 1, "faqi", "faqi@gmail.com", "+6281287527543", location2));
        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId() + 1, "Rey", "rey@gmail.com", "+6281287527541", location3));

        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Bakso", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 241000, FoodCategory.Western));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Bakso Urat", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 1000, FoodCategory.Noddles));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Bakso Buntut", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 1500, FoodCategory.Noddles));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Nasi Goreng", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 15000, FoodCategory.Rice));
        
        SpringApplication.run(JFood.class, args);
    }
}