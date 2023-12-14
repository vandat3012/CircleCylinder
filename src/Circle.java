public class Circle {
    private double radius = 1.0;
    private String filled = "red";

    public Circle() {
    }
    public Circle(double radius, String filled) {
        this.radius = radius;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getFilled() {
        return filled;
    }
    public void setFilled(String filled) {
        this.filled = filled;
    }
    public double getArea() {
        return radius * radius * Math.PI ;
    }
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                " radius=" + radius +
                ", filled='" + filled + '\'' +
                " Area =  " + getArea() +
                " Perimeter = " + getPerimeter()+
                '}';
    }
}
