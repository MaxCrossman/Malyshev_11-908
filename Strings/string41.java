public class string41 {
    public static void main(String [] args) {
        String mes = "Привет, смотрел новый сезон кремниевой долины?";
        int n = mes.length()-1;
        int x = 1;
        for (int i = 0; i < n; i++) {
            if ((mes.charAt(i) == ' ') && (mes.charAt(i + 1) != ' '))
                x++;
        }
        System.out.println(mes);
        System.out.println("There are "+x+" words");
    }
}