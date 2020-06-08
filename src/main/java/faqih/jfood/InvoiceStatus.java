package faqih.jfood;

/**
 * class InvoiceStatus
 * @author Faqih Achmad
 * @version 7/6/2020
 */

public enum InvoiceStatus
{
    Ongoing("Ongoing"),
    Finished("Finished"),
    Cancelled("Canceled");

    private String status;

    InvoiceStatus(String status)
    {
        this.status = status;
    }

    public String toString()
    {
        return this.status;
    }
}
