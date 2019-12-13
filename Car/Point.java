
public class Point {

    // поля класса
    public int x;
    public int y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }
	
	// public System.out.println(Point p) {
		// super();
		// System.out.println("("+this.x+","+this.y+")");
	// }

    public Point(int x, int y) {
            this.x = x;
            this.y = y;
    }
	public Point(Point p) {
		this.x = p.x;
		this.y = p.y;
	}
	
	public void move(Point p) {
		this.x+= p.x;
		this.y+= p.y;
	}
	
	public void move(int x, int y) {
		this.x+= x;
		this.y+= y;
	}

	public void outPut() {
    	System.out.print("("+this.x+","+this.y+")");
	}

    public Point(double x, double y) {

    }
	public static void main(String [] args) {
		Point p = new Point(4, 8);
		p.move(-3,2);
		System.out.println(p);
	}

}