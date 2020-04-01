import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.*;

/**
 * @author Faqih
 * @version 27 Februari 2020
**/
public abstract class Invoice
{
    // instance variables - replace the example below with your own
    /** bagian variable
     */
    private int id;
    private Food food;
    private Calendar date;
    protected int totalPrice;
    private Customer customer;
    private InvoiceStatus invoiceStatus;

    /**
     * Constructor for objects of class Invoice
     * Constructor ialah sebuah method yang namanya sama persis dengan nama class-nya
     * Constructor sendiri berfungsi untuk memberikan nilai awal pada sebuah class ketika class tersebut dibuat dalam bentuk objek pada class lain
     * Parameter yang  digunakan yaitu id, idfood, date, customer, dan totalprice.
     */
    public Invoice(int id, Food food, /*Calendar date,*/ Customer customer, InvoiceStatus invoiceStatus)
    {
        this.id=id;
        this.food=food;
        //this.date=date;
        Date date = new Date();
        this.customer=customer;
        this.invoiceStatus=invoiceStatus;
    }

    /*public void invoice()
    {
    }*/
    
    /** 
     * method getter Id akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter Id untuk Invoice
     */
    public int getId()
    {
        return id;
    }
    
    /** 
     * method getter IdFood akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter IdFood untuk Invoice
     */
    public Food getFood()
    {
        return food;
    }
    
    /** 
     * method getter Date akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter Date untuk Invoice
     */
    public Calendar getDate()
    {
        return date;
    }
    
    /** 
     * method getter TotalPrice akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter TotalPrice untuk Invoice
     */
    public int getTotalPrice()
    {
        return totalPrice;
    }
    
    /** 
     * method getter Customer akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter Customer untuk Invoice
     */
    public Customer getCustomer()
    {
        return customer=customer;
    }
    
    public abstract PaymentType getPaymentType();
    
    public InvoiceStatus getInvoiceStatus()
    {
        return invoiceStatus;
    }
    
    /**
     * method setter Id akan set sebuah nilai sesuai dengan variable
     * Setter Id untuk Invoice
     */
    public void setId(int id)
    {
        this.id=id;
    }
    
    /**
     * method setter IdFoods akan set sebuah nilai sesuai dengan variable
     * Setter IdFoods untuk Invoice
     */
    public void setfood(Food food)
    {
        this.food=food;
    }
    
    /**
     * method setter Date akan set sebuah nilai sesuai dengan variable
     * Setter Date untuk Invoice
     */
    public Calendar setDate(Calendar date)
    {
        return date;
    }
    
    public Calendar setDate(int year, int month, int dayOfMonth)
    {
        return date=new GregorianCalendar(year, month-1, dayOfMonth);
    }
    
    /**
     * method setter TotalPrice akan set sebuah nilai sesuai dengan variable
     * Setter TotalPrice untuk Invoice
     */
    public void setTotalPrice()
    {
        this.totalPrice=totalPrice;
    }
    
    /**
     * method setter Customer akan set sebuah nilai sesuai dengan variable
     * Setter Customer untuk Invoice
     */
    public void setCustomer(Customer customer)
    {
        this.customer=customer;
    }
      
    public void setInvoiceStatus(InvoiceStatus invoiceStatus)
    {
        this.invoiceStatus=invoiceStatus;
    }
    
    /*public abstract String toString()
    {  
         if(deliveryFee<0)
        {
            return
            ("================INVOICE================" +
            "\nID: " +super.getId() +
            "\nFood: " +super.getFood().getName() +
            "\nDate: " +super.getDate() +
            "\nCustomer: " +super.getCustomer().getName() +
            "\nDelivery Fee : " + 0+ 
            "\nTotal Price: " +getFood().getPrice() +
            "\nStatus: " +super.getInvoiceStatus() +
            "\nPayment Type: " +PAYMENT_TYPE + "\n");
            
        }
        else
        {
            
            return
            ("================INVOICE================" +
            "\nID: " +super.getId() +
            "\nFood: " +super.getFood().getName() +
            "\nDate: " +super.getDate() +
            "\nCustomer: " +super.getCustomer().getName() +
            "\nDelivery Fee : " + this.getDeliveryFee() +
            "\nTotal Price: " +super.getTotalPrice() +
            "\nStatus: " +super.getInvoiceStatus() +
            "\nPayment Type: " +PAYMENT_TYPE + "\n");
            
        }
        
    } ;*/
 }
        
    /* /**
     * Untuk mencetak data sesuai dengan value dalam kurung
     *
    public abstract void printData();*/
