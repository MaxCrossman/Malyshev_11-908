package gaming;

import gaming.prikoluhi.Nickname;
import java.util.Scanner;

public class Player {
    protected Nickname name;
    protected int hp;
    protected String battleCry;

    public Player(Nickname name) {
        this.name = name;
        hp = 100;
        this.battleCry = battleCry;
    }

    public void shoutBattleCry(){
        System.out.println(battleCry);
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
            basurman.hp -= power;
            System.out.println(this.name+" нанес урон "+basurman.name+"("+basurman.hp+").");
        } else {
            System.out.println("Cила удара не может превышать 9 и быть меньше 1!");
            toAttack(basurman);
        }
    }
}
