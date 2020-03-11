/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stud.lesson_12;

/**
 *
 * @author Администратор
 */
public class Circle {
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public double getRadius() {
        return this.radius;
    }
    
    public double getArea(){
        return Math.PI * this.getRadius() * this.getRadius(); // Math.pow(this.radius, 2)
    }

    @Override
    public String toString() {
        return String.format("Circle [radius = %.2f]", this.getRadius());
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius) {
        super(radius);
        this.height = 0;
    }
    
    
    
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return 2 * super.getArea() + 2 * Math.PI * this.getRadius() * this.getHeight();
    }
    
    public double getVolume() {
        return super.getArea() * this.getHeight();
    }

    @Override
    public String toString() {
        return String.format("Cylinder [height = %.2f, %s]", this.getHeight(), super.toString());
    }
}


class TestCircle {
    
    public static void draw(Circle circle){
        if (circle instanceof Cylinder) {
            Cylinder cy = (Cylinder) circle;
        }
    }
    
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println(c);
        System.out.println("Area = " + c.getArea());
        
        Cylinder cy = new Cylinder(1.23, 10);
        System.out.println("Area = " + cy.getArea());
        System.out.println("Volume = " + cy.getVolume());
        System.out.println(cy);
        
        System.out.println("C2");
        // upcasting
        Circle c2 = new Cylinder(1.23, 12);
        System.out.println(c2);
        // downcasting
        cy = (Cylinder) c2;
        System.out.println(cy);
        
        // aVariable instanceof aClass
        System.out.println(c2 instanceof Circle);
        System.out.println(c2 instanceof Cylinder);
        System.out.println(cy instanceof Circle);
        System.out.println(cy instanceof Cylinder);
        System.out.println(c instanceof Circle);
        System.out.println(c instanceof Cylinder);

        
    }
}
