package faqih.jfood;

import java.util.*;

/**
 * class Invoice
 * @author Faqih
 * @version 07/6/2020
 */

public abstract class Invoice
{
    private int id;
    private ArrayList<Food> foods;
    private Calendar date;
    protected int totalPrice;
    private Customer customer;
    private PaymentType paymentType;
    private InvoiceStatus status;

    /**
     * Constructor for objects of class Invoice
     * @param id invoice's id
     * @param foods invoice's food
     * @param customer invoice's customer
     */
    public Invoice(int id, ArrayList<Food> foods, Customer customer)
    {
        this.id = id;
        this.foods = foods;
        this.date = Calendar.getInstance();
        this.customer = customer;
        this.status = InvoiceStatus.Ongoing;
    }

    /**
     * Get id
     * @return id
     */
    public int getId()
    {
        return id;
    }

    /**
     * Get food
     * @return foods
     */
    public ArrayList<Food> getFoods()
    {
        return foods;
    }

    /**
     * Get date
     * @return date
     */
    public Calendar getDate()
    {
        return date;
    }

    /**
     * Get total price
     * @return totalPrice
     */
    public int getTotalPrice()
    {
        return totalPrice;
    }

    /**
     * Get customer
     * @return customer
     */
    public Customer getCustomer()
    {
        return customer;
    }

    public abstract PaymentType getPaymentType();

    /**
     * Get invoice status
     * @return status
     */
    public InvoiceStatus getInvoiceStatus()
    {
        return status;
    }

    /**
     * Set id
     * @param id id
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * Set food
     * @param foods foods
     */
    public void setFoods(ArrayList<Food> foods)
    {
        this.foods = foods;
    }

    /**
     * Set date
     * @param year year
     * @param month month
     * @param dayOfMonth day
     */
    public void setDate(int year, int month, int dayOfMonth)
    {
        this.date.set(year, month, dayOfMonth);
    }

    /**
     * Set total price
     */
    public abstract void setTotalPrice();

    /**
     * Set customer
     * @param customer customer
     */
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }

    /**
     * Set invoice status
     * @param status status
     */
    public void setInvoiceStatus(InvoiceStatus status)
    {
        this.status = status;
    }

    /**
     * Method toString
     */
    public abstract String toString();
}