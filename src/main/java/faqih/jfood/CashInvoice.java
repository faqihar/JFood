package faqih.jfood;

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
import java.lang.Object;

/**
 * Write a description of class CashInvoice here.
 *
 * @author Faqih
 * @version 2
 */
public class CashInvoice extends Invoice {
    // instance variables - replace the example below with your own
    private static final PaymentType PAYMENT_TYPE = PaymentType.Cash;
    private int deliveryFee;


    /**
     * Constructor for objects of class CashInvoice
     */
    public CashInvoice(int id, ArrayList<Food> foods, Customer customer) {
        super(id, foods, customer);
    }


    /**
     * An example of a method - replace this comment with your own
     *
     * @paramsample parameter for a method
     * @return the sum of x and y
     */
    public CashInvoice(int id, ArrayList<Food> foods, Customer customer, int deliveryFee) {
        super(id, foods, customer);
        this.deliveryFee = deliveryFee;
    }

    public PaymentType getPaymentType() {
        return PAYMENT_TYPE;
    }

    public int getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(int deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public void setTotalPrice() {
        if(deliveryFee > 0)
        {
            for(Food foods:getFoods()) {
                super.totalPrice += foods.getPrice();
            }
            super.totalPrice += getDeliveryFee();
        }
        else if(deliveryFee == 0)
        {
            for(Food foods:getFoods()) {
                super.totalPrice += foods.getPrice();
            }
        }
    }

    public String toString() {
            String foodName = "";
            for (Food food : getFoods()) {
                foodName += food.getName() + ", ";
            }
            SimpleDateFormat format1 = new SimpleDateFormat("dd MMMM yyyy");
            String date = format1.format(getDate().getTime());
            return "\n================Invoice================" + "\n" +
                    "ID: " + getId() + "\n" +
                    "Name: " + foodName + "\n" +
                    "Date: " + date + "\n" +
                    "Customer: " + getCustomer().getName() + "\n" +
                    "Delivery Fee: " + getDeliveryFee() + "\n" +
                    "Total Price: " + totalPrice + "\n" +
                    "Status: " + getInvoiceStatus() + "\n" +
                    "Payment Type: " + getPaymentType() + "\n";
    }

}