
/**
 * Write a description of class Location here.
 *
 * @author Faqih Achmad
 * @version 1.2 (27 feb 2020)
 * 
 */
public class Location//create class Location
{
    // create variabel in class location
    private String province;
    private String description;
    private String city;
    
    

    /**
     * Constructor for objects of class Customer
     */
    public Location(String city, String province, String description)
    {
        // initialise instance variables
 
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
