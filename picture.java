import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class picture {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Pattern p = Pattern.compile("(.jpg$|.jpeg$|.bmp$|.png$)");
        Matcher m = p.matcher(s);
        if (m.find() == true) {
            System.out.println("Picture extension: "+s.substring(s.lastIndexOf('.')));
            s = s.substring(0,s.lastIndexOf('.'));
            System.out.println("Picture name: "+s.substring(s.lastIndexOf('\\')+1));
        } else {
            System.out.println("Ha-ha... Good attempt, Bye...");
        }
    }
}