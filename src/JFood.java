  import java.util.Calendar;
  import java.util.GregorianCalendar;
  import java.text.SimpleDateFormat;
  import java.util.*;
  import java.text.*;
  import java.util.regex.*;
  import java.lang.Object;
  import javax.xml.crypto.Data;

public class JFood {
    public static void main(String[] args) {
        System.out.println("=====MODUL 7=====");
        Location location1 = new Location("Kota Jakarta", "Jawa Barat", "Enakku");
        Seller seller1 = new Seller(1, "Butol", "Butol@gmail.com", "081388618382", location1);
        Promo promo1 = new Promo(1, "BER321", 5000, 10000, true);

        ArrayList<Food> food1 = new ArrayList<Food>();
        ArrayList<Food> food2 = new ArrayList<Food>();
        ArrayList<Food> food3 = new ArrayList<Food>();

        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1, "French Fries", seller1, 30000, FoodCategory.Western));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1, "Sushi", seller1, 15000,  FoodCategory.Japanese));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1, "Burger", seller1, 25000, FoodCategory.Western));

        try
        {
            food1.add(DatabaseFood.getFoodById(1));
            food2.add(DatabaseFood.getFoodById(2));
            food3.add(DatabaseFood.getFoodById(3));
        }
        catch (FoodNotFoundException f)
        {
            System.err.println(f.getMessage());
        }



        try {
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Faqih 1", "faqih@ui.ac.id", "PssswordModul7", Calendar.getInstance()));
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Faqih 2", "faqih@ui.ac.id", "PssswordModu7", Calendar.getInstance()));
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Faqih 3", "emailbeda3@email.com", "P@sswordModul6", Calendar.getInstance()));
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Faqih 3", "emailbeda4@email.com", "P@sswordModul6", Calendar.getInstance()));
        } catch (EmailAlreadyExistsException e) {
            System.err.println(e.getMessage());
        }

        try {
            DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId() + 1, "BER321", 10000, 20000, false));
            DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId() + 1, "BER321", 10000, 20000, false));

        } catch (PromoCodeAlreadyExistsException e) {
            System.err.println(e.getMessage());
        }
        try {
            DatabaseInvoice.addInvoice(new CashInvoice(DatabaseInvoice.getLastId() + 1, food2, DatabaseCustomer.getCustomerById(1), 2000));
            DatabaseInvoice.getInvoiceByCustomer(1).get(DatabaseInvoice.getInvoiceByCustomer(1).size() - 1).setTotalPrice();
        }catch(CustomerNotFoundException e)
        {
            System.err.println(e.getMessage());
        }

        try {
            DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId() + 1, food3, DatabaseCustomer.getCustomerById(1)));
            DatabaseInvoice.getInvoiceByCustomer(1).get(DatabaseInvoice.getInvoiceByCustomer(1).size() - 1).setTotalPrice();
        }catch(CustomerNotFoundException e){
            System.err.println(e.getMessage());
        }


        for(Invoice invoice: DatabaseInvoice.getInvoiceDatabase()){
            Thread calculate = new Thread(new PriceCalculator(invoice));
            calculate.start();
        }

        try {
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Tik tac", DatabaseSeller.getSellerById(1), 25000, FoodCategory.Snacks));
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Martabak", DatabaseSeller.getSellerById(1), 25000, FoodCategory.Snacks));
        } catch (SellerNotFoundException e) {
            System.err.println(e.getMessage());
        }

        try {
            DatabaseCustomer.removeCustomer(50);
        } catch (CustomerNotFoundException e) {
            System.err.println(e.getMessage());
        }

        try
        {
            DatabasePromo.getPromoById(999);
        }
        catch (PromoNotFoundException notfound)
        {
            System.out.println(notfound.getMessage() + "\n");
        }

        try
        {
            DatabaseFood.getFoodById(11);
        }
        catch (FoodNotFoundException notfound)
        {
            System.out.println(notfound.getMessage() + "\n");
        }

        try
        {
            DatabaseCustomer.getCustomerById(999);
        }
        catch (CustomerNotFoundException notfound)
        {
            System.out.println(notfound.getMessage() + "\n");
        }

        ArrayList<Food> makan = new ArrayList<>();
        try
        {
            makan.add(DatabaseFood.getFoodById(1));
            makan.add(DatabaseFood.getFoodById(2));
        }
        catch (FoodNotFoundException notfound)
        {
            System.out.println(notfound.getMessage() + "\n");
        }

        try
        {
            DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId() + 1, makan, DatabaseCustomer.getCustomerById(1), promo1));
        }
        catch (CustomerNotFoundException notfound)
        {
            System.out.println(notfound.getMessage() + "\n");
        }

        try
        {
            DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId() + 1, makan, DatabaseCustomer.getCustomerById(2), promo1));
        }
        catch (CustomerNotFoundException notfound)
        {
            System.out.println(notfound.getMessage() + "\n");
        }

        try
        {
            DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId() + 1, makan, DatabaseCustomer.getCustomerById(3), promo1));
        }
        catch (CustomerNotFoundException notfound)
        {
            System.out.println(notfound.getMessage() + "\n");
        }

        for(Invoice invoice : DatabaseInvoice.getInvoiceDatabase()){

            Thread object = new Thread(new PriceCalculator(invoice));
            object.start();

        }

        System.out.println("=============================YANG MASUK DATABASE PROMO============================");
        System.out.println(DatabasePromo.getPromoDatabase());
        System.out.println("=============================YANG MASUK DATABASE SELLER============================");
        System.out.println(DatabaseSeller.getSellerDatabase());
        System.out.println("=============================YANG MASUK DATABASE FOOD============================");
        System.out.println(DatabaseFood.getFoodDatabase());
        System.out.println("=============================YANG MASUK DATABASE CUSTOMER============================");
        System.out.println(DatabaseCustomer.getCustomerDatabase());

        ArrayList<Food> pertama = new ArrayList<Food>();
        try {

            pertama.add(DatabaseFood.getFoodById(1));

        }
        catch(FoodNotFoundException error){

            System.out.println(error.getMessage());

        }

        try {

            DatabaseInvoice.addInvoice(new CashInvoice (DatabaseInvoice.getLastId() + 1, pertama, DatabaseCustomer.getCustomerById(1)));

        }
        catch(CustomerNotFoundException error){

            System.out.println(error.getMessage());

        }

        try {

            DatabaseInvoice.addInvoice(new CashInvoice (DatabaseInvoice.getLastId() + 1, pertama, DatabaseCustomer.getCustomerById(2)));

        }
        catch(CustomerNotFoundException error){

            System.out.println(error.getMessage());

        }

        try {

            DatabaseInvoice.addInvoice(new CashInvoice (DatabaseInvoice.getLastId() + 1, pertama, DatabaseCustomer.getCustomerById(3)));

        }
        catch(CustomerNotFoundException error){

            System.out.println(error.getMessage());

        }

        for(Invoice invoice : DatabaseInvoice.getInvoiceDatabase()){

            Thread object = new Thread(new PriceCalculator(invoice));
            object.start();

        }

        System.out.println("=============================YANG MASUK DATABASE INVOICE============================");
        System.out.println(DatabaseInvoice.getInvoiceDatabase());
    }


}



