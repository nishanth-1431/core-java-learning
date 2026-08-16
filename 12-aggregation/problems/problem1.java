/* 1. Food Delivery App — Restaurant & Menu
A food delivery application has Restaurant and Menu classes.
•	A restaurant has a menu. 
•	A menu can exist independently of a restaurant. 
•	Create classes and demonstrate the relationship. 
•	Add methods to display restaurant details and menu items. 
 */
class Menu {

    String itemName;
    double price;

    void displayMenu() {
        System.out.println("Menu Item: " + itemName);
        System.out.println("Price: Rs. " + price);
    }
}

class Restaurant {

    String restaurantName;
    Menu menu; // Restaurant HAS-A Menu

    void displayRestaurant() {
        System.out.println("Restaurant: " + restaurantName);
        menu.displayMenu();
    }
}

public class problem1 {

    public static void main(String[] args) {

        Menu menu = new Menu();

        menu.itemName = "Chicken Burger";
        menu.price = 150;

        Restaurant restaurant = new Restaurant();

        restaurant.restaurantName = "Food Hub";
        restaurant.menu = menu;

        restaurant.displayRestaurant();
    }
}
