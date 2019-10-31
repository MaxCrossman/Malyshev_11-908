public class string69 {
    public static void main(String [] args) {
        String m = "h)g()(fh((sg))ha(dj)h)a";
        System.out.println(m);
        int n = m.length();
        int x = 0;
        int y = 0;
        for (int i = 0; i < n; i++) {
            if (m.charAt(i)==')') {
                x++;
            } else if (m.charAt(i)=='(') {
                y++;
            }
        }
        if (x==y) {
            System.out.println("0");
        } else {
            System.out.println("-1");
        }
    }
}