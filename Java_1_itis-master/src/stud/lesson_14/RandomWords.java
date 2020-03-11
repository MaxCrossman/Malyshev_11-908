/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stud.lesson_14;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Администратор
 */
public class RandomWords implements Readable {

    private char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private char[] lowers = "abcdefghijklmnopqrtstyuvwxyz".toCharArray();
    private char[] vowels = "aouie".toCharArray();
    private int length;
    private int count;
    private static Random rand = new Random();

    public RandomWords(int length, int count) {
        this.length = length;
        this.count = count;
    }

    public String getWord() {
        String result = capitals[rand.nextInt(capitals.length)] + "";
        for (int i = 0; i < this.length / 2 - this.length % 2; i++) {
            result += vowels[rand.nextInt(vowels.length)] + "";
            result += lowers[rand.nextInt(lowers.length)] + "";
        }
        return result;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }

        cb.append(capitals[rand.nextInt(capitals.length)]);
        for (int i = 0; i < this.length / 2 - this.length % 2 - 1; i++) {
            cb.append(vowels[rand.nextInt(vowels.length)]);
            cb.append(lowers[rand.nextInt(lowers.length)]);
        }
        cb.append(" ");
        return this.length;
    }
}

class RandomDoubles {

    private static Random rand = new Random();

    public double next() {
        return rand.nextDouble();
    }

}

class AdaptedRandomDoubles extends RandomDoubles implements Readable {

    private int count;

    public AdaptedRandomDoubles(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }
        String result = Double.toString(super.next()) + " ";
        cb.append(result.replace(".", ","));
        return result.length();
    }

}

class TestRandomWord {

    public static void main(String[] args) {
        RandomWords rw = new RandomWords(10, 10);
        System.out.println(rw.getWord());

        Scanner sc = new Scanner(rw);
        while (sc.hasNext()) {
            System.out.println(sc.next());
        }

        RandomDoubles rd = new RandomDoubles();

        for (int i = 0; i < 5; i++) {
            System.out.println(rd.next());
        }

        System.out.println("Scanner:");
        Scanner scd = new Scanner(new AdaptedRandomDoubles(5));
        while (scd.hasNextDouble()) {
            System.out.println(scd.nextDouble());
        }

    }

}
