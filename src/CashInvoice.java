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
 * Write a description of class CashInvoice here.
 *
 * @author Faqih
 * @version 
 */
public class CashInvoice extends Invoice
{
    // instance variables - replace the example below with your own
    private PaymentType PAYMENT_TYPE=PaymentType.Cash;
    private int deliveryFee;

    /**
     * Constructor for objects of class CashInvoice
     */
    public CashInvoice(int id, Food food, Customer customer, InvoiceStatus invoiceStatus)
    {
        super(id, food, customer, invoiceStatus);
    }

        /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public CashInvoice(int id, Food food, Customer customer, InvoiceStatus invoiceStatus, int deliveryFee)
    {
        super(id, food, customer, invoiceStatus);
        this.deliveryFee=deliveryFee;
    }
    
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }
    
    public int getDeliveryFee()
    {
        return deliveryFee;
    }
    
    public void setDeliveryFee(int deliveryFee)
    {
        this.deliveryFee=deliveryFee;
    }
    
    public void setTotalPrice()
    {
        if(getDeliveryFee()!= 0)
        {super.totalPrice=getFood().getPrice()+getDeliveryFee();}
        else
        {super.totalPrice=getFood().getPrice();}
    }
    
     public String toString()
    {
     
        
        String string = "";
        if(deliveryFee == 0)
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
            "\nDeliveryFee : " + getDeliveryFee() +
            "\nTotal Price: " +super.getTotalPrice() +
            "\nStatus: " +super.getInvoiceStatus() +
            "\nPayment Type: " +PAYMENT_TYPE + "\n");
        }
        System.out.println(string);
        return string;
    }
}