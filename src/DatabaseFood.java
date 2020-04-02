import java.util.ArrayList;
import java.util.*;
/**
 * Write a description of class DatabaseFood here.
 *
 * @author Faqih Achmad
 * @version 1.2 (27 feb 2020)
 * 
 */
public class DatabaseFood//create class DatabaseFood
{
    /**
     * membuat variabel di class databaseFood
     * variabel instance
     * private hanya bisa diberikan pada member class
     */
    private static ArrayList<Food> FOOD_DATABASE = new ArrayList<Food>();
    private static int LastId = 0;

    public DatabaseFood() {

    }

    public static ArrayList<Food> getFoodDatabase() {
        return FOOD_DATABASE;
    }

    public static int getLastId() {
        return LastId;
    }

    public static Food getFoodById(int id) {
        Food returnValue = null;
        for (Food foodDB : FOOD_DATABASE) {
            if (foodDB.getId() == id) {
                returnValue = foodDB;
            }
        }
        return returnValue;
    }

    public static ArrayList<Food> getFoodBySeller(Seller seller) {
        ArrayList<Food> returnValue = null;
        for (Food foodDB : FOOD_DATABASE) {
            if (foodDB.getSeller() == seller) {
                returnValue.add(foodDB);
            }
        }
        return returnValue;
    }

    public static ArrayList<Food> getFoodByCategory(FoodCategory category) {
        ArrayList<Food> returnValue = null;
        for (Food foodDB : FOOD_DATABASE) {
            if (foodDB.getCategory() == category) {
                returnValue.add(foodDB);
            }
        }
        return returnValue;
    }


    public static boolean addFood(Food food) {
        for (Food foodDB : FOOD_DATABASE)
        {
            if (food.getName().equals(foodDB.getName()) &&
                    food.getCategory().equals(foodDB.getCategory()) &&
                    food.getSeller().equals(foodDB.getSeller()))
            {
                return false;
            }
        }

        FOOD_DATABASE.add(food);
        LastId=food.getId();
        return true;
    }
        public static boolean removeFood(int id)
        {
            boolean returnValue = false;
            for (Food foodDB : FOOD_DATABASE) {
                if (foodDB.getId() == id) {
                    FOOD_DATABASE.remove(id);
                    returnValue = true;
                }
            }
            return returnValue;
        }
}

