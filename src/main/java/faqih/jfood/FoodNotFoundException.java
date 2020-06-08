package faqih.jfood;

/**
 * class FoodNotFoundException
 * @author Faqih Achmad
 * @version 7/6/2020
 */

public class FoodNotFoundException extends Exception {
    private int food_error;

    public FoodNotFoundException(int food_input) {
        super("Food ID : ");
        this.food_error = food_input;
    }

    public String getMessage()
    {
        return super.getMessage() + food_error + " not found.";
    }
}
