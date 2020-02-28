
/**
 * Write a description of class Invoice here.
 *
 * @author Faqih Achmad
 * @version 1.2 (27 feb 2020)
 * 
 */
public class Invoice//create class invoice
{
    /**
     * membuat variabel di class invoice
     * variabel instance
     * private hanya bisa diberikan pada member class
     */
    private int id;
    private int idFood;
    private String date;
    private int totalPrice;
    private Customer customer;
    
    

    /**
     * Constructor for objects of class Customer
     * constructor seperti metode yang dipanggil ketika object di instance
     * nama constructor harus sama dengan class
     *  
     *  @param id berfungsi untuk menginisialisasikan input id baru
     *  @param idFood berfungsi untuk menginisialisasikan input idFood baru
     *  @param date berfungsi untuk menginisialisasikan input date baru
     *  @param totalPrice berfungsi untuk menginisialisasikan totalPrice description baru
     *  @param customer berfungsi untuk menginisialisasikan input customer baru
     */
    public Invoice(int id, int idFood, String date, Customer customer, int totalPrice)
    {
        this.id = id;
        this.idFood = idFood;
        this.date = date;
        this.customer = customer;
        this.totalPrice = totalPrice;// initialise instance variables
 
    }
    
    public int getId()
    {
        return id;
    }
    
     public int getIdFood()
    {
        return idFood;
    }
    
    public String getDate()
    {
        return date;
    }
    
    public int getTotalPrice()
    {
        return totalPrice;
    }
    
    
    public void setId(int id)
    {
        this.id =id;
    }
    
    public void setIdFood(int idFood)
    {
        this.idFood = idFood;
    }
    
    public void setDate(String date)
    {
        this.date = date;
    }
    
    public void setTotalPrice(int totalPrice)
    {
        this.totalPrice = totalPrice;
    }
    
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    
    public void printData()
    {
        System.out.println(totalPrice);
    }
  
}