/*
    public static void main(String[] args) {
        Location location1 = new Location("Jakarta Timur", "Jakarta", "Rukom");
        Seller seller1 = new Seller(1, "Butol", "Butol@gmail.com", "081388618382", location1);

        DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId()+1, "Faqih", "faqih@gmail.com", "Passw0rds", 1999, 3, 10));
        DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId()+1, "Faqih", "faqih@gmail.com", "Passw0rds", 1999, 3, 10));
        DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId()+1, "wito", "wito@gmail.com", "Passw0rds", 1998, 3, 10));

        System.out.println("List Customer:");
        for (Customer customers : DatabaseCustomer.getCustomerDatabase()) {
            System.out.println(customers);
        }

        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1, "French Fries", seller1, 30000, FoodCategory.Western));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1, "Sushi", seller1, 15000,  FoodCategory.Japanese));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1, "Burger", seller1, 25000, FoodCategory.Western));

        System.out.println("List food category Western:");
        for (Food food : DatabaseFood.getFoodByCategory(FoodCategory.Western))
        {
            System.out.println(food);
        }
/*
        ArrayList<Food> food1 = new ArrayList<Food>();
        ArrayList<Food> food2 = new ArrayList<Food>();
        ArrayList<Food> food3 = new ArrayList<Food>();

*/

/*
        DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId()+1, "BER321", 3000, 12000, false));
        DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId()+1, "BER321", 12000, 30000, true));

        System.out.println("\n Daftar Promo: ");
        for (Promo promo : DatabasePromo.getPromoDatabase())
        {
            System.out.println(promo);
        }

        ArrayList<Food> foods1 = new ArrayList<Food>();
        foods1.add(DatabaseFood.getFoodById(1));
        ArrayList<Food> foods2 = new ArrayList<Food>();
        foods2.add(DatabaseFood.getFoodById(2));

        DatabaseInvoice.addInvoice(new CashInvoice(DatabaseInvoice.getLastId()+1, foods1, DatabaseCustomer.getCustomerById(1),10000));
        DatabaseInvoice.getInvoiceByCustomer(1).get(DatabaseInvoice.getInvoiceByCustomer(1).size()-1).setTotalPrice();

        DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId()+1, foods2, DatabaseCustomer.getCustomerById(1)));
        DatabaseInvoice.getInvoiceByCustomer(1).get(DatabaseInvoice.getInvoiceByCustomer(1).size()-1).setTotalPrice();

        for(Invoice invoice1 : DatabaseInvoice.getInvoiceDatabase()) {
            System.out.println(invoice1);
            System.out.println();
        }
        DatabaseInvoice.changeInvoiceStatus(DatabaseInvoice.getInvoiceByCustomer(1).get(DatabaseInvoice.getInvoiceByCustomer(1).size()-1).getId(),InvoiceStatus.Finished);

        DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId()+1, foods2, DatabaseCustomer.getCustomerById(2), DatabasePromo.getPromoByCode("BER321")));
        DatabasePromo.activatePromo(1);

        for(Invoice invoice : DatabaseInvoice.getInvoiceDatabase())
        {
            invoice.setTotalPrice();
            System.out.println(invoice);
            System.out.println();
        }


    }

}
*/
