import org.jetbrains.annotations.NotNull;

public class ControlWorkReWriting {
    /**
     * Студент Malyshev M.V.
     * Группа 11-908
     * Высшая школа информационных технологий и систем
     * Казанский (Приволжский) федеральный университет
     *
     * Контрольная работа №3.
     *
     * Максимальный балл 10.
     * Итого:
     */
    public static void main(String[] args) {
        String str1 = "sberbank";
        String str2 = "kollok";
        System.out.println(isPalindrome(str1)+"\n"+
                isPalindrome(str2));
        str1 = "128 heartbeats per 1 minute at 21:07, 31 december";
        System.out.println(fromTextSum(str1));
        System.out.println(generatePassword());
        str1 = "kollob";
        System.out.println(compareStrings(str1,str2));
        int i1 = 7;
        int i2 = 7;
        int i3 = 25;
        int i4 = 55;
        System.out.println(getGCD(i1,i2));
        System.out.println(getGCD(i3,i4));
        System.out.println(getGCD(i2,i3));
    }

    /**
     * 1. Проверить является ли строка палиндромом.
     * Проверка:
     *  метод:
     *  тест:
     * Итого (макс. 2 балла):
     */
    public static boolean isPalindrome(String word) {
        char [] letters = word.toCharArray();
        boolean b = false;
        int n = letters.length -1;
        for (int i = 0; i <= letters.length / 2; i++){
            if (letters[i]!=letters[n-i]){
                b = false;
                break;
            } else {
                b = true;
            }
        }
        return b;
    }

    /**
     * 2. Дана строка, сложить все числа в ней. Если чисел нет выводим 0. Протестировать.
     *
     * Проверка:
     *  метод:
     *  тест:
     * Итого (макс. 2 балла):
     */
    public static boolean checkCharDigit(char d){
        boolean b = false;
        char [] digits = {'0','1','2','3','4','5','6','7','8','9'};
        for (int i = 0; i <10; i++){
            if (d == digits[i]){
                b = true;
                break;
            }
        }
        return b;
    }

/*    public static int fromTextSum(String str){
        char [] symbols = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < symbols.length; i++){
            if(checkCharDigit(symbols[i])){
                sum+= Integer.parseInt(String.valueOf(symbols[i]));
            }-..........

        }
        return sum;
    }

 */

    public static int fromTextSum(@NotNull String str){
        int sum = 0;
        String string = str + " konec predlojeniya";
        int digi = 0;
        for (int i = 0; i < str.length(); i++){
            if (checkCharDigit(string.charAt(i))){
                digi += Integer.parseInt(String.valueOf(string.charAt(i)));
                if (checkCharDigit(string.charAt(i+1))){
                    digi = digi*10;
                } else {
                    sum += digi;
                    digi = 0;
                }
            }
        }
        return sum;
    }

    /**
     * 3. Написать метод генерирующий сложный пароль (цифры, символы и латинский алфавит).
     *
     * Проверка:
     *  метод:
     *  тест:
     * Итого (макс. 2 балла):
     */
    public static String generatePassword() {
        String str = "";
        int length = (int)((Math.random()*5)+8);
        byte num;
        byte r;
        char [] symbols = {'%','&','$','@','#'};
        char [] letters = "absdefghijkmlnopqrstuvwxyz".toCharArray();
        char [] digits = "0123456789".toCharArray();
        for (int i = 0; i < length; i++){
            num = (byte)(Math.random()*3);
            switch (num){
                case (0):
                    str+= symbols[(int)(Math.random()*symbols.length)];
                    break;

                case (1):
                    r = (byte)(Math.random()*2);
                    switch (r){
                        case (0):
                            str+= letters[(int)(Math.random()*letters.length)];
                            break;
                         case(1):
                             str+= Character.toUpperCase(letters[(int)(Math.random()*letters.length)]);
                            break;
                    }
                    break;
                case (2):
                    str+= digits[(int)(Math.random()*10)];
            }
        }
        return str;
    }

    /**
     * 4. Написать метод, который сравнивает две строки и выводит 0 если они равны, 1 если лексиграфически
     * первая находится раньше второй, -1 в обратном случае.
     * Проверка:
     *  метод:
     *  тест:
     * Итого (макс. 2 балла):
     */
    public static int isFirst(char a, char b){
        char [] letters = "absdefghijklmnopqrstuvwxyz".toCharArray();
        int na = -1;
        int nb = -1;
        for (int i =0; i< letters.length; i++){
            if (a == letters[i]){
                na = i;
            }
            if (b == letters[i]){
                nb = i;
            }
        }
        if (nb == na){
            return 0;
        } else if (na < nb){
            return 1;
        } else {
            return -1;
        }
    }

    public static int compareStrings(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        int l;
        int d = 0;
        if (str1.length()>str2.length()){
            l = str2.length();
        } else {
            l = str1.length();
        }
        for (int i = 0; i < l; i++){
            switch (isFirst(str1.charAt(i),str2.charAt(i))){
                case (0):
                    d = 0;
                    break;
                case (1):
                    d = 1;
                    break;
                case (-1):
                    d= -1;
                    break;
            }
            if (d!= 0){
                break;
            }
        }
        return d;
    }

    /**
     * 5. Описать рекурсивную функцию NOD(A, B) целого типа, находящую
     * наибольший общий делитель (НОД) двух целых положительных чисел A
     * и B, используя алгоритм Евклида:
     * НОД(A, B) = НОД(B, A mod B), если B != 0; НОД(A, 0) = A.
     * С помощью этой функции найти НОД(A, B), НОД(A, C), НОД(A,D), если
     * даны числа A, B, C, D.
     *
     * Проверка:
     *  метод:
     *  тест:
     * Итого (макс. 2 балла):
     */

   /* static int getGCD(int a, int b) {
        if (a < b) {
            int t = a;
            a = b;
            b = t;
        }
        if (a == b) {
            return a;
        } else {
            if (b == 0) {
                return a;
            } else {
                return getGCD(b, a % b);
            }
        }
    }*/
    static int getGCD(int a, int b) {
        while ((a!=0)&&(b!=0)){
            if (a > b){
                a = a%b;
            } else if(b > a){
                b = b%a;
            } else {
                return a;
            }
        }
        if (a==0){
            return b;
        } else if (b==0){
            return a;
        } else {
            return getGCD(a,b);
    }
}

}

