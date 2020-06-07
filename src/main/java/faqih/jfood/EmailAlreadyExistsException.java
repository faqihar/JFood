package faqih.jfood;

/**
 * class EmailAlreadyExistsException
 * @author  Faqih
 * @version 7/6/2020
 */

public class EmailAlreadyExistsException extends Exception {
    private Customer customer_error;

    /**
     * Constructor for objects of class EmailAlreadyExistsExceptionn
     * @param customer_input customer input
     */
    public EmailAlreadyExistsException(Customer customer_input) {
        super("Customer Email : ");
        this.customer_error = customer_input;
    }

    /**
     * Get message
     * @return error message
     */
    @Override
    public String getMessage()
    {
        return super.getMessage() + customer_error.getEmail() + " already exists";
    }
}
