/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stud;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Администратор
 */
public class File {
    
    
    public static void main(String[] args) throws Exception{
        String filename = "src/stud/matrix4gauss.txt";
        FileReader fr = new FileReader(filename);
        Scanner scan = new Scanner(fr);
        String newline = "";
        int rows_count = 0;
        int cols_count = 0;
        while (scan.hasNextLine()) {
            newline = scan.nextLine();
            String [] cols = newline.split("(?i)\\s+");
            cols_count = cols.length;
            rows_count++;
        }
        fr.close();
        int [][] array = new int [rows_count][cols_count];
        fr = new FileReader(filename);
        scan = new Scanner(fr);
        int i = 0;
        while (scan.hasNextLine()) {
            newline = scan.nextLine();
            String [] cols = newline.split("\\s+");
            int j = 0;
            for(String value : cols) {
                array[i][j] = Integer.parseInt(value);
                j++;
            }
            i++;
        }
        fr.close();
        
        for(int m=0; m< array.length; m++){
            for(int n=0; n< array[0].length; n++){
                System.out.printf("%4d", array[m][n]);
            }
            System.out.println();
        }
//        
//        FileWriter fw = new FileWriter("new_file.txt");
//        fw.write(newline);
//        fw.close();
        
//        PrintStream ps = new PrintStream("out.txt");
//        System.setOut(ps);
//        
//        System.out.println("string");

//        ps.close();
        
//        RandomAccessFile raf = new RandomAccessFile(filename, "r");
//        RandomAccessFile raf2 = new RandomAccessFile(filename.replace(".", "_1."), "rw");
//        raf2.seek(raf2.length());
//        String b;
////        int b;
//        String result = "";
//        while ((b = raf.readLine()) != null) {
//            result = result + b;
//        }
//        while ((b = raf.read()) != -1) {
//            result = result + (char) b;
//        }
//        System.out.println(raf.readLine());
//        System.out.println(result);
//        String newstr = "New line for input";
////        System.out.println(raf.readUTF());
//        raf2.writeUTF(result + newstr);
//        raf.close();
//        raf2.close();
    }
}
