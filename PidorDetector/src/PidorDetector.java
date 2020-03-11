import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PidorDetector extends JFrame {

    private static JLabel l2;
    JButton b;
    JLabel l1;
    JTextField t;
    eHandler handler = new eHandler();

    public PidorDetector(String s) {
        super(s);
        setLayout(new FlowLayout());
        b = new JButton("Enter");
        l1 = new JLabel("Are you pidor???");
        l2 = new JLabel("");
        t = new JTextField(12);
        add(l1);
        add(b);
        add(t);
        add(l2);
        b.addActionListener(handler);
    }

    public class eHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == b) {
                switch (t.getText().toLowerCase()) {
                    case "yes":
                        PidorDetector.l2.setText("You are pidor");
                        break;
                    case "absolutely":
                        PidorDetector.l2.setText("You are pidor");
                        break;
                    case "of course":
                        PidorDetector.l2.setText("You are pidor");
                        break;
                    case "imma liana":
                        PidorDetector.l2.setText("You are pidor");
                        break;
                    case "no":
                        PidorDetector.l2.setText("A pidors answer");
                        break;
                    default:
                        PidorDetector.l2.setText("GIMME DIRECT FAKIN\' ANSWER!!!");

                }
                t.setText(null);
            }
        }
    }

    public static void main(String[] args) {
        PidorDetector pidorasLiTi = new PidorDetector("I feel... pidor is near!");
        pidorasLiTi.setVisible(true);
        pidorasLiTi.setDefaultCloseOperation(EXIT_ON_CLOSE);
        pidorasLiTi.setSize(580,180);
        pidorasLiTi.setResizable(false);
        pidorasLiTi.setLocationRelativeTo(null);

    }

/*    public static void aQuestion() {
        JOptionPane.showMessageDialog(null,"Hi there");
        String answer = JOptionPane.showInputDialog("Are you Pidor???").toLowerCase();
        switch (answer) {
            case "yes":
                JOptionPane.showInternalConfirmDialog(null,"You are pidor", "Longhuy",1);
                break;
            case "absolutely":
                JOptionPane.showMessageDialog(null,"You are pidor");
                break;
            case "of course":
                JOptionPane.showMessageDialog(null,"You are pidor");
                break;
            case "imma liana":
                JOptionPane.showConfirmDialog(null,"You are pidor");
                break;
            case "no":
                JOptionPane.showMessageDialog(null, "Pidors answer");
                break;
            default:
                JOptionPane.showMessageDialog(null, "GIMME DIRECT FAKIN\' ANSWER!!!");
                aQuestion();
        }
    }

    public static void main(String[] args) {
        aQuestion();
    }

 */
}
