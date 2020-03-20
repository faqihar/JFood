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
 * @author Faqih
 * @version 
 */
public class CashlessInvoice extends Invoice
{
    // instance variables - replace the example below with your own
    private PaymentType PAYMENT_TYPE=PaymentType.Cashless;
    private Promo promo;

    /**
     * Constructor for objects of class CashlessInvoice
     */
    public CashlessInvoice(int id, Food food, Customer customer,InvoiceStatus invoiceStatus)
    {
        // initialise instance variables
        super(id, food, customer, invoiceStatus);
    }
    
        /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public CashlessInvoice(int id, Food food, Customer customer, InvoiceStatus invoiceStatus, Promo promo)
    {
        super(id, food, customer, invoiceStatus);
        this.promo=promo;
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
        this.promo=promo;
    }
    
    public void setTotalPrice()
    {
        if (getPromo() != null && getPromo().getActive() == true && getFood().getPrice() > 
        getPromo().getMinPrice())
        {
            this.totalPrice = getFood().getPrice() - getPromo().getDiscount();
        }
        
        else
        {
            this.totalPrice = getFood().getPrice();
        }
    }
    
    
     public String toString()
    {

        
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
}
