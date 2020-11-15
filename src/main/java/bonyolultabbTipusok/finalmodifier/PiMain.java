package bonyolultabbTipusok.finalmodifier;
import static bonyolultabbTipusok.finalmodifier.CircleCalculator.PI;
public class PiMain {
    public static void main(String[] args) {
        CircleCalculator circle = new CircleCalculator();
        System.out.println(circle.calculateArea(3));
        System.out.println(circle.calculatePerimeter(3));

        CylinderCalculator cylinder = new CylinderCalculator();
        System.out.println(cylinder.calculateSurfaceArea(3,5));
        System.out.println(cylinder.calculateVolume(3,5));
        System.out.println(CircleCalculator.PI);
    }
}
