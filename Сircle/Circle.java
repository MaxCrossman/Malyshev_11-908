public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return String.format("[radius = %.2f]", this.radius);
    }



        public static void main(String [] args) {
            Circle mikhail = new Circle(40);
            System.out.print(mikhail.toString()+" "+mikhail.getArea());
        }
}