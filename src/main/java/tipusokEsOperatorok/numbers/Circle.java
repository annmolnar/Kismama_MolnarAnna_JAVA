package tipusokEsOperatorok.numbers;

public class Circle {
    double diameter;
    static final double PI = 3.14;

    public Circle(double diameter){
        this.diameter = diameter;
    }

    public double circlePerimeter(double diameter){
        return 2*diameter*PI;
    }

    public double circleArea(double diameter){
        return diameter*diameter*PI;
    }
}
