package gaming;

import java.util.Scanner;
import gaming.prikoluhi.Nickname;

public class Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Игрок 1, введите свой ник состоящий из 3 символов:");
        Player p1 = new Player(new Nickname(sc.nextLine()));
        System.out.println("Игрок 2, введите свой ник состоящий из 3 символов:");
        Player p2 = new Player(new Nickname(sc.nextLine()));

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(p1.getName()+" vs. "+p2.getName());
        System.out.println("Погнали!");
        boolean f = true;
        while (f) {
            System.out.println(p1.getName()+" ваш ход(введите силу удара):");
            p1.toAttack(p2);
            System.out.println();
            System.out.println();
            System.out.println();
            if ((p1.getHp()<=0)||(p2.getHp()<=0)) {
                if (p2.getHp()<=0) {
                    System.out.println(p1.getName() + " победил!");
                } else {
                    System.out.println(p2.getName()+" победил!");
                }
                f = false;
                break;
            }
            System.out.println(p2.getName()+" ваш ход(введите силу удара):");
            p2.toAttack(p1);
            System.out.println();
            System.out.println();
            System.out.println();
            if ((p1.getHp()<=0)||(p2.getHp()<=0)) {
                if (p2.getHp()<=0) {
                    System.out.println(p1.getName() + " победил!");
                } else {
                    System.out.println(p2.getName()+" победил!");
                }
                f = false;
                break;
            }
        }
    }
}
