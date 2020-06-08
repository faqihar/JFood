package faqih.jfood;

/**
 * class PromoCodeAlreadyExistsException
 * @author Faqih Achmad
 * @version 7/6/2020
 */

public class PromoCodeAlreadyExistsException extends Exception
{
    private Promo promo_error;

    public PromoCodeAlreadyExistsException(Promo promo_input)
    {
        super("Promo Code : ");
        promo_error = promo_input;
    }

    public String getMessage()
    {
        return super.getMessage() + promo_error.getCode() + " not found.";
    }
}