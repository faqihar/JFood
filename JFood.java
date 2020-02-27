public class JFood
{
  
    public static void main(String[] args)
    {
        Location location1 = new Location("Jakarta Timur", "Jakarta", "Rukom");
        System.out.println(location1);
        
        Seller seller1 = new Seller(1, "Faqih", "faqih@gmail.com", "081388618382", location1);
        System.out.println(seller1);
        
        Food food1 = new Food(1, "Sosis", seller1, 12000, "enak");
        System.out.println(food1);
        
        Customer customer1 = new Customer(1, "Butol", "Butol@gmail.com", "butolcantik","27-02-2020");
        System.out.println(customer1);
        
        Invoice invoice1 = new Invoice(1, 1, "28-02-2020", customer1, 12000);
        System.out.println(invoice1);
    }


}
