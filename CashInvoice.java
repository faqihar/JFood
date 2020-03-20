import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;
import java.text.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.regex.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

/**
 * Write a description of class CashlessInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CashlessInvoice extends Invoice
{
    // instance variables - replace the example below with your own
  
    private static final PaymentType PAYMENT_TYPE=PaymentType.Cashless;
    private Promo promo;

    /**
     * Constructor for objects of class CashlessInvoice
     */
    public CashlessInvoice(int id, Food food, 
    //Calendar date, 
    Customer customer, InvoiceStatus invoiceStatus)
    {
        super(id, food, 
        //date, 
        customer, invoiceStatus);
    }
    
    public CashlessInvoice(int id, Food food, 
    //Calendar date, 
    Customer customer, InvoiceStatus invoiceStatus, Promo promo)
    {
        super(id, food, 
        //date, 
        customer, invoiceStatus);
        this.promo = promo;
    }
    
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }
    
    public Promo getPromo()
    {
        return promo;
    }
    
    public void setPromo(Promo promo)
    {
        this.promo = promo;
    }
    
    
    public void setTotalPrice()
    {
        if(
        promo!=null &&
        getPromo().getActive() == true && 
        getFood().getPrice() > getPromo().getMinPrice())
        {
        super.totalPrice = getFood().getPrice() - promo.getDiscount();
        }
        else
        {
        super.totalPrice = getFood().getPrice();
        }
    }
    
  
    public String toString()
    {
     
        //if(getPromo().getActive() == true)
       //{
       // System.out.println("Promo: " +    getPromo().getCode());
       // }
        
        String string = "";
        if(promo == null || 
        promo.getActive() == false || 
        getFood().getPrice() < getPromo().getMinPrice())
        {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy");
            LocalDateTime now = LocalDateTime.now(); 
            string=
            ("================INVOICE================" +
            "\nID: " +super.getId() +
            "\nFood: " +super.getFood().getName() +
            "\nDate: " +dtf.format(now)+
            "\nCustomer: " +super.getCustomer().getName() +
            "\nTotal Price: " +getFood().getPrice() +
            "\nStatus: " +super.getInvoiceStatus() +
            "\nPayment Type: " +PAYMENT_TYPE + "\n");
        }
        else
        {
            DateTimeFormatter skrg = DateTimeFormatter.ofPattern("dd MMMM yyyy");
            LocalDateTime now = LocalDateTime.now(); 
            string=
            ("================INVOICE================" +
            "\nID: " +super.getId() +
            "\nFood: " +super.getFood().getName() +
            "\nDate: " +skrg.format(now)+ 
            "\nCustomer: " +super.getCustomer().getName() +
            "\nPromo : " + getPromo().getCode() +
            "\nTotal Price: " +super.getTotalPrice() +
            "\nStatus: " +super.getInvoiceStatus() +
            "\nPayment Type: " +PAYMENT_TYPE + "\n");
        }
        System.out.println(string);
        return string;
    }
    
 
    
    /**public void printData()
    {
     
        //if(getPromo().getActive() == true)
       //{
       // System.out.println("Promo: " +    getPromo().getCode());
       // }
        
       
        if(promo == null || 
        promo.getActive() == false || 
        getFood().getPrice() < getPromo().getMinPrice())
        {
            
            System.out.println("================INVOICE================");
            System.out.println("ID: " +super.getId());
            System.out.println("Food: " +super.getFood().getName());
            System.out.println("Date: " +super.getDate());
            System.out.println("Customer: " +super.getCustomer().getName());
            System.out.println("Total Price: " +getFood().getPrice());
            System.out.println("Status: " +super.getInvoiceStatus());
            System.out.println("Payment Type: " +PAYMENT_TYPE);
            System.out  .println(" ");
        }
        else
        {
            System.out.println("================INVOICE================");
            System.out.println("ID: " +super.getId());
            System.out.println("Food: " +super.getFood().getName());
            System.out.println("Date: " +super.getDate());
            System.out.println("Customer: " +super.getCustomer().getName());
            System.out.println("Promo: " +promo.getCode());
            System.out.println("Total Price: " +getTotalPrice());
            System.out.println("Status: " +super.getInvoiceStatus());
            System.out.println("Payment Type: " +PAYMENT_TYPE);
            System.out.println(" ");
        }
        
    }
    */
    
    
}
