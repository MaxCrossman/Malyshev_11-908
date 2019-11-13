public class string42 {
    public static void main(String [] args) {
        String mes = "Kolobok Poshel V Les, Lol";
        mes = mes.toLowerCase();
        System.out.println(mes);
        int x = 0;
        int n = mes.length();
        mes = mes+" ";
        int p = -1;
        for (int i = 0; i < n; i++) {
            if ((mes.charAt(i)!=' ')&&(mes.charAt(i+1)==' ')) {
                if (mes.charAt(p + 1) == mes.charAt(i)) {
                    System.out.println(mes.substring((p + 1),(i+1)));
                }
                p = i+1;
            }
        }
    }
}