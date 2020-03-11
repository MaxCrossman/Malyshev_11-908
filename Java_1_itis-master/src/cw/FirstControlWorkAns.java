package cw;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Студент %surname% %initials%
 * Группа %group%
 * Высшая школа информационных технологий и систем
 * Казанский (Приволжский) федеральный университет
 *
 * Контрольная работа №1.
 *
 * Всего 10 заданий, каждое задание реализуется в виде отдельного метода.
 * Задачи могут использовать результаты предыдущей задачи.
 * Если решить задачу не удалось, но она используется в следующей, вводите данные вручную.
 * Контрольная на 10 баллов.
 */
public class FirstControlWorkAns {
    /**
     * Метод выводит содержимое массива в строку.
     */
    public static String arrayToString(int [] numbers) {
        String result = "";
        for (int i = 0; i < numbers.length; i++) {
            result += (i == 0 ? "[" : "") + numbers[i] + (i < numbers.length - 1 ? ", " : "]");
        }
        return result;
    }

    /**
     * 1.
     * Создать массив до заданного числа такой, что каждый элемент больше предыдущего на 7.
     * Первое значение случайное от 0 до 100.
     */
    public static int [] getSevensArray(int limit) {
        int start = (int)(Math.random() * 100);
        int k = 0;
        int current = start;
        while (current < limit) {
            current += 7;
            k++;
        }
        int [] array = new int[k];
        current = start;
        for (int i = 0; i < k; i++) {
            array[i] = current;
            current += 7;
        }
        return array;
    }

