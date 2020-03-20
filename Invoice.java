import java.util.ArrayList;
import java.util.Calendar;

/**
 * Write a description of class Invoice here.
 *
 * @author Faqih Achmad
 * @version 1.2 (27 feb 2020)
 * 
 */
public abstract class Invoice//create class invoice
{
    /**
     * membuat variabel di class invoice
     * variabel instance
     * private hanya bisa diberikan pada member class
     */
    private int id;
    private Food food;
    private Calendar date;
    protected int totalPrice;
    private Customer customer;
    private InvoiceStatus invoiceStatus;
    
    

    /**
     * Constructor for objects of class Customer
     * constructor seperti metode yang dipanggil ketika object di instance
     * nama constructor harus sama dengan class
     *  

     */
    public Invoice(int id, Food food, Calendar date, Customer customer, InvoiceStatus invoiceStatus)
    {
        this.id = id;
        this.food = food;
        this.date = date;
        this.customer = customer;
        this.totalPrice = totalPrice;// initialise instance variables
        this.invoiceStatus = invoiceStatus;
 
    }
    
    public int getId()
    {
        return id;
    }
    
     public Food getFood()
    {
        return food;
    }
    
    public Calendar getDate()
    {
        return date;
    }
    
    public int getTotalPrice()
    {
        return totalPrice;
    }
    
    public Customer getCustomer()
    {
        return customer;
    }
    
    public abstract PaymentType getPaymentType();
    
    
     public InvoiceStatus getInvoiceStatus()
    {
        return invoiceStatus;
    }
    
    public void setId(int id)
    {
        this.id =id;
    }
    
    public void setFood(Food food)
    {
        this.food = food;
    }
    
    public void setDate(Calendar date)
    {
        this.date = date;
    }
    
    public void setDate(int year, int month, int dayOfMonth)
    {
        this.date = date;
    }
    
    public abstract void setTotalPrice();
    
    
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    
   
    
    public void setInvoiceStatus(InvoiceStatus status)
    {
        this.invoiceStatus = invoiceStatus;
    }
    
   public String toString()
    {  
          return"ID:  "+id+"\nFood: "+food+"\nDate: "+date+"\nTotal Price: "+totalPrice+"\nCustomer"+customer+"\nInvoice Status:"+invoiceStatus;
    }
    /* public void printData()
    {
        
    }
    /*{
        System.out.println("=====INVOICE======");
        System.out.println("ID:" +id);
        System.out.println("Food:" +food);
        System.out.println("Date:" +date);
        System.out.println("Customer:" +getCustomer().getName());
        System.out.println("Total Price:" +totalPrice);
        System.out.println("Invoice Status:" +invoiceStatus);
        System.out.println(totalPrice);
    }
  */
}
