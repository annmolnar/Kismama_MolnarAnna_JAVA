package trainingSolutions.point;

public class CoordinateMain {
    public static void main(String[] args) {
        Point point1=new Point(1.0,3.0);
        Point point2=new Point(2.0,6.0);
        Point point3=new Point(3.0,9.0);

        Triangle triangle = new Triangle(point1, point2, point3);

        System.out.println(triangle.getPoint1());
        System.out.println(triangle.getPoint2());
        System.out.println(triangle.getPoint3());
        System.out.println(point1.getX()+", " + point1.getY());
        System.out.println(point2.getX()+", " + point2.getY());
        System.out.println(point3.getX()+", " + point3.getY());
    }




}
