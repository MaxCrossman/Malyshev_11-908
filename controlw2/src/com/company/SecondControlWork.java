<<<<<<< HEAD
package com.company;

import java.io.*;
import java.util.Scanner;

/**
 * Студент Малышев М.В.
 * Группа 11-908
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

    Users(String filename) throws FileNotFoundException {
        load(filename);
    }

    public void load(String fileName) throws FileNotFoundException {
        users = new User[300];
        FileReader fr = new FileReader(fileName);
        Scanner sc = new Scanner(fr);
        int h = 0;
        String line = sc.nextLine();
        while (sc.hasNextLine()){
            line = sc.nextLine();
            users[h].setId(Integer.getInteger(line.split(";")[0]));
            users[h].setFirst_name(line.split(";")[1]);
            users[h].setLast_name(line.split(";")[2]);
            users[h].setEmail(line.split(";")[3]);
            users[h].setGender(line.split(";")[4]);
            users[h].setMoney(Double.parseDouble(line.split(";")[5].substring(1)));
            users[h].setCountry(line.split(";")[6]);
            users[h].setJob(line.split(";")[7]);
            h++;
        }
    }

    public void save() throws IOException {
        FileWriter fw = new FileWriter(filename);
        for (int i = 0; i < 300; i++){
            fw.write(users[i].getId()+";"+users[i].getFirst_name()
                    +";"+users[i].getLast_name()+";"+users[i].getEmail()
                    +";"+users[i].getGender()+";$"+users[i].getMoney()+";"+users[i].getCountry()+";"+users[i].getJob()+"\n");
        }
        fw.close();
    }

    public void saveAs(String filename) throws IOException {
        FileWriter fw = new FileWriter(filename);
        for (int i = 0; i < 300; i++){
            fw.write(users[i].getId()+";"+users[i].getFirst_name()
                    +";"+users[i].getLast_name()+";"+users[i].getEmail()
                    +";"+users[i].getGender()+";$"+users[i].getMoney()+";"+users[i].getCountry()+";"+users[i].getJob()+"\n");
        }
        fw.close();
    }

    public User getUserById(int id) throws FileNotFoundException {
        if (id > 300){
            System.out.println("Такого id не существует");
            return null;
        } else {
            FileReader fr = new FileReader(filename);
            Scanner sc = new Scanner(fr);
            String[] line = sc.nextLine().split(";");
            while (sc.hasNextLine()) {
                line = sc.nextLine().split(";");
                if (line[0].equals(String.valueOf(id))) {
                    break;
                }
            }
            return new User(Integer.parseInt(line[0]),line[1],line[2],line[3],line[4],
                    Double.parseDouble(line[5]),line[6],line[7]);
        }
    }

    public int getColNumber(String name) throws FileNotFoundException {
        FileReader fr = new FileReader(filename);
        Scanner sc = new Scanner(fr);
        boolean found = false;
        String[] names = sc.nextLine().split(";");
        for (int i = 0; i < 8; i++) {
            if (names[i].equals(name)) {
                found = true;
                return i;
            }
        }
        if (!found) {
            System.out.println("нет столбца с таким названием");
            return -1;
        } else {
            return -1;
        }
    }

    public boolean isTheSame(int col, String string) throws FileNotFoundException {
        FileReader fr = new FileReader(filename);
        Scanner sc = new Scanner(fr);
        String name = sc.nextLine();
        boolean found = false;
        while(sc.hasNextLine()){
            if (sc.nextLine().split(";")[col-1].equals(string)){
                found = true;
                break;
            }
        }
            return found;
    }

    public boolean isTheSame(String colName, String string) throws FileNotFoundException {
        FileReader fr = new FileReader(filename);
        int col = getColNumber(colName);
        Scanner sc = new Scanner(fr);
        String name = sc.nextLine();
        boolean found = false;
        while(sc.hasNextLine()){
            if (sc.nextLine().split(";")[col-1].equals(string)){
                found = true;
                break;
            }
        }
        return found;
    }

    public void getUsersByCountry(String country){
        System.out.println("Назовите файл: ");
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter(sc.nextLine());
            for (int i = 0; i < 300; i++){
                if (users[i].getJob().equals(country)){
                    fw.write(users[i].toString());
                }
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    public void getUsersByJob(String job){
        System.out.println("Назовите файл: ");
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter(sc.nextLine());
            for (int i = 0; i < 300; i++){
                if (users[i].getJob().equals(job)){
                    fw.write(users[i].toString());
                }
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


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
    private enum Gender {Male, Female, Another};
    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private Gender gender;
    private double money;
    private String country;
    private String job;

    public User(int id, String first_name, String last_name, String email,String gender, String money, String country, String job){
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.money = Double.parseDouble(money.substring(1));
        this.country = country;
        this.job = job;
        if (gender.equals("Male")){
            this.gender = Gender.Male;
        } else if (gender.equals("Female")){
            this.gender = Gender.Female;
        } else {
            this.gender = Gender.Another;   //there is not olny two genders;
        }
    }

    public User(int id, String first_name, String last_name, String email,String gender, double money, String country, String job){
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.money = money;
        this.country = country;
        this.job = job;
        if (gender.equals("Male")){
            this.gender = Gender.Male;
        } else if (gender.equals("Female")){
            this.gender = Gender.Female;
        } else {
            this.gender = Gender.Another;   //there is not olny two genders;
        }
    }


    public double getMoney() {
        return money;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    public Object getGender() {
        return gender;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getJob() {
        return job;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setGender(String gender) {
        if (gender.equals("Male")){
            this.gender = Gender.Male;
        } else if (gender.equals("Female")){
            this.gender = Gender.Female;
        } else {
            this.gender = Gender.Another;
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String toString(){
        return ""+id+" "+first_name+" "+last_name+" "+email+" "+gender+" "+money+" "+country+" "+job;
    }

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
=======
package com.company;

import java.io.*;
import java.util.Scanner;

/**
 * Студент Малышев М.В.
 * Группа 11-908
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

    Users(String filename) throws FileNotFoundException {
        load(filename);
    }

    public void load(String fileName) throws FileNotFoundException {
        users = new User[300];
        FileReader fr = new FileReader(fileName);
        Scanner sc = new Scanner(fr);
        int h = 0;
        String line = sc.nextLine();
        while (sc.hasNextLine()){
            line = sc.nextLine();
            users[h].setId(Integer.getInteger(line.split(";")[0]));
            users[h].setFirst_name(line.split(";")[1]);
            users[h].setLast_name(line.split(";")[2]);
            users[h].setEmail(line.split(";")[3]);
            users[h].setGender(line.split(";")[4]);
            users[h].setMoney(Double.parseDouble(line.split(";")[5].substring(1)));
            users[h].setCountry(line.split(";")[6]);
            users[h].setJob(line.split(";")[7]);
            h++;
        }
    }

    public void save() throws IOException {
        FileWriter fw = new FileWriter(filename);
        for (int i = 0; i < 300; i++){
            fw.write(users[i].getId()+";"+users[i].getFirst_name()
                    +";"+users[i].getLast_name()+";"+users[i].getEmail()
                    +";"+users[i].getGender()+";$"+users[i].getMoney()+";"+users[i].getCountry()+";"+users[i].getJob()+"\n");
        }
        fw.close();
    }

    public void saveAs(String filename) throws IOException {
        FileWriter fw = new FileWriter(filename);
        for (int i = 0; i < 300; i++){
            fw.write(users[i].getId()+";"+users[i].getFirst_name()
                    +";"+users[i].getLast_name()+";"+users[i].getEmail()
                    +";"+users[i].getGender()+";$"+users[i].getMoney()+";"+users[i].getCountry()+";"+users[i].getJob()+"\n");
        }
        fw.close();
    }

    public User getUserById(int id) throws FileNotFoundException {
        if (id > 300){
            System.out.println("Такого id не существует");
            return null;
        } else {
            FileReader fr = new FileReader(filename);
            Scanner sc = new Scanner(fr);
            String[] line = sc.nextLine().split(";");
            while (sc.hasNextLine()) {
                line = sc.nextLine().split(";");
                if (line[0].equals(String.valueOf(id))) {
                    break;
                }
            }
            return new User(Integer.parseInt(line[0]),line[1],line[2],line[3],line[4],
                    Double.parseDouble(line[5]),line[6],line[7]);
        }
    }

    public int getColNumber(String name) throws FileNotFoundException {
        FileReader fr = new FileReader(filename);
        Scanner sc = new Scanner(fr);
        boolean found = false;
        String[] names = sc.nextLine().split(";");
        for (int i = 0; i < 8; i++) {
            if (names[i].equals(name)) {
                found = true;
                return i;
            }
        }
        if (!found) {
            System.out.println("нет столбца с таким названием");
            return -1;
        } else {
            return -1;
        }
    }

    public boolean isTheSame(int col, String string) throws FileNotFoundException {
        FileReader fr = new FileReader(filename);
        Scanner sc = new Scanner(fr);
        String name = sc.nextLine();
        boolean found = false;
        while(sc.hasNextLine()){
            if (sc.nextLine().split(";")[col-1].equals(string)){
                found = true;
                break;
            }
        }
            return found;
    }

    public boolean isTheSame(String colName, String string) throws FileNotFoundException {
        FileReader fr = new FileReader(filename);
        int col = getColNumber(colName);
        Scanner sc = new Scanner(fr);
        String name = sc.nextLine();
        boolean found = false;
        while(sc.hasNextLine()){
            if (sc.nextLine().split(";")[col-1].equals(string)){
                found = true;
                break;
            }
        }
        return found;
    }

    public void getUsersByCountry(String country){
        System.out.println("Назовите файл: ");
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter(sc.nextLine());
            for (int i = 0; i < 300; i++){
                if (users[i].getJob().equals(country)){
                    fw.write(users[i].toString());
                }
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    public void getUsersByJob(String job){
        System.out.println("Назовите файл: ");
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter(sc.nextLine());
            for (int i = 0; i < 300; i++){
                if (users[i].getJob().equals(job)){
                    fw.write(users[i].toString());
                }
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


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
    private enum Gender {Male, Female, Another};
    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private Gender gender;
    private double money;
    private String country;
    private String job;

    public User(int id, String first_name, String last_name, String email,String gender, String money, String country, String job){
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.money = Double.parseDouble(money.substring(1));
        this.country = country;
        this.job = job;
        if (gender.equals("Male")){
            this.gender = Gender.Male;
        } else if (gender.equals("Female")){
            this.gender = Gender.Female;
        } else {
            this.gender = Gender.Another;   //there is not olny two genders;
        }
    }

    public User(int id, String first_name, String last_name, String email,String gender, double money, String country, String job){
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.money = money;
        this.country = country;
        this.job = job;
        if (gender.equals("Male")){
            this.gender = Gender.Male;
        } else if (gender.equals("Female")){
            this.gender = Gender.Female;
        } else {
            this.gender = Gender.Another;   //there is not olny two genders;
        }
    }


    public double getMoney() {
        return money;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    public Object getGender() {
        return gender;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getJob() {
        return job;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setGender(String gender) {
        if (gender.equals("Male")){
            this.gender = Gender.Male;
        } else if (gender.equals("Female")){
            this.gender = Gender.Female;
        } else {
            this.gender = Gender.Another;
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String toString(){
        return ""+id+" "+first_name+" "+last_name+" "+email+" "+gender+" "+money+" "+country+" "+job;
    }

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
>>>>>>> 4b2eaec1e9415af8ac1a8bd1c3c521364bf64350
