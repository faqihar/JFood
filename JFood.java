public class JFood
{
  
    public static void main(String[] args)
    {
        Location location1 = new Location("Jakarta Timur", "Jakarta", "Rukom");
        Seller seller1 = new Seller(1, "Faqih", "faqih@gmail.com", "081388618382", location1);
        Food food1 = new Food(1, "Sosis", seller1, 12000, FoodCategory.Western);
        Customer customer1 = new Customer(1, "Butol", "Butol@gmail.com", "butolcantik","27-02-2020");
        Invoice invoice1 = new Invoice(1, food1.getId(), "28-02-2020", customer1, food1.getPrice(), InvoiceStatus.Finished);
        
        //seller1.getName();
        //System.out.println(seller1.getName());
        //seller1.setName("wito");
        //System.out.println(seller1.getName());
        
        food1.printData();
        invoice1.printData();

    }


}
