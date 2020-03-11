import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
	String otvet;
	otvet = JOptionPane.showInputDialog("Кинул пвцана?");
	otvet = otvet.toLowerCase();
	switch(otvet){
        case("да"):
            JOptionPane.showMessageDialog(null,"По ебалу на!");
            break;
        case("нет"):
            JOptionPane.showMessageDialog(null, "Пидора ответ...");
            break;
        case(""):
            JOptionPane.showMessageDialog(null, "Хуль молчишь додик?!");
            break;
        default:
            JOptionPane.showMessageDialog(null, "Вот сразу видно - хороший человек");
            break;
    }

    }
}
