import javax.swing.tree.TreeCellRenderer;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.security.Key;
import java.sql.SQLOutput;
import java.util.*;

public class StringArray extends ArrayList<String> {

    public StringArray(String filepath) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader(filepath));
        Scanner sc = new Scanner(br);
        String[] line;
        while (sc.hasNextLine()) {
            line = sc.nextLine().split("[\\s\\n,.\"\\/!&?();:]+");
            for (String str : line) {
                add(str.toLowerCase());
            }
        }
    }

    public StringArray(String[] array) {
        for (String el: array) {
            add(el);
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

    public int countOfUniqueWordsUsingArrayList() {
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < size(); i++) {
            if (!al.contains(get(i))) al.add(get(i));
        }
        return al.size();
    }

    public int countOfUniqueWordsUsingTreeSet() {
        TreeSet<String> ts = new TreeSet<>();
        ts.addAll(this);
        return ts.size();
    }

    public int countOfUniqueWordsUsingHashSet() {
        HashSet<String> hs = new HashSet<>();
        hs.addAll(this);
        return hs.size();
    }

    public StringArray topFiftyWords() {
        if (countOfUniqueWordsUsingHashSet()<50) {
            System.out.println("Not enough words");
            return null;
        }
        TreeMap<String, Integer> tm = new TreeMap<>();
        String cur;
        for (int i = size()-1; i >= 0; i--) {
            cur = get(i);
            if (tm.containsKey(cur)) {
                tm.put(cur,tm.get(cur)+1);
            } else tm.put(cur,1);
        }
        String[][] top50 = new String[2][50];
        for (String s: tm.keySet()) {
            int i = 50;
            while( i != -1 && tm.get(s) < Integer.parseInt(top50[0][i])) {
                i--;
            }
            if (i!=-1) {top50[0][i] = tm.get(s) + ""; top50[1][i] = s;}
        }
        return new StringArray(top50[1]);
    }

    public String[][] topFiftyWordsInDoubleArray() {
        if (countOfUniqueWordsUsingHashSet()<50) {
            System.out.println("Not enough words");
            return null;
        }
        TreeMap<String, Integer> tm = new TreeMap<>();
        String cur;
        for (int i = size()-1; i >= 0; i--) {
            cur = get(i);
            if (tm.containsKey(cur)) {
                tm.put(cur,tm.get(cur)+1);
            } else tm.put(cur,1);
        }
        String[][] top50 = new String[2][50];
        int i;
        for (int j = 0; j < 50; j++) {
            top50[0][j] =-1+"";
        }
        for (String s: tm.keySet()) {
            i = 49;
            while( i != -1 && tm.get(s) < Integer.parseInt(top50[0][i])) {
                i--;
            }
            if (i!=-1) {top50[0][i] = tm.get(s) + ""; top50[1][i] = s;}
        }
        return top50;
    }
}
