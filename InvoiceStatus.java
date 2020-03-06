
/**
 * Enumeration class InvoiceStatus - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum InvoiceStatus
{
    Ongoing("Ongoing"), Finished("Finished"), Canceled("Canceled");
    
    private String category;
    
    InvoiceStatus(String category)
    {
        this.category = category; 
    }
    
    public String toString()
    {
        return category;
    }
}
