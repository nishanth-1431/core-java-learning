/* 13. Food Delivery System
Topics Used: Multilevel Inheritance
Hierarchy: Restaurant → FastFood → PizzaShop
Restaurant
  Fields:    one field
  Methods:   one method
FastFood
  Fields:    one field
  Methods:   one method
PizzaShop
  Fields:    one field
  Methods:   one method
 */
class Restaurant {
    String restaurantName = "Domino's";

    void showRestaurant() {
        System.out.println("Restaurant Name : " + restaurantName);
    }
}

class FastFood extends Restaurant {
    String foodType = "Fast Food";

    void showFoodType() {
        System.out.println("Food Type : " + foodType);
    }
}

class PizzaShop extends FastFood {
    String pizzaName = "Margherita Pizza";

    void showPizza() {
        System.out.println("Pizza Name : " + pizzaName);
    }
}

public class problem13 {
    public static void main(String[] args) {

        PizzaShop shop = new PizzaShop();

        shop.showRestaurant();
        shop.showFoodType();
        shop.showPizza();
    }
}