import java.awt.Color;

public class TrolleyBus extends Bus {
    protected int eTraction;

    public TrolleyBus(String model, Color color, int MaxSpeed, double power, double TrunkCapacity, Point point, int NumOfSeats, int eTraction) {
        super(model,color,MaxSpeed,power,TrunkCapacity,point,NumOfSeats);
        this.eTraction = eTraction;
    }

    public TrolleyBus() {
        this.model = "Тралик";
        this.power = 100;
        this.color = new Color(0,0,0);
        this.MaxSpeed = 120;
        this.TrunkCapacity = 4.831;
        this.point = new Point();
        this.NumOfSeats = 30;
        this.eTraction = 50;
    }

    public void print() {
        super.print();
        System.out.print("\n      ");
        System.out.print("Электрическая тяга: "+this.eTraction);
    }

    public int geteTraction() {
        return eTraction;
    }
}