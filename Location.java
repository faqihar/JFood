
/**
 * Write a description of class Location here.
 *
 * @author Faqih Achmad
 * @version 1.2 (27 feb 2020)
 * 
 */
public class Location//create class Location
{
    /**
     * membuat variabel di class location
     * variabel instance
     * private hanya bisa diberikan pada member class
     */
    private String province;
    private String description;
    private String city;
    
    

    /**
     * Constructor for objects of class Customer
     * constructor seperti metode yang dipanggil ketika object di instance
     * nama constructor harus sama dengan class
     *  
     *  @param province berfungsi untuk menginisialisasikan input province baru
     *  @param description berfungsi untuk menginisialisasikan input description baru
     *  @param city berfungsi untuk menginisialisasikan input city baru
    */
    public Location(String city, String province, String description)
    {
        this.city = city;
        this.province = province;
        this.description = description;// initialise instance variables
 
    }
    
    
    public String getProvince()
    {
        return province;
    }
    
     public String getCity()
    {
        return city;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    
 
    
    public void setProvince(String province)
    {
        this.province = province;
    }
    
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    
    public void printdata()
    {
        System.out.println(province);
    }
  

}
