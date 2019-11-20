import java.awt.Color;

public class Bus extends Car {
    protected int NumOfSeats;

    public Bus(String model, Color color, int MaxSpeed, double power, double TrunkCapacity, Point point, int NumOfSeats) {
        super(model,color,MaxSpeed,power,TrunkCapacity,point);
        this.NumOfSeats = NumOfSeats;
    }

    public Bus() {
        this.model = "ПАЗ";
        this.power = 100;
        this.color = new Color(0,0,0);
        this.MaxSpeed = 120;
        this.TrunkCapacity = 4.831;
        this.point = new Point();
        this.NumOfSeats = 22;
    }

    public void print() {
        super.print();
        System.out.print("\n      ");
        System.out.print("Количество пассажирских сидений: "+this.NumOfSeats);
    }
}