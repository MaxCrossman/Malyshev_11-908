public class string52 {
    public static void main(String [] args) {
        String mes = "ja i chlopcy 1ol";
        System.out.println(mes);
        int n = mes.length()+1;
        System.out.println(n);
        mes = ' '+mes+' '+' ';
        System.out.println(mes.length());
        char x;
        int y;
        for (int i = 0; i < n; i++) {
            if ((mes.charAt(i)==' ')&&(mes.charAt(i+1)!=' ')) {
                if (mes.charAt(i+1)!=(1|2|3|4|5|6|7|8|9|0)) {
                    x = mes.charAt(i + 1);
                    x = Character.toUpperCase(x);
                    mes = mes.substring(0, i + 1) + x + mes.substring(i + 2);
                }
            }
        }
        System.out.println(mes);
    }
}
