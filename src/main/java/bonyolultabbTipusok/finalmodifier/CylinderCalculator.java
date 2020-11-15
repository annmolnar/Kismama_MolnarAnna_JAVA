package bonyolultabbTipusok.finalmodifier;
import static bonyolultabbTipusok.finalmodifier.CircleCalculator.PI;
public class CylinderCalculator {



    public double calculateVolume(double r, double h){
        return CircleCalculator.PI*r*r*h;
    }

    public double calculateSurfaceArea(double r, double h){
        return CircleCalculator.PI*r*h*2;
    }
}
