import java.util.Scanner;

public class Main {

    public static boolean hasLessThanK(String [][] array, int k) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                for (int u = 0; u < array[i][j].length(); u++) {
                    if (isGlasnaya(array[i][j].charAt(u))) {
                        count++;
                    }
                }
            }

        }
        if (count > k) {
            return false;
        } else {
            return true;
        }
    }


        public static boolean isGlasnaya ( char charAt){
            switch (charAt) {
                case ('a'):
                    return true;
                case ('e'):
                    return true;
                case ('y'):
                    return true;
                case ('u'):
                    return true;
                case ('i'):
                    return true;
                case ('o'):
                    return true;
                case ('A'):
                    return true;
                case ('E'):
                    return true;
                case ('Y'):
                    return true;
                case ('U'):
                    return true;
                case ('I'):
                    return true;
                case 'O':
                    return true;
                default:
                    return false;
            }
        }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите размеры массива:");
            String [][] array = new String[sc.nextInt()][sc.nextInt()];
            System.out.println("Введите значения:");
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    array[i][j] = sc.next();
                }
            }
            System.out.println("Введите k:");
            if (hasLessThanK(array, sc.nextInt())) {
                System.out.println(true);
                int a = 0;
                int e = 0;
                int y = 0;
                int u = 0;
                int i = 0;
                int o = 0;
                for (int q = 0; q < array.length; q++) {
                    for (int j = 0; j < array[0].length; j++) {
                        for (int r = 0; r < array[q][j].length(); r++) {
                            switch (array[q][j].charAt(r)){
                                case ('a'):
                                    a++;
                                    break;
                                case ('e'):
                                    e++;
                                    break;
                                case ('y'):
                                    y++;
                                    break;
                                case ('u'):
                                    u++;
                                    break;
                                case ('i'):
                                    i++;
                                    break;
                                case ('o'):
                                    o++;
                                    break;
                                case ('A'):
                                    a++;
                                    break;
                                case ('E'):
                                    e++;
                                    break;
                                case ('Y'):
                                    y++;
                                    break;
                                case ('U'):
                                    u++;
                                    break;
                                case ('I'):
                                    i++;
                                    break;
                                case ('O'):
                                    o++;
                                    break;
                            }
                        }
                    }

                }
                System.out.println(" a " + a
                        + "\n e " + e
                        + "\n y " + y
                        + "\n u " + u
                        + "\n i " + i
                        + "\n o " + o);

            }
        }
    }
