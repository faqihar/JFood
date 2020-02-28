
/**
 * Write a description of class Seller here.
 *
 * @author Faqih Achmad
 * @version 1.2 (27 feb 2020)
 * 
 */
public class Seller//create class seller
{
    //create variabel in class food
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;
    

    /**
     * Constructor for objects of class Customer
     */
    public Seller(int id, String name, String email, String phoneNumber, Location location)
    {
        // initialise instance variables
 
    }
    
    public int getId()
    {
        return id;
    }
    
     public String getName()
    {
        return name;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    public Location getLocation()
    {
        return location;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    
      public void setLocation(Location location)
    {
        this.location = location;
    }
    
      public void printData()
    {
        System.out.println(name);
    }
  

}
