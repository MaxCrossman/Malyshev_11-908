package proging;

public class Point {

    // поля класса
    public int x;
    public int y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        if (x >= 0 && y >= 0){
            this.x = x;
            this.y = y;
        }else{
            System.out.println("Ошибка!");
        }
    }

    public Point(double x, double y){

    }

}