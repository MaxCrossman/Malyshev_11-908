import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class StringArray extends ArrayList<String> {

    public StringArray(String filepath) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader(filepath));
        Scanner sc = new Scanner(br);
        String[] line;
        while (sc.hasNextLine()) {
            line = sc.nextLine().split("[\\s\\n,.\"\\/!&?();:]+");
            for (String str : line) {
                add(str);
            }
        }
    }

    boolean isPlural(String word) {
        String last = word.substring(word.length()-1);
        if (last.equals("s") || last.equals("S")) return true;
        else return false;
    }

    public void capitalizePlurals() {
        for (int i = 0; i < size(); i++) {
            String word = get(i);
            if (isPlural(word)) {
                set(i,word.toUpperCase());
            }
        }
    }

    public void removePlurals() {
        for (int i = 0; i < size(); i++) {
            String word = get(i);
            if (isPlural(word)) {
                remove(i);
                i--;
            }
        }
    }


}
