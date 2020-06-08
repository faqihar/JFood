package faqih.jfood;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;
import java.text.*;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * class CashInvoice
 * @author Faqih Achmad
 * @version 7/6/2020
 */
public class CashInvoice extends Invoice {
    // instance variables - replace the example below with your own
    private static final PaymentType PAYMENT_TYPE = PaymentType.Cash;
    private int deliveryFee;

    /**
     * Constructor for objects of class CashInvoice
     * @param id id
     * @param foods foods
     * @param customer customer
     */
    public CashInvoice(int id, ArrayList<Food> foods, Customer customer) {
        super(id, foods, customer);
    }

    /**
     * Constructor for objects of class CashInvoice
     * @param id id
     * @param foods foods
     * @param customer customer
     * @param deliveryFee delivery fee
     */
    public CashInvoice(int id, ArrayList<Food> foods, Customer customer, int deliveryFee) {
        super(id, foods, customer);
        this.deliveryFee = deliveryFee;
    }

    /**
     * Get payment type
     * @return PAYMENT_TYPE
     */
    public PaymentType getPaymentType() {
        return PAYMENT_TYPE;
    }

    /**
     * Get delivery fee
     * @return deliveryFee
     */
    public int getDeliveryFee() {
        return deliveryFee;
    }

    /**
     * Set delivery fee
     * @param deliveryFee delivery fee
     */
    public void setDeliveryFee(int deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    /**
     * Set total price
     */
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

    /**
     * Method toString
     */
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