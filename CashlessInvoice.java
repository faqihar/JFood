
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;
import java.text.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.*;

/**
 * This is class CashlessInvoice.
 *
 * @author Faqih
 * @version 12-03-2020
 */
public class CashlessInvoice extends Invoice
//Create the class CashlessInvoice
{
 /* Below is used to
   * declare the variables
   * of the CashlessInvoice
   */
 private PaymentType PAYMENT_TYPE = PaymentType.Cashless;
 private Promo promo;

 public CashlessInvoice(int id, Food food,
 Customer customer, InvoiceStatus invoiceStatus)
 {
     super(id, food, customer, invoiceStatus);
 }
 
 public CashlessInvoice(int id, Food food,
 Customer customer, InvoiceStatus invoiceStatus, Promo promo)
 {
     super(id, food, customer, invoiceStatus);
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
     promo != null &&
     getPromo().getActive() == true &&
     getFood().getPrice() > getPromo().getMinPrice())
     {
         this.totalPrice = getFood().getPrice()-getPromo().getDiscount();
     }
     else
     {
         this.totalPrice = getFood().getPrice();
     }
 }
 
 /*
 public void printData()
 {
     if(
     promo != null &&
     getPromo().getActive() == true &&
     getFood().getPrice() > getPromo().getMinPrice())
     {
         System.out.println("=======INVOICE=======");
         System.out.println("ID: "+getId());
         System.out.println("Food: "+getFood().getName());
         System.out.println("Date: "+getDate());
         System.out.println("Customer: "+getCustomer().getName());
         System.out.println("Code: "+promo.getCode());
         System.out.println("Total Price: " +totalPrice);
         System.out.println("Status: "+getInvoiceStatus());
         System.out.println("Payment Type: "+PAYMENT_TYPE);
     }
     else
     {
         System.out.println("=======INVOICE=======");
         System.out.println("ID: "+getId());
         System.out.println("Food: "+getFood().getName());
         System.out.println("Date: "+getDate());
         System.out.println("Customer: "+getCustomer().getName());
         System.out.println("Total Price: " +totalPrice);
         System.out.println("Status: "+getInvoiceStatus());
         System.out.println("Payment Type: "+PAYMENT_TYPE);
     }
 }
 */

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
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy");
            LocalDateTime now = LocalDateTime.now(); 
            string=
            ("================INVOICE================" +
            "\nID: " +super.getId() +
            "\nFood: " +super.getFood().getName() +
            "\nDate: " +dtf.format(now)+ 
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