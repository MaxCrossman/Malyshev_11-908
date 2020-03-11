/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stud.lesson_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Scanner;
import static stud.lesson_15.CSVReader.hash;

/**
 *
 * @author Администратор
 */
public class CSVReader {

    private FileType type;
//    private File file;
    private String filename;

    public CSVReader(FileType type) {
        switch (type) {
            case USERS:
                filename = "src/stud/lesson_15/Users.csv";
                break;
        }
    }

    public String getPasswordByLogin(String login) {
        File file = new File(filename);
        try (Scanner scan = new Scanner(file)){
            scan.nextLine();
            while (scan.hasNextLine()) {
                String[] line = scan.nextLine().split(";");
                if (line[1].equals(login)) {
                    return line[2];
                }
            }
        } catch (FileNotFoundException|ArrayIndexOutOfBoundsException ex) {
            System.err.println(ex.getMessage());
        }
        
        return null;
    }
    
    public static String bytesToHex(byte [] bytes) {
        String result = "";
        for(byte b : bytes) {
            result += String.format("%02x", b);
        }
        return result;
    }
    
    public static String hash(String password, String salt) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] hashedPassword = md.digest();
        
        System.out.println(Arrays.toString(hashedPassword));
        System.out.println(bytesToHex(hashedPassword));
        
        return "";
    } 
}



enum FileType {
    USERS
}


class TestHash {
    
    public static void main(String[] args) throws NoSuchAlgorithmException {
        hash("","");
    }
}