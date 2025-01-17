package faqih.jfood;

/**
 * class OngoingInvoiceAlreadyExistsException
 * @author Faqih Achmad
 * @version 7/6/2020
 */

public class OngoingInvoiceAlreadyExistsException extends Exception  {
    private Invoice invoice_error;

    public OngoingInvoiceAlreadyExistsException(Invoice invoice_input){
        super("Ongoing Invoice : ");
        this.invoice_error=invoice_input;
    }

    public String getExMessage(){
        return super.getMessage() + invoice_error + " not found.";
    }
}
