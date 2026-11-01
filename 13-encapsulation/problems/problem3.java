/*3.	Food Delivery Application — Restaurant
A food delivery platform needs to maintain information about restaurants.
Create a Restaurant class that stores:
•	Restaurant ID
•	Restaurant name
•	Location
•	Rating
Requirements:
•	Protect the restaurant information from direct access.
•	Allow the application to read the restaurant details.
•	Allow the restaurant name, location, and rating to be updated.
•	Display the complete restaurant information.
•	Use the this keyword where appropriate.
 */
class Restaurant {
    private int restaurantId;
    private String restaurantName;
    private String location;
    private double rating;

    // Getters to read the restaurant information
    int getRestaurantId() {
        return restaurantId;
    }

    String getRestaurantName() {
        return restaurantName;
    }

    String getLocation() {
        return location;
    }

    double getRating() {
        return rating;
    }

    // Update methods to modify the restaurant information
    void updateName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    void updateLocation(String location) {
        this.location = location;
    }

    void updateRating(double rating) {
        this.rating = rating;
    }
}

public class problem3 {
    public static void main(String[] args) {
    Restaurant restaurant = new Restaurant();

    // restaurant.updateRestaurantId(101); this cant be updated cause we didnt create a setter for Restaurant Id
    restaurant.updateName("Anjappar");
    restaurant.updateLocation("Coimbatore");
    restaurant.updateRating(4.5);

    System.out.println("Restaurant ID : " + restaurant.getRestaurantId());
    System.out.println("Name          : " + restaurant.getRestaurantName());
    System.out.println("Location      : " + restaurant.getLocation());
    System.out.println("Rating        : " + restaurant.getRating());
    }
}
