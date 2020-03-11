/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stud.Lesson_11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Администратор
 */
public class StudRegex {
    
    
    
    
    public static void main(String[] args) {
        // PCRE Perl Compatible Regular Expressions
        
        String str = "+79503244545\n" +
"88005553535\n"
                + "88005553535\n"
                + "adfasfs";
        String regex = "(\\+?\\b\\d{1,2})(\\d{10}\\b)";
//        "(jpg|png|bmp)"
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.groupCount());
        while (matcher.find()) {
            System.out.println(matcher.group(1));
            System.out.printf("код страны: %s, номер тел-на: %s%n", matcher.group(1), matcher.group(2));
        }
        
    }
    
    
}
