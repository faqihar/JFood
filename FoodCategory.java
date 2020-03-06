/**
 * Enumeration class FoodCategory - write a description of the enum class here
 *
 * @author faqih achmad
 * @version 
 */
public enum FoodCategory
{
    Beverages("Beverages"), Coffe("Coffe"), Western("Western"), Snacks("Snacks"), Rice("Rice"), Noddles("Noodles"), Bakery("Bakery"), Japanese("Japanese");
    
    private String category;
    
    FoodCategory(String category)
    {
        this.category = category; 
    }
    
    public String toString()
    {
        return category;
    }
}
