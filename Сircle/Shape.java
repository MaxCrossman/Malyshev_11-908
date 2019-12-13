public class Shape {
    protected String color;

    public Shape (String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Shape of color = '%s'", this.color);
    }

    abstract public double getArea;


}