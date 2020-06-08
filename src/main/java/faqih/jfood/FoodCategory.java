package faqih.jfood;

/**
 * class FoodCategory
 * @author Faqih Achmad
 * @version 7/6/2020
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
