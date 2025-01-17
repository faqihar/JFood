package faqih.jfood;

import java.util.ArrayList;
import java.util.*;

/**
 * class DatabaseFood
 * @author Faqih Achmad
 * @version 7/6/2020
 */

public class DatabaseFood {
    // instance variables - replace the example below with your own
    //merupakan field dari kelas DatabaseFood
    private static ArrayList<Food> FOOD_DATABASE = new ArrayList<>();
    private static int lastId = 0;

    /**
     * Get food database
     * @return FOOD_DATABASE
     */
    public static ArrayList<Food> getFoodDatabase() {
        return FOOD_DATABASE;
    }

    /**
     * Get last id
     * @return lastId
     */
    public static int getLastId() {
        return lastId;
    }

    /**
     * Get food by id.
     * @param id id
     * @return foods
     * @throws FoodNotFoundException the food not found exception
     */
    public static Food getFoodById(int id) throws FoodNotFoundException
    {
        for (Food food : FOOD_DATABASE){
            if(food.getId() == id){
                return food;
            }
        }
        throw new FoodNotFoundException(id);
    }

    /**
     * Get seller by sellerId.
     * @param sellerId id seller
     * @return list
     */
    public static ArrayList<Food> getFoodBySeller(int sellerId) {
        ArrayList<Food> LIST_FOOD_BY_SELLER = new ArrayList<Food>();
        for (Food food : FOOD_DATABASE) {
            if (food.getSeller().getId() == sellerId) {
                LIST_FOOD_BY_SELLER.add(food);

            }
        }
        return LIST_FOOD_BY_SELLER;
    }

    /**
     * Get food by category.
     * @param category category
     * @return list
     */
    public static ArrayList<Food> getFoodByCategory(FoodCategory category) {
        ArrayList<Food> LIST_FOOD_BY_CATEGORY = new ArrayList<Food>();
        for (Food food : FOOD_DATABASE) {
            if (food.getCategory() == category) {
                LIST_FOOD_BY_CATEGORY.add(food);
            }
        }
        return LIST_FOOD_BY_CATEGORY;
    }

    /**
     * Add food.
     * @param food food
     * @return boolean
     */
    public static boolean addFood(Food food) {

        FOOD_DATABASE.add(food);
        lastId = food.getId();
        return true;

    }

    /**
     * Remove food boolean.
     * @param id id
     * @return boolean
     * @throws FoodNotFoundException the food not found exception
     */
    public static boolean removeFood(int id) throws FoodNotFoundException{
        for (Food food : FOOD_DATABASE) {
            if (food.getId() == id) {
                FOOD_DATABASE.remove(food);
                return true;
            }
        }
        throw new FoodNotFoundException(id);
    }
}