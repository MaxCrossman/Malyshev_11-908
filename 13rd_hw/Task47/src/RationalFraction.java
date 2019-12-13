public class RationalFraction {
    private int x;
    private int y;

    public RationalFraction() {
        x=0;
        y=0;
    }

    public void normalize(){
        if (y<0) {
            y*=-1;
            x*=-1;
        }
    }

    public RationalFraction(int x,int y){
        if (y==0){
            System.out.println("Error");
        } else if (x==0){
            y=0;
        } else if (y<0){
            this.x = (-1)*x;
            this.y = (-1)*y;
        } else {
            this.x = x;
            this.y = y;
        }
    }

    public RationalFraction(SecondTask.RationalFraction rf){
        x = rf.x;
        y = rf.x;
        this.normalize();
    }

    public void reduce(){
        this.normalize();
        if (y>1) {
            for (int i = Math.abs(x); i>1;i--){
                if ((((x%i)==0)&&(y%i)==0)) {
                    x=x/i;
                    y=y/i;
                    this.reduce();
                    break;
                }
            }
        }
    }

    public SecondTask.RationalFraction add(SecondTask.RationalFraction rf) {
        int nx;
        int ny;
        if (y != rf.y) {
            nx = (x * rf.y) + (rf.x * y);
            ny = y * rf.y;
        } else {
            nx = x + rf.x;
            ny = y;
        }
        SecondTask.RationalFraction nrf = new SecondTask.RationalFraction(nx,ny);
        nrf.reduce();
        nrf.normalize();
        return nrf;
    }

    public void add2(SecondTask.RationalFraction rf) {
        if (y != rf.y) {
            x = (x * rf.y) + (rf.x * y);
            y*= rf.y;
        } else {
            x+= rf.x;
        }
        this.reduce();
        this.normalize();
    }

    public SecondTask.RationalFraction sub(SecondTask.RationalFraction rf) {
        int nx;
        int ny;
        if (y != rf.y) {
            nx = (x * rf.y) - (rf.x * y);
            ny = y * rf.y;
        } else {
            nx = x - rf.x;
            ny = y;
        }
        SecondTask.RationalFraction nrf = new SecondTask.RationalFraction(nx,ny);
        nrf.reduce();
        nrf.normalize();
        return nrf;
    }

    public void sub2(SecondTask.RationalFraction rf) {
        if (y != rf.y) {
            x = (x * rf.y) - (rf.x * y);
            y*= rf.y;
        } else {
            x-= rf.x;
        }
        this.reduce();
        this.normalize();
    }

    public SecondTask.RationalFraction mult(SecondTask.RationalFraction rf){
        SecondTask.RationalFraction nrf = new SecondTask.RationalFraction(x*rf.x,y*rf.y);
        nrf.reduce();
        nrf.normalize();
        return nrf;
    }

    public void mult2(SecondTask.RationalFraction rf){
        x*=rf.x;
        y*=rf.y;
        this.reduce();
        this.normalize();
    }

    public SecondTask.RationalFraction div(SecondTask.RationalFraction rf){
        SecondTask.RationalFraction nrf = new SecondTask.RationalFraction(x*rf.y,y*rf.x);
        nrf.reduce();
        nrf.normalize();
        return nrf;
    }

    public void div2(SecondTask.RationalFraction rf){
        x*=rf.y;
        y*=rf.x;
        this.normalize();
    }

    public String toString(){
        return ""+x+"/"+y;
    }

    public double value(){
        return (double)(x)/(double)(y);
    }

    public boolean equals(SecondTask.RationalFraction rf){
        rf.reduce();
        this.reduce();
        if((x==rf.x)&&(y==rf.y)){
            return true;
        } else {
            return false;
        }
    }

    public int numberPart(){
        this.normalize();
        return x / y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }
}