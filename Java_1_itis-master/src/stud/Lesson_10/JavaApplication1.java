package stud.Lesson_10;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// itis.kpfu.ru
//   ru.kpfu.itis.projects.stud.Matrix;     
import java.util.StringTokenizer;

/**
 * String41
 * String42
 * String52
 * String54
 * String57
 * String58
 * String59
 * String69
 * 
 * 
 *
 * @author Администратор
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = "Тестовая строка для вычисления количества слов.";
        str += "asdf";
        StringBuilder sb;
        StringBuffer sbuff;
        StringTokenizer st = new StringTokenizer(str, " \\r\\n<>?!:;.,");
        
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        
        String words [] = str.split("\\s");
        System.out.println(words.length);
    }
    
}
