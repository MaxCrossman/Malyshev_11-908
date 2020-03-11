/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stud;

/**
 *
 * @author Администратор
 */
public class Building {

    // поля класса
    protected String address;
    protected int floorsCount;
    protected double area;

    // конструктор класса
    public Building(){
        this.address = "default_address";
        this.floorsCount = 1;
        this.area = 0;
    }
    
    public Building(String address) {
        this.address = address;
        this.floorsCount = 1;
        this.area = 0;
    }
    
    public Building(String address, int floorCount, double area) {
        this.address = address;
        setFloorsCount(floorsCount);
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFloorsCount(int floorsCount) {
//        if (floorsCount < 1) {
//            System.out.println("Ошибка");
//            System.exit(0);
//        }
        this.floorsCount = floorsCount;
    }
    
    public final void methodName(){
        System.out.println("Final method!");
    }
    
    public void print() {
        System.out.printf("Building address: %s%n"
                + "floors = %d%n"
                + "area = %.2f%n", 
                this.address, this.floorsCount, this.area);
    }

    public static void main(String[] args) {
        Building univer = new Building("kremlevskaya ul., d. 35", 10, 400);
        univer.setAddress("kremlevskaya ul., d. 18");
        System.out.println(univer.address);
        System.out.println(univer.getAddress());
        univer.print();
//        Building home = new Building("pr pobedy");
//        home.print();
//        Point p = new Point();
        Building ab = new ApartmentBuilding("tekhnicheskaya ul", 5, 100, 20);
        ab.print();
    }

}