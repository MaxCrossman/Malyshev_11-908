package stud;

public class Car {

    private String model;
    private int power;
    private Point point;

    public Car(String model, int power, Point point) {
        this();
        this.model = model;
        this.power = power;
        this.point = point;
    }

    public Car() {
        this.model = "ВАЗ 2106";
        this.power = 100;
        this.point = new Point();

    }

    public Point getPoint() {
        return this.point;
    }

    public void move(Point moving) {
        this.point = moving;
    }

    public static void main(String[] args) {
        Car tazik = new Car("Lada Priora", 256, new Point(1, 6));
//        tazik.move(Point(1, 6));
//        System.out.println(tazik.model + " находится в " + tazik.Point());
    }
}
