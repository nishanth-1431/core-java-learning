/*Problem 13 – Food Ordering System (Runtime Polymorphism)
Create a parent class Food with a method prepare(). Create child classes Pizza, Burger, Biryani, and Dosa that
 override the method. Store all food objects in an array and call prepare() using a loop.
 */
class Food {
    public void prepare() {
        System.out.println("Preparing food...");
    }
}

class Pizza extends Food {
    @Override
    public void prepare() {
        System.out.println("Preparing Pizza.");
    }
}

class Burger extends Food {
    @Override
    public void prepare() {
        System.out.println("Preparing Burger.");
    }
}

class Biryani extends Food {
    @Override
    public void prepare() {
        System.out.println("Preparing Biryani.");
    }
}

class Dosa extends Food {
    @Override
    public void prepare() {
        System.out.println("Preparing Dosa.");
    }
}

public class problem13 {
    public static void main(String[] args) {

        Food[] foods = {
            new Pizza(),
            new Burger(),
            new Biryani(),
            new Dosa()
        };

        for (Food food : foods) {
            food.prepare();
        }
    }
}