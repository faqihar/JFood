import java.util.ArrayList;
import java.lang.reflect.Array;

/**
 * Write a description of class DatabaseFood here.
 *
 * @author Faqih Achmad
 * @version 1.2 (27 feb 2020)
 *
 */
public class DatabaseInvoice{
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<>();
    private static int lastId = 0;

    public static ArrayList<Invoice> getInvoiceDatabase(){
        return INVOICE_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Invoice getInvoiceById(int id) throws InvoiceNotFoundException{
        for(Invoice invoice : INVOICE_DATABASE){
            if(invoice.getId() == id){
                return invoice;
            }
        }
        throw new InvoiceNotFoundException(id);
    }

    public static ArrayList<Invoice> getInvoiceByCustomer(int customerId) {
        ArrayList<Invoice> LIST_INVOICE_BY_CUSTOMER = new ArrayList <Invoice>();
        for (Invoice invoice : INVOICE_DATABASE) {
            if (invoice.getCustomer().getId() == customerId) {
                LIST_INVOICE_BY_CUSTOMER.add(invoice);

            }
        }
        if (LIST_INVOICE_BY_CUSTOMER == null)
        {
            return null;
        } else
        {
            return LIST_INVOICE_BY_CUSTOMER;
        }
    }

    public static boolean addInvoice(Invoice invoice) throws OngoingInvoiceAlreadyExistsException
    {
        int customerId = invoice.getCustomer().getId();
        for (Invoice _invoice : INVOICE_DATABASE) {
            if (_invoice.getCustomer().getId() == customerId && _invoice.getInvoiceStatus() == InvoiceStatus.Ongoing){
                throw new OngoingInvoiceAlreadyExistsException(invoice);
            }
        }
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }


    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus)
    {
        for(Invoice invoice:INVOICE_DATABASE)
        {
            if (id == invoice.getId() && invoice.getInvoiceStatus() == InvoiceStatus.Ongoing)
            {
                invoice.setInvoiceStatus(invoiceStatus);
                return true;
            }
        }
        return false;
    }

    public static boolean removeInvoiceStatus(int id) throws InvoiceNotFoundException{
        for(Invoice struc : INVOICE_DATABASE){
            if(struc.getId() == id){
                INVOICE_DATABASE.remove(struc);
                return true;
            }
        }
        throw new InvoiceNotFoundException(id);
    }

}