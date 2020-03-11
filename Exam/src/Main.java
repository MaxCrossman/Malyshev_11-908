public class Main {

    public static void main(String[] args) {
        RavnobedrenniyTriangle rt1 = new RavnobedrenniyTriangle(1, 2, 3);
        RavnobedrenniyTriangle rt2 = new RavnobedrenniyTriangle(1, 2, 1);
        RavnobedrenniyTriangle rt3 = rt2;
        RavnobedrenniyTriangle rt4 = new RavnobedrenniyTriangle(2, 1, 1);
        RavnobedrenniyTriangle rt5 = new RavnobedrenniyTriangle(4 , 5 , 5);

        System.out.println(rt3.equals(rt4));
        System.out.println(rt5.findSquare());
        System.out.println(rt2.findPerimeter());
        RTriangles rts = new RTriangles(rt1);
        rts = new RTriangles(rt2);
        rts = new RTriangles(rt3);
        rts = new RTriangles(rt4);
        rts = new RTriangles(rt5);

        System.out.println(rts.hasTwoEqualTriangles());
        System.out.println(rts.findCommonSquare());
    }
}
