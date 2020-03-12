/**
 * Write a description of class CashlessInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CashlessInvoice extends Invoice
{
    // instance variables - replace the example below with your own
    private PaymentType PAYMENT_TYPE;
    private Promo promo;
    private Food food;

    public CashlessInvoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus, Promo promo)
    {
        super(id, food, date, customer, invoiceStatus);
        this.PAYMENT_TYPE = PAYMENT_TYPE;
        /*
        this.id = id;
        this.date = date;
        this.customer = customer;
        this.invoiceStatus = invoiceStatus;
        */
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
        if(getPromo().getActive() == true && getFood().getPrice() > getPromo().getMinPrice())
        {
            this.totalPrice=getFood().getPrice()-getPromo().getDiscount();
        }
        
        else
        {
            this.totalPrice=getFood().getPrice();
        }
    }
    
    public void printData()
    {
        System.out.println("=====INVOICE======");
        System.out.println("ID:" +super.getFood().getId());
        System.out.println("Food:" +getFood().getName());
        System.out.println("Date:" +super.getDate());
        System.out.println("Customer:" +getCustomer().getName());
        System.out.println("Total Price:" +totalPrice);
        System.out.println("Invoice Status:" +super.getInvoiceStatus().Ongoing);
        System.out.println(totalPrice);
    }
}
