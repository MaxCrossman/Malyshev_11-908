import java.util.Scanner;
import java.awt.Color;

public class Car{
    protected String model;
    protected Color color;
	protected int MaxSpeed;
	protected double power;
	protected double TrunkCapacity;
	protected Point point;

    public Car(String model, Color color, int MaxSpeed, double power, double TrunkCapacity, Point point) {
        this.model = model;
		this.color = color;
		this.MaxSpeed = MaxSpeed;
        this.power = power;
		this.TrunkCapacity = TrunkCapacity;
		this.point = new Point(point);
    }
	

    public Car() {
        this.model = "ВАЗ 2106";
        this.power = 100;
		this.color = new Color(0,0,0);
		this.MaxSpeed = 120;
		this.TrunkCapacity = 2.91;
		this.point = new Point();
    }

    public void print() {
        System.out.print("Модель: "+this.model+"\n      Цвет: "+this.color+"\n      Макс. скорость: "+this.MaxSpeed+"\n      Мощность: "+this.power+"\n      Багажник: "+this.TrunkCapacity+"\n      Координаты: ");
        this.point.outPut();
    }
	
	public void toMove() {
		Scanner sc = new Scanner(System.in);
    	System.out.println("Введите значение дельты х: ");
    	int x = sc.nextInt();
		System.out.println("Введите значение дельты у: ");
    	int y = sc.nextInt();
    	this.point.move(x,y);
	}

	public String getModel(){
    	return this.model;
	}

	public Color getColor(){
    	return this.color;
	}

	public void setColor(Color color) {
    	this.color = color;
	}

	public int getMaxSpeed() {
    	return this.MaxSpeed;
	}

	public double getPower() {
    	return this.power;
	}

	public double getTrunkCapacity() {
    	return this.TrunkCapacity;
	}

    public static void main(String [] args) {
        Car tazik = new Car();
        tazik.toMove();
        tazik.print();
        System.out.println("\n \n \n");
        Bus pazik = new Bus();
		pazik.print();
		System.out.println("\n \n \n");
		TrolleyBus tralik = new TrolleyBus();
		tralik.print();
    }
}