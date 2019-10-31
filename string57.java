public class string57 {
    public static void main(String [] args) {
        String text = "Come  along       with me";
        System.out.println(text);
        String newtext = "";
        int n = text.length();
        for (int i = 0; i < n; i++) {
            if (text.charAt(i)!=' ') {
                newtext = (String)(newtext + text.charAt(i));
            } else if (i!=0) {
                if ((text.charAt(i)==' ')&&(text.charAt(i-1)!=' ')) {
                    newtext = (String)(newtext + text.charAt(i));
                }
            }
        }
        System.out.println(newtext);
    }
}