    /**
     * 2.
     * Дан массив. Найти второй самый большой элемент.
     */
    public static int getSecondLargest(int [] array) {
        int max = array[0];
        int second_max = max;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                if (second_max < max && second_max > array[i]) {
                    second_max = array[i];
                }
            }
        }
        return second_max;
    }

    /**
     * 3.
     * Написать метод сравнивающий два числа с плавающей точкой с точностью до двух разрадов.
     * @return boolean
     */
    public static boolean isDoubleEquals(double a, double b) {
        if ((int) (a * 100) == (int) (b *100)) return true;
        else return false;
    }

    /**
     * 4.
     * Проверить является ли число простым.
     * Число является простым является простым,
     * если оно больше 1 и при этом делится без остатка только на 1 и на себя.
     * Единица не простое число.
     */
    public static boolean isPrime(int x) {
        boolean isPrime = true;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) isPrime = false;
        }
        return isPrime;
    }

    /**
     * 5.
     * Даны две строки: слово и разделитель, вывести строку содержащую количество вхождений слова, разделенноый разделителем.
     * Например, ("Word", "X", 3) => WordXWordXWord.
     */
    public static String repeatSeparator(String word, String sep, int count) {
        return "";
    }

    /**
     * 6.
     * Сгенерировать текст классической английской песни "99 Bottles of Beer on the Wall":
     * "99 bottles of beer on the wall, 99 bottles of beer.
     * Take one down and pass it around, 98 bottles of beer on the wall.
     *
     * 98 bottles of beer on the wall, 98 bottles of beer.
     * Take one down and pass it around, 97 bottles of beer on the wall.
     *
     * ...
     *
     * 1 bottle of beer on the wall, 1 bottle of beer.
     * Take one down and pass it around, no more bottles of beer on the wall.
     *
     * No more bottles of beer on the wall, no more bottles of beer.
     * Go to the store and buy some more, 99 bottles of beer on the wall."
     *
     * Результат записать в файл.
     */
    public static void singSong() {

    }

    /**
     * 7.
     * Дана строка содержащая выходные данные книги и его ISBN.
     * Например, Блинов, И.Н., Романчик, В.С. Java. Методы программирования: уч.-мет. пособие / И.Н. Блинов, В.С. Романчик. — Минск: издательство «Четыре четверти», 2013. — 896 с. ISBN 978-985-7058-30-3.
     * Проверить ISBN на валидность и
     * получить строку вида "И.О. Фамилия: Название книги (ISBN валидный)".
     */
    public static String getBookName(String entry){
        String regex = "(?x)([А-Я][а-я]+,?\\s([А-Я]\\.[А-Я]\\.)),?\\s*(?:([А-Я][а-я]+,?\\s([А-Я]\\.[А-Я]\\.)),?\\s*)?\n" +
"\\s*(.+?)\\.\n" +
"\\s*(?=—)\n" +
".+?\n" +
"ISBN\\s\n" +
"([\\d-]+)";
        
        Pattern pattern = Pattern.compile(regex, Pattern.COMMENTS);
        Matcher matcher = pattern.matcher(entry);
//        System.out.println(matcher.groupCount());
        String result = "";
        while (matcher.find()) {
            result += matcher.group(1) + " " + matcher.group(2);
            if (matcher.group(3) != null && matcher.group(4) != null) {
                result += ", " + matcher.group(3) + " " + matcher.group(4);
            }
            result += ": " + matcher.group(5) + " (ISBN " + (isISBNValid(matcher.group(6)) ? "валидный).": "не валидный).");
        }
        return result;
    }

    /**
     * 8.
     * ISBN состоит из 13 цифр. Последняя цифра контрольная. Вычисляется по алгоритму EAN-13 следующим образом:
     * 1. вычисляется сумма цифр на четных позициях;
     * 2. полученная сумма умножается на три;
     * 3. вычисляется сумма цифр на нечетных местах;
     * 4. полученные числа в п.2 и п.3 складываем;
     * 5. отбрасываем десятки и отнимаем из 10, и получаем контрольную цифру.
     * Если последняя цифра числа из п.4 = 0, то контрольная цифра равна нулю.
     * @return boolean
     */
    public static boolean isISBNValid(String str){
        str = str.replaceAll("-", "");
        System.out.println(str);
        int control = Integer.parseInt(str.charAt(str.length() - 1) + "");
        int sum = 0;
        for (int i = 0; i < str.length() - 1; i++){
            if (i % 2 == 1) {
                sum += 3 * Integer.parseInt(str.charAt(i) + "");
            } else {
                sum += Integer.parseInt(str.charAt(i) + "");
            }
        }
        if (control == 10 - sum % 10) return true;
        else return false;
    }

    /**
     * 9.
     * Сделать частотный словарь букв заданной строки.
     * Например, "Abba" => "a: 2
     *                      b: 2",
     *           "java is awesome" => "a: 3
     *                                 e: 1
     *                                 i: 1
     *                                 j: 1
     *                                 m: 1
     *                                 o: 1
     *                                 s: 1
     *                                 v: 1
     *                                 w: 1".
     */
    public static String lettersFrequency(String str) {
        str = "Abba";
        str = str.toLowerCase();
        String result = "";
        int t;
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(str.charAt(i) + "")) {
                result += str.charAt(i) + ":1\n";
            } else {
                int freq = Integer.parseInt(result.substring(t = result.indexOf(str.charAt(i) + 1), result.indexOf("\n", (t >=0 ? t : 0))));
            }
        }
        return result;
    }

    /**
     * Метод main() почти готов, нужно немного подредактировать.
     */
    public static void main(String[] args) throws FileNotFoundException {
        int [] sevens;
        System.out.println("Массив \"семёрок\": " + arrayToString(sevens = getSevensArray(200)));
        System.out.printf("Вторым самым большим элементом является %d.%n", getSecondLargest(sevens));

        /* TODO:
            Проверить является ли каждый элемент массива sevens простым.
            Если является, записать в массив, затем вывести эти числа и их количество.
            Для вывода используйте готовый метод arrayToString.
         */
        int prime_count = 0;
        for (int value : sevens) {
            if (isPrime(value)) prime_count++;
        }
        int k = 0;
        int [] primes = new int[prime_count];
        for (int i = 0; i < sevens.length; i++) {
            if (isPrime(sevens[i])) {
                primes[k] = sevens[i];
                k++;
            } 
        }
        if (primes.length > 0) System.out.printf("Простые числа: %s : %d.%n", arrayToString(primes), primes.length);
        else System.out.println("В массиве нет простых чисел.");

//        double a = Math.random() * 100;
//        double b = Math.random() * 100;
        double a = 0.123;
        double b = 0.125;
        System.out.printf(isDoubleEquals(a, b) ? "Числа %f и %f равны, с точностью до эпсилон = 0,01.%n" : "Числа %f и %f не равны.%n", a, b);

        System.out.println("('Word', 'X', 3) => " + repeatSeparator("Word", "X", 3));

        singSong();
        /* TODO:
            Прочитайте из файла, полученного в предыдущем задании, текст и вычислите для него частотный словарь букв.
         */
        String song = "";
        System.out.printf("Частотный словарь букв: %n%s", lettersFrequency(song));

        /* TODO:
            Прочитайте файл 'references.txt', в нем содержится список литературы, на каждоый строке новая запись.
            В третьей строке ISBN с ошибкой.
         */
        String filename = "src/cw/references.txt";
        
        FileReader file = new FileReader(filename);
        Scanner sc = new Scanner(file);
        System.out.println("Список литературы:");
        while (sc.hasNextLine()) {
            System.out.printf("Список литературы:%n%s%n", getBookName(sc.nextLine()));
        }
    }
}
