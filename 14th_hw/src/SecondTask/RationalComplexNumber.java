package SecondTask;

public class RationalComplexNumber{
    private RationalFraction a;
    private RationalFraction b;

    public RationalComplexNumber(){
        a = new RationalFraction();
        b = new RationalFraction();
    }

    public RationalComplexNumber(RationalFraction rf1, RationalFraction rf2){
        a = rf1;
        b = rf2;
    }

    public RationalComplexNumber(RationalComplexNumber rcn){
        a = rcn.a;
        b = rcn.b;
    }

    public RationalComplexNumber add(RationalComplexNumber rcn){
        return new RationalComplexNumber(a.add(rcn.a),b.add(rcn.b));
    }

    public RationalComplexNumber sub(RationalComplexNumber rcn){
        return new RationalComplexNumber(a.sub(rcn.a),b.sub(rcn.b));
    }

    public RationalComplexNumber mult(RationalComplexNumber rcn){
        return new RationalComplexNumber(a.mult(rcn.a).sub(b.mult(rcn.b))
                                        ,a.mult(rcn.b).add(a.mult(rcn.b)));
    }

    public String rationalComplexNumberToString(){
        if (b.getX()<0){
            return ""+a.toString()+b.toString()+"*i";
        } else{
            return ""+a.toString()+"+"+b.toString()+"*i";
        }
    }

    public RationalFraction getA() {
        return a;
    }

    public RationalFraction getB() {
        return b;
    }

    public void setA(RationalFraction a) {
        this.a = a;
    }

    public void setB(RationalFraction b) {
        this.b = b;
    }
}