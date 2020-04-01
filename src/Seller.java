
/**
 * Write a description of class Seller here.
 *
 * @author Faqih Achmad
 * @version 1.2 (27 feb 2020)
 * 
 */
public class Seller//create class seller
{
    /**
     * membuat variabel di class seller
     * variabel instance
     * private hanya bisa diberikan pada member class
     */
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;
    

    /**
     * Constructor for objects of class Seller
     * constructor seperti metode yang dipanggil ketika object di instance
     * nama constructor harus sama dengan class
     *  
     *  @param id berfungsi untuk menginisialisasikan input id baru
     *  @param name berfungsi untuk menginisialisasikan input name baru
     *  @param email berfungsi untuk menginisialisasikan input email baru
     *  @param phoneNumber berfungsi untuk menginisialisasikan input phoneNumber baru
     *  @param location berfungsi untuk menginisialisasikan input location baru
     */
    public Seller(int id, String name, String email, String phoneNumber, Location location)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;// initialise instance variables
 
    }
    
    /**
     * getter id untuk seller
     * @return id berfungsi untuk mengecek variabel id ke variabel instance
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * getter name untuk seller
     * @return name berfungsi untuk mengecek variabel name ke variabel instance
     */
     public String getName()
    {
        return name;
    }
    
    /**
     * getter email untuk seller
     * @return email berfungsi untuk mengecek variabel email ke variabel instance
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * getter phoneNumber untuk seller
     * @return phoneNumber berfungsi untuk mengecek variabel phoneNumber ke variabel instance
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    /**
     * getter location untuk seller
     * @return location berfungsi untuk mengecek variabel location ke variabel instance
     */
    public Location getLocation()
    {
        return location;
    }
    
    /**
     * setter id untuk seller
     * @param id untuk set ke instance variabel id
     */
    public void setId(int id)
    {
        this.id = id;
    }
    
    /**
     * setter name untuk seller
     * @param name untuk set ke instance variabel name
     */
    public void setName(String name)
    {
        this.name = name;
        
    }
    
    /**
     * setter email untuk seller
     * @param email untuk set ke instance variabel email
     */
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    /**
     * setter phoneNumber untuk seller
     * @param phoneNumber untuk set ke instance variabel phoneNumber
     */
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    
    /**
     * setter location untuk seller
     * @param location untuk set ke instance variabel location
     */
      public void setLocation(Location location)
    {
        this.location = location;
    }

    
      public String toString(){
        return id+","+name+","+email+","+phoneNumber+","+location;
    }
  

}
