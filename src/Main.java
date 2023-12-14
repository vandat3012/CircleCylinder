
public class Main {
    public static void main(String[] args) {
        System.out.println("Test Circle");
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.0 , "pink");
        System.out.println(circle);

        System.out.println("Test Cylinder");
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(5.0);
        System.out.println(cylinder);
        cylinder = new Cylinder(2,"blue", 7.0);
        System.out.println(cylinder);
    }
}