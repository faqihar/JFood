
/**
 * Write a description of class Customer here.
 *
 * @author Faqih Achmad
 * @version 1.2 (27 feb 2020)
 * 
 */
public class Customer//create class Customer
{
    // create variabel in class Customer
    private int id;
    private String name;
    private String email;
    private String password;
    private String joinDate;
    
    

    /**
     * Constructor for objects of class Customer
     */
    public Customer(int id, String name, String email, String password, String joinDate)
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
    
    public String getPassword()
    {
        return password;
    }
    
    public String getJoinDate()
    {
        return joinDate;
    }
    
    public void setId(int id)
    {
        this.id =id;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public void setJoinDate(String joinDate)
    {
        this.joinDate = joinDate;
    }
    
    public void printData()
    {
        System.out.println(name);
    }
  

}
