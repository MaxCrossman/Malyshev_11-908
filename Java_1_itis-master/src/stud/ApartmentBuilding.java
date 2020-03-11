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
public class ApartmentBuilding extends Building{
    private int flatCount;
    
    public ApartmentBuilding(String address, int floorCount, double area, int flatCount) {
        super(address, floorCount, area);
        this.flatCount = flatCount;
    }

    @Override
    public void print() {
//        super.print(); //To change body of generated methods, choose Tools | Templates.
        super.methodName();
        System.out.println("Кол-во квартир: " + this.flatCount);
    }
    
    
            
}
