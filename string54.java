public class string54 {
    public static void main(String [] args) {
        String mes = "ITIS HOROSHO";
        System.out.println(mes);
        mes = mes.toLowerCase();
        int n = mes.length();
        int x = 0;
        for (int i = 0; i < n; i++) {
            if ((mes.charAt(i)=='a')||(mes.charAt(i)=='e')||(mes.charAt(i)=='i')||(mes.charAt(i)=='o')||(mes.charAt(i)=='u')||(mes.charAt(i)=='y'))
                x++;
        }
        System.out.println(x);
    }
}