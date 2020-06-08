package faqih.jfood;
/**
 * class Promo
 * @author Faqih Achmad
 * @version 7/6/2020
 */

public class Promo//create class promo
{
    /**
     * membuat variabel di class seller
     * variabel instance
     * private hanya bisa diberikan pada member class
     */
    private int id;
    private String code;
    private int discount;
    private int minPrice;
    private boolean active;
    

    /**
     * Constructor for objects of class Seller
     * constructor seperti metode yang dipanggil ketika object di instance
     * nama constructor harus sama dengan class
     *  
     */
    public Promo(int id, String code, int discount, int minPrice, boolean active)
    {
        this.id = id;
        this.code = code;
        this.discount = discount;
        this.minPrice = minPrice;
        this.active = active;// initialise instance variables
 
    }
    
    /**
 
     */
    public int getId()
    {
        return id;
    }
    
    /**
     
     */
     public String getCode()
    {
        return code;
    }
    
    /**
    
     */
    public int getDiscount()
    {
        return discount;
    }
    
    /**
    
     */
    public int getMinPrice()
    {
        return minPrice;
    }
    
    /**
    
     */
    public boolean getActive()
    {
        return active;
    }
    
    /**

     */
    public void setId(int id)
    {
        this.id = id;
    }
    
    /**
    
     */
    public void setCode(String code)
    {
        this.code = code;
    }
    
    /**
     
     */
    public void setDiscount(int discount)
    {
        this.discount = discount;
    }
    
    /**
    r
     */
    public void setMinPrice(int minPrice)
    {
        this.minPrice = minPrice;
    }
    
    /**
    
     */
      public void setActive(boolean active)
    {
        this.active = active;
    }

     public String toString(){
         return "=========Promo========\n" +
                 "Id : " + getId() + "\n" +
                 "Code : " + getCode() + "\n"+
                 "Discount : " + getDiscount() + "\n"+
                 "MinPrice: "  +  getMinPrice() + "\n"+
                 "ActiveStatus : " +  getActive() + "\n"+"\n";
    }
  
}
