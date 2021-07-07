import java.io.IOException;

/**
 * Студент Малышев М.В.
 * Группа 11-908
 * Высшая школа информационных технологий и систем
 * Казанский (Приволжский) федеральный университет
 *
 * Контрольная работа №2.
 *1
 *  * Проверка:
 *  *   Чтение csv в массив юзеров:+
 *  *   load:+
 *  *   save:+
 *  *   getUserById:+
 *  *   test:0,75
 *  * Итого (макс. 5 баллов):4,75
 *
 * 2
 *  * Проверка:
 *  *   User:+
 *  *   getters/setters:+
 *  *   toString:+
 *  *   enum:+
 *  *   test:-
 *  * Итого (макс. 5 баллов):4
 *
 * 3
 *  * Проверка:
 *  *   getColByName:+
 *  *   test:-
 *  * Итого (макс. 2 балла):1
 *
 * 4
 *  * Проверка:
 *  *   boolean equals:+
 *  *   findUsersWithParam:+
 *  *   test save:-
 *  * Итого (макс. 3 балла):2
 *
 * 5 (не обязательно)
 *  * Проверка:
 *  *   getMeasure:
 *  *   static methods:
 *  *   isGreaterThan:
 *  *   test:
 *  * Итого (макс. 5 балла):
 * Максимальный балл 15.
 * Итого:11,75
 */

public class SecondControlWork {

    public static void main(String[] args) throws IOException {
        String filename = "MOCK_DATA.csv";
        Users u = new Users(filename);
        u.saveAs("MOCK_DATA(2).csv");
    }
}
