public class RTriangles {
    static RavnobedrenniyTriangle [] triangles = new RavnobedrenniyTriangle [1000];
    final int CAPACITY = 1000;
    static int size = 0;

    public RTriangles(RavnobedrenniyTriangle rt) {
        if ((size < 1000) && (rt.isTrue())) {
            triangles[size] = rt;
            size++;
        } else if (rt.isTrue()) {
            System.out.println("Массив переполнен");
        } else {
            System.out.println("Треугольник не валидный");
        }
    }

/*    public RTriangles(RavnobedrenniyTriangle [] rts) {
        if ((size < 1000) && (rts.length + size <= CAPACITY)) {
            for (int i = size; i < size+rts.length; i++)
            size++;
        } else if (rt.isTrue()) {
            System.out.println("Массив переполнен");
        } else {
            System.out.println("Треугольник не валидный");
        }
    }

 */

    public static double findCommonSquare() {
        double sum = 0;
        for (RavnobedrenniyTriangle x: triangles) {
            sum += x.findSquare();
        }
        return sum;
    }

    public static boolean hasTwoEqualTriangles() {
        for (int i = 0; i < 1000; i++) {
            for (int j = i; j < 1000; j++) {
                if (triangles[i].equals(triangles[j])) {
                    return true;
                }
            }
        }
        return false;
    }
}
