public class ComplexNumber {
    private double a;
    private double b;

    public ComplexNumber(){
        a=0;
        b=0;
    }

    public ComplexNumber(double a, double b){
        this.a = a;
        this.b = b;
    }

    public ComplexNumber(ComplexNumber cn){
        this.a = cn.a;
        this.b = cn.b;
    }

    public ComplexNumber add(ComplexNumber cn){
        return new ComplexNumber(a+cn.a,b+cn.b);
    }

    public void add2(ComplexNumber cn){
        a+= cn.a;
        b+= cn.b;
    }

    public ComplexNumber sub(ComplexNumber cn){
        return new ComplexNumber(a-cn.a,b-cn.b);
    }

    public void sub2(ComplexNumber cn){
        a-= cn.a;
        b-= cn.b;
    }

    public ComplexNumber multNumber(double lambda){
        return new ComplexNumber(a*lambda,b*lambda);
    }

    public void multNumber2(double lambda){
        a*= lambda;
        b*= lambda;
    }

    public ComplexNumber mult(ComplexNumber cn){
        return new ComplexNumber(a*cn.a-b*cn.b,a*cn.b+b*cn.a);
    }

    public void mult2(ComplexNumber cn){
        a = a*cn.a+b*cn.b;
        b = a*cn.b+b*cn.a;
    }

    public ComplexNumber div(ComplexNumber cn){
        return new ComplexNumber((a*cn.a+b*cn.b)/(cn.a*cn.a+cn.b+cn.b),(b*cn.a-a*cn.b)/(cn.a*cn.a+cn.b*cn.b));
    }

    public void div2(ComplexNumber cn){
        a = (a*cn.a+b*cn.b)/(cn.a*cn.a+cn.b+cn.b);
        b = (b*cn.a-a*cn.b)/(cn.a*cn.a+cn.b*cn.b);
    }

    public double length(){
        return Math.sqrt(a*a+b*b);
    }

    public String toString(){
        if (b>0) {
            return ""+a+"+"+b+"i";
        } else {
            return ""+a+""+b+"i";
        }
    }

    public double arg(){
        return Math.atan(b/a);
    }

    public ComplexNumber pow(double n){
        return new ComplexNumber(Math.pow(this.length(),n)*Math.cos(n*this.arg()),Math.pow(this.length(),n)*(Math.sin(n*this.arg())));
    }

    public boolean equals(ComplexNumber cn){
        if ((a == cn.a)&&(b==cn.b)){
            return true;
        } else{
            return false;
        }
    }
}
