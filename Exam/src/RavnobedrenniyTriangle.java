public class RavnobedrenniyTriangle {
    double a;
    double b;
    double c;

    public RavnobedrenniyTriangle(double a,double b,double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if (this.ammountOfEqualSides() == -1) {
            System.out.println("Это не равнобедренный треугольник!");
            this.a = -1;
            this.b = -1;
            this.c = -1;
        }
    }

    public boolean isTrue() {
        if (a ==-1) {
            return false;
        } else {
            return true;
        }
    }


    public double findPerimeter() {
        return a + b + c;
    }

    public double ammountOfEqualSides() {
        if (a == b) {
            return a;
        } else if (a == c) {
            return a;
        } else if (b == c){
            return b;
        } else return -1;
    }

    public double ammountOfUnequalSide() {
        double equalSides = ammountOfEqualSides();
        if (equalSides != a) {
            return a;
        } else if (equalSides != b) {
            return b;
        } else if (equalSides != c) {
            return c;
        } else return a;
    }

    public double findSquare() {
        double uneq = ammountOfUnequalSide()/2;
        return uneq * Math.sqrt(ammountOfEqualSides()*ammountOfEqualSides()-uneq*uneq);
    }

    public boolean equals(RavnobedrenniyTriangle rt) {
        if (a == rt.a && b == rt.b && c == rt.c) {
            return true;
        } else if (a == rt.c && b == rt.a && c == rt.b) {
            return true;
        } else if (a == rt.b && b == rt.c && c == rt.a) {
            return true;
        } else return false;
    }

    public String toString() {
        return "(" + a + "," + b + "," + c + ")";
    }


}
