package com.company;

/**
 * Студент %surname% %initials%
 * Группа %group%
 * Высшая школа информационных технологий и систем
 * Казанский (Приволжский) федеральный университет
 *
 * Контрольная работа №2.
 *
 */
public class SecondControlWork {

    public static void main(String[] args) {
        String filename = "MOCK_DATA.csv";

        System.out.println("Удачи!");
    }
}


/**
 * 1. Считать файл csv в массив, каждая строка (кроме первой) которого является объектом типа User (см. задание 2).
 * Реализовать методы load, save, saveAs.
 * Реализовать метод getUserById, получающий объект типа User, по id (id != номер строки).
 *
 */
class Users {
    String filename;
    User[] users;

    Users(String filename) {
//        FileReader fr = new FileReader(filename);
//        Scanner scanner = new Scanner(fr);
    }

//    load()
//    save()
//    saveAs(String newFilename)
//    getUserById(int id)
//    findUsersWithParam(String haystack, String needle) (см. задание 4.).
}

/**
 * 2. Создать класс юзер, с полями из CSV файла. Все геттеры/сеттеры + toString. Пол через Enum.
 * 3. В первой строке файла содержатся заголовки таблицы.
 * Создать метод, позволяющий получить номер столбца, по его названию, например, getColByName("name").
 * 4. Создать boolean метод, возвращающий true если пара название/номер столбца и значение соответствует введенным.
 * Используя его, создать метод в тестовом классе, который получит строки по названию опрделенной должности/стране,
 * и сохранит его в другой файл csv.
 */
class User {
    // id;first_name;last_name;email;gender;money;country;job
    // getters&setter
    // toString()
}


enum Gender {}

/**
 * 5. Имплементировать класс User, от интерфейса Measurable.
 * Реализовать метод getMeasure().
 * Реализовать статичные и дефолтные методы в интерфейсе.
 * Добавить в main-е выполнение этих методов.
 */
interface Measurable {
    double getMeasure();

    static double getAverage(Measurable[] list) {
        return 0;
    }

    static double getMaximum(Measurable[] list) {
        return 0;
    }

    static double getMinimum(Measurable[] list) {
        return 0;
    }

    default boolean isGreaterThan(Measurable other){
        return false;
    }
}


