/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stud.lesson_13;

/**
 *
 * @author Администратор
 */
public abstract class Shape {

    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Shape of color='%s'", this.color);
    }

    abstract public double getArea();
    abstract public double getPerimeter();
}



class Rectangle extends Shape {

    protected double height;
    protected double width;

    public Rectangle(double height, double width, String color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    
    
    @Override
    public double getArea() {
        return this.height * this.width;
    }

    @Override
    public String toString() {
        return super.toString() + " "
                + this.getClass().getSimpleName()
                + String.format(
                        "[height = %.2f, width = %.2f]",
                        this.height,
                        this.width
                );
    }

    @Override
    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

}

class Circle extends Shape{
    protected double radius;
    
    public Circle(double radius, String color){
        super(color);
        this.radius = radius;
    }
    
    public double getRadius() {
        return this.radius;
    }
    
    @Override
    public double getArea(){
        return Math.PI * this.getRadius() * this.getRadius(); // Math.pow(this.radius, 2)
    }

    @Override
    public String toString() {
        return super.toString() + 
                String.format(" Circle [radius = %.2f]", this.getRadius());
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * this.radius;
    }
}

class TestShape {

    public static void main(String[] args) {
//        Shape shape = new Shape("green");  //нельзя получить экземляр абстрактного класса
        Shape [] shape = new Shape[2];
        shape[0] = new Rectangle(10, 10, "red");
        shape[1] = new Circle(10, "red");
        for(Shape currentShape : shape) {
            System.out.print(currentShape);
            System.out.print(" area = " + currentShape.getArea());
            System.out.println("; perimeter = " + currentShape.getPerimeter());
        }
    }

}
