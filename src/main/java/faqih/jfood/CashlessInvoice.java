package faqih.jfood;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;
import java.text.*;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * class CashlessInvoice
 * @author Faqih Achmad
 * @version 7/6/2020
 */
public class CashlessInvoice extends Invoice
{
    // instance variables - replace the example below with your own
    private static final PaymentType PAYMENT_TYPE=PaymentType.Cashless;
    private Promo promo;

    /**
     * Constructor for objects of class CashlessInvoice
     * @param id id
     * @param foods foods
     * @param customer customer
     */
    public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer)
    {
        // initialise instance variables
        super(id, foods, customer);
    }

    /**
     * Constructor for objects of class CashlessInvoice
     * @param id id
     * @param foods foods
     * @param customer customer
     * @param promo promo
     */
    public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer, Promo promo)
    {
        super(id, foods, customer);
        this.promo=promo;
    }

    /**
     * Get payment type
     * @return PAYMENT_TYPE
     */
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }

    /**
     * Get promo
     * @return promo
     */
    public Promo getPromo()
    {
        return promo;
    }

    /**
     * Set promo
     * @param  promo promo
     */
    public void setPromo(Promo promo)
    {
        this.promo=promo;
    }

    /**
     * Set total price
     */
    public void setTotalPrice() {
        for(Food foods: getFoods())
        {
            if ((promo != null) && (promo.getActive() == true) && (foods.getPrice() >= promo.getMinPrice())) {
                super.totalPrice += foods.getPrice() - promo.getDiscount();
            } else {
                super.totalPrice += foods.getPrice();
            }
        }
    }

    /**
     * Method toString
     */
    public String toString(){
        int tempPrice = 0;
        String foodName = "";
        for (Food food : getFoods())
        {
            tempPrice += food.getPrice();
            foodName += food.getName() + ", ";
        }
        SimpleDateFormat format1 = new SimpleDateFormat("dd MMMM yyyy");
        String date = format1.format(getDate().getTime());
        if (getPromo() != null && getPromo().getActive() == true && tempPrice > getPromo().getMinPrice())
        {
            return "\n================Invoice================" + "\n" +
                    "ID: " + getId() + "\n" +
                    "Name: " + foodName + "\n" +
                    "Date: " + date + "\n" +
                    "Customer: " + getCustomer().getName() + "\n" +
                    "Promo: " + getPromo().getCode() + "\n" +
                    "Total Price: " + totalPrice + "\n" +
                    "Status: " + getInvoiceStatus() + "\n" +
                    "Payment Type: " + getPaymentType() + "\n";
        }
        else
        {
            return "\n================Invoice================" + "\n" +
                    "ID: " + getId() + "\n" +
                    "Name: " + foodName + "\n" +
                    "Date: " + date + "\n" +
                    "Customer: " + getCustomer().getName() + "\n" +
                    "Total Price: " + totalPrice + "\n" +
                    "Status: " + getInvoiceStatus() + "\n" +
                    "Payment Type: " + getPaymentType() + "\n";
        }
    }
}
