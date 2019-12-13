public class Rectangle extends Shape {
    protected double height;
    protected double width;

    public Rectangle(double height, double width , String color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return this.height * this.width;
    }
    
}