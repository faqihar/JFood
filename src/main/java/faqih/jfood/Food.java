package faqih.jfood;
/**
 * Write a description of class Food here.
 *
 * @author Faqih Achmad
 * @version 1.2 (27 feb 2020)
 * 
 */
public class Food //create class food
{
    /**
     * membuat variabel di class food
     * variabel instance
     * private hanya bisa diberikan pada member class
     */
    private int id;
    private String name;
    private Seller seller;
    private int price;
    private FoodCategory category;
    
    

    /**
     *  Constructor untuk object class Food
     *  constructor seperti metode yang dipanggil ketika object di instance
     *  nama constructor harus sama dengan class
     *  
     *  @param id berfungsi untuk menginisialisasikan input id baru
     *  @param name berfungsi untuk menginisialisasikan input name baru
     *  @param seller berfungsi untuk menginisialisasikan input seller baru
     *  @param price berfungsi untuk menginisialisasikan input price baru
     *  @param category berfungsi untuk menginisialisasikan input category baru
     *  
     */
    public Food(int id, String name, Seller seller, int price, FoodCategory category)
    {
        this.id = id;
        this.name = name;
        this.seller = seller;
        this.price = price;
        this.category = category;// initialise instance variables
 
    }
    
    /**
     * getter id untuk food
     * @return id berfungsi untuk mengecek variabel id ke variabel instance
     */
    
    public int getId()
    {
        return id;
    }
    
    /**
     * getter name untuk food
     * @return name berfungsi untuk mengecek variabel name ke variabel instance
     */
    
     public String getName()
    {
        return name;
    }
    
    /**
     * getter seller untuk food
     * @return seller berfungsi untuk mengecek variabel seller ke variabel instance
     */
    
    public Seller getSeller()
    {
        return seller;
    }
    
    /**
     * getter price untuk food
     * @return price berfungsi untuk mengecek variabel price ke variabel instance
     */
    
    public int getPrice()
    {
        return price;
    }
    
    /**
     * getter category untuk food
     * @return category berfungsi untuk mengecek variabel category ke variabel instance
     */
    
    public FoodCategory getCategory()
    {
        return category;
    }
    
    /**
     * setter id untuk food
     * @param id untuk set ke instance variabel id
     */
    public void setId(int id)
    {
        this.id = id;
    }
    
    /**
     * setter name untuk food
     * @param name untuk set ke instance variabel name
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * setter seller untuk food
     * @param seller untuk set ke instance variabel seller
     */
      public void setSeller(Seller seller)
    {
        this.seller = seller;
    }
    
    /**
     * setter price untuk food
     * @param price untuk set ke instance variabel price
     */
    public void setPrice(int price)
    {
        this.price = price;
    }
    
    /**
     * setter category untuk food
     * @param category untuk set ke instance variabel category
     */
    public void setCategory(FoodCategory category)
    {
        this.category = category;
    }
    
    public void printData()
    {
        System.out.println("==========FOOD========");
        System.out.println("ID:" +id);
        System.out.println("Name:" +name);
        System.out.println("Seller:" +getSeller().getName());
        System.out.println("City:" +getSeller().getLocation().getCity());
        System.out.println("Price:" +price);
        System.out.println("Category:" +category);
        
    }
    
      public String toString(){
          return "==========FOOD==========" +
                  "\nId = " + getId() +
                  "\nName = " + getName() +
                  "\nSeller = " + getSeller().getName() +
                  "\nCity = " + seller.getLocation().getCity() +
                  "\nPrice = " + getPrice() +
                  "\nCategory = " + getCategory().toString() + "\n";
      }

}
