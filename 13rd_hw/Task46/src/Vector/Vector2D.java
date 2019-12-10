package Vector;

public class Vector2D {
    private double x;
    private double y;

    public Vector2D() {
        x = 0;
        y = 0;
    }

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector2D(firstTask.Vector2D v){
        x = v.x;
        y = v.y;
    }

    public firstTask.Vector2D add(firstTask.Vector2D v) {
        double nx = x + v.x;
        double ny = y + v.y;
        return new firstTask.Vector2D(nx,ny);
    }

    public void add2(firstTask.Vector2D v) {
        x+= v.x;
        y+= v.y;
    }

    public firstTask.Vector2D sub(firstTask.Vector2D v){    //вектор v вычитается с нашего вектора;
        double nx = x - v.x;
        double ny = y - v.y;
        return new firstTask.Vector2D(nx, ny);
    }

    public void sub2(firstTask.Vector2D v){
        x-= v.x;
        y-= v.y;
    }

    public firstTask.Vector2D mult(double lambda) {
        double nx = x*lambda;
        double ny = y*lambda;
        return new firstTask.Vector2D(nx,ny);
    }

    public void mult2(double lambda){
        x*= lambda;
        y*= lambda;
    }

    public String toString(){
        return "("+x+";"+y+")";
    }

    public double length(){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }

    public double scalarProduct(firstTask.Vector2D v){
        return x*v.x+y*v.y;
    }

    public double cos(firstTask.Vector2D v){
        return this.scalarProduct(v)/(this.length())+(v.length());
    }

    public boolean equals(firstTask.Vector2D v){
        if ((x==v.x)&&(y==v.y)) {
            return true;
        } else {
            return false;
        }
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }
}
