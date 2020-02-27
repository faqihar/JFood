
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Location
{
    // instance variables - replace the example below with your own
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
