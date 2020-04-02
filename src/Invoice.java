import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.*;
import java.util.*;


/**
 * @author Faqih
 * @version 27 Februari 2020
**/
public abstract class Invoice
{
    //variable yang digunakan pada class Invoice
    private int id;
    //private int idFood;
    private ArrayList<Food> foods;
    private Calendar date;
    protected int totalPrice;
    private Customer customer;
    //private PaymentType paymentType;
    private InvoiceStatus invoiceStatus;

    private SimpleDateFormat tanggal = new SimpleDateFormat("dd MMMM yyyy");

    /**
     * @param
     */
    public Invoice(int id, ArrayList<Food> foods, Customer customer)
    {
        this.id = id;
        this.foods = foods;
        //this.joinDate = Calendar.getInstance();
        this.customer = customer;
        this.totalPrice = totalPrice;
        this.invoiceStatus = invoiceStatus.Ongoing;
    }

    /**
     * @return nilai yang dikembalikan yaitu id
     */
    public int getId()
    {
        return id;
    }

    /**
     * @return nilai yang dikembalikan yaitu idFood
     */
    public ArrayList<Food> getFoods()
    {
        return foods;
    }

    /**
     * @return nilai yang dikembalikan yaitu date
     */
    public Calendar getDate()
    {
        return date;
    }

    /**
     * @return nilai yang dikembalikan yaitu totalPrice
     */
    public int getTotalPrice()
    {
        return totalPrice;
    }

    /**
     * @return nilai yang dikembalikan yaitu customer
     */
    public Customer getCustomer()
    {
        return customer;
    }

    public abstract PaymentType getPaymentType();

    public InvoiceStatus getInvoiceStatus()
    {
        return invoiceStatus;
    }

    /**
     * @param parameter yang digunakan yaitu id
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * @param parameter yang digunakan yaitu idFood
     */
    public void setFoods(ArrayList<Food> foods)
    {
        this.foods = foods;
    }

    /**
     * @param parameter yang digunakan yaitu date
     */
    public void setDate(Calendar date)
    {
        this.date = date;
    }

    public void setDate(int year, int month, int dayOfMonth)
    {
        date = new GregorianCalendar (year, month, dayOfMonth);
    }

    /**
     * @param parameter yang digunakan yaitu totalPrice
     */
    public abstract void setTotalPrice();

    /**
     * @param parameter yang digunakan yaitu customer
     */
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }

    // public abstract void setPaymentType();

    public void setInvoiceStatus(InvoiceStatus status)
    {
        this.invoiceStatus = invoiceStatus;
    }

    /*
    public abstract void printData();

    {
        System.out.println("==========INVOICE==========");
        System.out.println("ID: "+id);
        System.out.println("Food ID: "+idFood);
        System.out.println("Date: "+date);
        System.out.println("Customer: "+getCustomer().getName());
        System.out.println("Total Price: "+totalPrice);
        System.out.println("Status: "+status);

    }
    */
    public abstract String toString();
}