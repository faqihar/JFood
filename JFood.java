public class JFood
{
  
    public static void main(String[] args)
    {
        Location location1 = new Location("Jakarta Timur", "Jakarta", "Rukom");
        Seller seller1 = new Seller(1, "Faqih", "faqih@gmail.com", "081388618382", location1);
        Food food1 = new Food(1, "Sosis", seller1, 30000, FoodCategory.Western);
        Food food2 = new Food(2, "Babi Goreng", seller1, 50000, FoodCategory.Western);
        Customer customer1 = new Customer(1, "Butol", "Butol@gmail.com", "butolcantik","27-02-2020");
        Customer customer2 = new Customer(2, "Hans", "Hans@gmail.com", "Hansu","28-02-2020");
        Promo promo1 = new Promo(1, "BER321", 10000, 12000, true);
        //Invoice invoice1 = new Invoice(1, food1.getName(), "28-02-2020", customer1, InvoiceStatus.Finished);
        CashlessInvoice cashlessinvoice3 = new CashlessInvoice(3, food1, "28-10-2020",  customer1, InvoiceStatus.Finished, promo1);
        CashlessInvoice cashlessinvoice2 = new CashlessInvoice(2, food2, "28-10-2020",  customer1, InvoiceStatus.Finished); 

        CashlessInvoice cashlessinvoice1 = new CashlessInvoice(1, food1, "28-10-2020",  customer1, InvoiceStatus.Finished); 


        
        //seller1.getName();
        //System.out.println(seller1.getName());
        //seller1.setName("wito");
        //System.out.println(seller1.getName());
        cashlessinvoice1.setTotalPrice();
        cashlessinvoice2.setTotalPrice();
        cashlessinvoice3.setTotalPrice();
        //food1.printData();
        cashlessinvoice1.printData();
        cashlessinvoice2.printData();
        cashlessinvoice3.printData();
        //invoice1.printData();

    }


}
