package gaming;

import gaming.prikoluhi.Nickname;
import java.util.Scanner;

public class Player {
    protected Nickname name;
    protected int hp;

    public Player(Nickname name) {
        this.name = name;
        hp = 10;
    }


    public String getName() {
        return name.toString();
    }

    public int getHp() {
        return hp;
    }

    public void toAttack(Player basurman)  {
        Scanner sc = new Scanner(System.in);
        int power = sc.nextInt();
        if ((power >= 1)&&(power <= 9)) {
            if ((int)(Math.random()*101)<(int)(100/power)) {
                System.out.println("Попал");
                basurman.hp -= power;
                System.out.println(this.name + " нанес урон " + basurman.name + "(" + basurman.hp + ").");
            }   else {
                System.out.println("Не попал((9(");
            }
        } else {
            System.out.println("Cила удара не может превышать 9 и быть меньше 1!");
            toAttack(basurman);
        }
    }
}
