public class string52 {
    public static void main(String [] args) {
        String mes = "ja i chlopcy 1ol";
        System.out.println(mes);
        int n = mes.length()+1;
        mes = ' '+mes+' '+' ';
        char x;
        int y;
        for (int i = 0; i < n; i++) {
            if ((mes.charAt(i)==' ')&&(mes.charAt(i+1)!=' ')) {
                    x = mes.charAt(i + 1);
                    x = Character.toUpperCase(x);
                    mes = mes.substring(0, i + 1) + x + mes.substring(i + 2);
            }
        }
        System.out.println(mes);
    }
}
