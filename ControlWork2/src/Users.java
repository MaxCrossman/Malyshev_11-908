import java.io.*;
import java.util.Scanner;

class Users implements Measurable {
    String filename;
    User[] users;

    Users(String filename) throws IOException{
        load(filename);
    }

    public void load(String fileName) throws IOException {
        users = new User[300];
        BufferedReader fr = new BufferedReader(new FileReader(fileName));
        Scanner sc = new Scanner(fr);
        int h = 0;
        String [] line = sc.nextLine().split(";");
        while (sc.hasNextLine()){
            line = sc.nextLine().split(";");
            User u = new User(line[0],line[1],line[2],line[3],line[4],line[5],line[6],line[7]);
            users[h] = u;
/*            users[h].setId(line[0]);
            users[h].setFirst_name(line[1]);
            users[h].setLast_name(line[2]);
            users[h].setEmail(line[3]);
            users[h].setGender(line[4]);
            users[h].setMoney(line[5]);
            users[h].setCountry(line[6]);
            users[h].setJob(line[7]);

 */
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
        fw.write("id;first_name;last_name;email;gender;money;country;job");
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

    @Override
    public double getMeasure() throws FileNotFoundException {
        FileReader fr = new FileReader(filename);
        Scanner sc = new Scanner(fr);
        String l = sc.nextLine();
        double sum = 0;
        while (sc.hasNextLine()){
            sum+= Double.parseDouble(sc.nextLine().split(";")[5].substring(1));
        }
        return sum;
    }
}