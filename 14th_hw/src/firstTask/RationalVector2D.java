package firstTask;

public class RationalVector2D {
    private RationalFraction rx;
    private RationalFraction ry;

    public RationalVector2D(){
        rx = new RationalFraction(0,0);
        ry = rx;
    }

    public RationalVector2D(RationalFraction rx, RationalFraction ry){
        this.rx = rx;
        this.ry = ry;
    }


    public RationalFraction doubleToRationalFraction(double d){
        String str = Double.toString(d);
        int toInt = (int)Math.pow(10,(str.length()-str.indexOf('.')));
        RationalFraction nrf = new RationalFraction((int)(d*toInt),toInt);
        nrf.reduce();
        return nrf;
    }

    public RationalVector2D(Vector2D vector){
        rx = doubleToRationalFraction(vector.getX());
        ry = doubleToRationalFraction(vector.getY());
    }

    public RationalVector2D(RationalVector2D rv){
        rx = rv.rx;
        ry= rv.ry;
    }

    public RationalVector2D add(RationalVector2D rv){
        return new RationalVector2D(rx.add(rv.rx),ry.add(rv.ry));
    }

    public String toString(){
        return "( "+rx.toString()+" ; "+ry.toString()+" )";
    }

    public double length(){
        return Math.sqrt((double)(rx.getX()*rx.getX())/(double)(rx.getY()*rx.getY())+(double)(ry.getX()*ry.getX())/(double)(ry.getY()*ry.getY()));
    }

    public RationalFraction scalarProduct(RationalVector2D rv){  //руководствовался теоремой из ScalarProductFormula.png
                                                                //(в предыдущих скалярных произведених тоже)
                                                               //
        return rx.mult(rv.rx).add(ry.mult(rv.ry));            //
    }

    public boolean equals(RationalVector2D rv){
        if (rx.equals(rv.rx)&&ry.equals(rv.ry)){
            return true;
        } else return false;
    }
}
