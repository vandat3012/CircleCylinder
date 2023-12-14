public class Cylinder extends Circle{
    private double height = 1.0;
    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String filled, double height) {
        super(radius, filled);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double getPerimeter () {
        return super.getPerimeter() * height;
    }
    @Override
    public double getArea () {
        return super.getPerimeter() * (height + getRadius());
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height
                + super.toString() +
                '}';
    }
}
