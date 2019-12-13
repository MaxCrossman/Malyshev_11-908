import java.io.IOException;

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

    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\Admin\\Documents\\proging\\Malyshev_11-908\\ControlWork2\\src\\MOCK_DATA.csv";
        Users u = new Users(filename);
        u.saveAs("MOCK_DATA(2).csv");
    }
}
