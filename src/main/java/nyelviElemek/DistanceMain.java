package nyelviElemek;

import org.w3c.dom.ls.LSOutput;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance(5.7, true);
        System.out.println(distance.getDistanceInKm());
        System.out.println(distance.isExact());

        int x = (int) distance.getDistanceInKm();
        System.out.println(x);
    }






}
