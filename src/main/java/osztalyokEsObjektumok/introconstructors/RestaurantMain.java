package osztalyokEsObjektumok.introconstructors;

import java.util.Arrays;
import java.util.List;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("The Prince of Wales", 10);
        List<String> menuForToday = Arrays.asList("hamburger", "fish and chips", "salmon");
        restaurant.setMenu(menuForToday);
        System.out.println(restaurant.getCapacity());
        System.out.println(restaurant.getMenu());
        System.out.println(restaurant.getName());
        //System.out.println(restaurant.menu);
    }

}

