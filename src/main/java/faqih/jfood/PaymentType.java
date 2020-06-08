

/**
 * class PaymentType
 * @author Faqih Achmad
 * @version 7/6/2020
 */
public enum PaymentType
{
    Cashless("Cashless"), Cash("Cash");
    
    private String paymentType;
    
    PaymentType(String paymentType)
    {
        this.paymentType = paymentType;
    }
    
    public String toString()
    {
        return paymentType;
    }
}
