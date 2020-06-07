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
    public static void main(String[] args) throws FoodNotFoundException, SellerNotFoundException, PromoCodeAlreadyExistsException {
        Location location1 = new Location("DEPOK", "JAWA BARAT", "MARGONDA");
        Location margondaRaya = new Location("Margonda Raya", "Depok", "Jawa Barat");
        Location depok = new Location("Depok", "Depok", "Jawa Barat");
        Location detos = new Location("Depok Town Square", "Depok", "Jawa Barat");
        //Location aksesUI = new Location("Akses UI", "Depok", "Jawa Barat");
        Location kelapaDua = new Location("Kelapa Dua", "Depok", "Jawa Barat");
        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId() + 1, "Renaldi", "renaldi@gmail.com", "+6281287567546", location1));

        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Bakso", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 241000, FoodCategory.Western));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Bakso Urat", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 1000, FoodCategory.Noddles));

        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId()+1, "Boedjangan", "ridhoadhadigani@gmail.com", "082123054525", location1));
        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId()+1, "Starbucks", "starbucks@mail.com", "082123054525", margondaRaya));
        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId()+1, "Almondtree", "almondtreecakes@mail.com", "082123054525", depok));
        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId()+1, "HokBen", "hokben@mail.com", "082123054525", detos));
        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId()+1, "McDonald's", "mcd@mail.com", "082123054525", kelapaDua));
        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId()+1, "Keprabon", "keprabon@mail.com", "082123054525", kelapaDua));
        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId()+1, "BreadNow", "breadnow@mail.com", "082123054525", kelapaDua));
        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId()+1, "Mujigae", "mujigae@mail.com", "082123054525", margondaRaya));

        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Bakso Wagyu", DatabaseSeller.getSellerById(1), 20500, FoodCategory.Noddles));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Bakso Urat", DatabaseSeller.getSellerById(1), 20500, FoodCategory.Noddles));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Bakso Pedas", DatabaseSeller.getSellerById(1), 20500, FoodCategory.Noddles));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Bakso Keju", DatabaseSeller.getSellerById(1), 24500, FoodCategory.Noddles));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Bakso Nikmat", DatabaseSeller.getSellerById(1), 24500, FoodCategory.Noddles));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Bakso Penthol", DatabaseSeller.getSellerById(1), 24500, FoodCategory.Noddles));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Pangsit Special", DatabaseSeller.getSellerById(1), 24500, FoodCategory.Noddles));

        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Caffe Mocha", DatabaseSeller.getSellerById(2), 53000, FoodCategory.Coffe));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Caffe Latte", DatabaseSeller.getSellerById(2), 44000, FoodCategory.Coffe));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Vanilla Latte", DatabaseSeller.getSellerById(2), 50000, FoodCategory.Coffe));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Cappucino", DatabaseSeller.getSellerById(2), 44000, FoodCategory.Coffe));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Americano", DatabaseSeller.getSellerById(2), 34000, FoodCategory.Coffe));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Cold Brew", DatabaseSeller.getSellerById(2), 41000, FoodCategory.Coffe));

        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Red Velvet", DatabaseSeller.getSellerById(3), 260000, FoodCategory.Snacks));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Cheesecake", DatabaseSeller.getSellerById(3), 260000, FoodCategory.Snacks));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Party Cake", DatabaseSeller.getSellerById(3), 260000, FoodCategory.Snacks));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Black Forest", DatabaseSeller.getSellerById(3), 260000, FoodCategory.Snacks));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Tiramisu", DatabaseSeller.getSellerById(3), 260000, FoodCategory.Snacks));

        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Beef Yakiniku", DatabaseSeller.getSellerById(4), 40000, FoodCategory.Japanese));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Teriyaki", DatabaseSeller.getSellerById(4), 45000, FoodCategory.Japanese));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Kidzu Bento", DatabaseSeller.getSellerById(4), 25000, FoodCategory.Japanese));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Donburi", DatabaseSeller.getSellerById(4), 35000, FoodCategory.Japanese));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Bento", DatabaseSeller.getSellerById(4), 32000, FoodCategory.Japanese));

        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"PaNas Large", DatabaseSeller.getSellerById(5), 39000, FoodCategory.Western));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"PaNas Medium", DatabaseSeller.getSellerById(5), 35000, FoodCategory.Western));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"PaNas Spicy", DatabaseSeller.getSellerById(5), 36000, FoodCategory.Western));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Beef Burger", DatabaseSeller.getSellerById(5), 15000, FoodCategory.Western));

        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Chocomaltine", DatabaseSeller.getSellerById(7), 60000, FoodCategory.Bakery));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Nuttella", DatabaseSeller.getSellerById(7), 50000, FoodCategory.Bakery));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Ovomaltine", DatabaseSeller.getSellerById(7), 55000, FoodCategory.Bakery));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Skippy Creamy", DatabaseSeller.getSellerById(7), 57000, FoodCategory.Bakery));
        DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId()+1,"gratis", 10000, 50000, true));

        SpringApplication.run(JFood.class, args);
    }
}