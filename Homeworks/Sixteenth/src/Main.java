import java.util.Stack;

public class Main {

    public static void checkHooksCorrectness(String hooks) {
        char[] mas = hooks.toCharArray();
        DoubleStackQueue<Character> queue= new DoubleStackQueue<>();
        if (mas.length != 0) {
            if (mas[0] == ')' || mas[0] == ']' || mas[0] == '}') {
                System.out.println("First hook is closing!");
                return;
            } else {
                queue.stack1.push(mas[0]);
                for (int i = 1; i < mas.length; i++) {
                    if (mas[i] == '(' || mas[i] == '[' || mas[i] == '{') queue.stack1.push(mas[i]);
                    else if (mas[i] == ')') {
                        if (queue.stack1.isEmpty()) {
                            System.out.println("There's no opening \"(\" hack before hook at " + (int)(i+1));
                            return;
                        }else if (queue.stack1.peek() == '(') queue.stack1.pop();
                        else {
                            System.out.println("Different types of opening and closing hooks at " +
                                    i + " and " + (int) (i + 1));
                            return;
                        }
                    } else if (mas[i] == ']') {
                        if (queue.stack1.isEmpty()) {
                            System.out.println("There's no opening \"[\" hook before hook at " + (int)(i+1));
                            return;
                        }else if (queue.stack1.peek() == '[') queue.stack1.pop();
                        else {
                            System.out.println("Different types of opening and closing hooks at " +
                                    i + " and " + (int) (i + 1));
                            return;
                        }
                    } else if (mas[i] == '}') {
                        if (queue.stack1.isEmpty()) {
                            System.out.println("There's no opening \"{\" hook before hook at " + (int)(i+1));
                            return;
                        }else if (queue.stack1.peek() == '{') queue.stack1.pop();
                        else {
                            System.out.println("Different types of opening and closing hooks at " +
                                    i + " and " + (int) (i + 1));
                            return;
                        }
                    }
                }
                if (!queue.stack1.isEmpty()) {
                    System.out.println("There's not enough closing hooks");
                    return;
                }
            }
        }
        System.out.println("Correct!");
    }

    public static void main(String[] args) {
        String s1 = "()[]{{}}";
        checkHooksCorrectness(s1);
        String s2 = "((()))]";
        checkHooksCorrectness(s2);
        String s3 = ")";
        checkHooksCorrectness(s3);
        String s4 = "([)]";
        checkHooksCorrectness(s4);
        String s5 = "{()()[(){}]}";
        checkHooksCorrectness(s5);
    }
}
