import java.util.Stack;

public class Main {

    public static void checkHooksCorrectness(String hooks) {
        char[] mas = hooks.toCharArray();
        Stack<Character> stack = new Stack<>();
        if (mas.length != 0) {
            if (mas[0] == ')' || mas[0] == ']' || mas[0] == '}') {
                System.out.println("First hack is closing!");
                return;
            } else {
                stack.push(mas[0]);
                for (int i = 1; i < mas.length; i++) {
                    if (mas[i] == '(' || mas[i] == '[' || mas[i] == '{') stack.push(mas[i]);
                    else if (mas[i] == ')') {
                        if (stack.isEmpty()) {
                            System.out.println("There's no opening \"(\" hack before hack at " + (int)(i+1));
                            return;
                        }else if (stack.peek() == '(') stack.pop();
                        else {
                            System.out.println("Different types of opening and closing hacks at " +
                                    i + " and " + (int) (i + 1));
                            return;
                        }
                    } else if (mas[i] == ']') {
                        if (stack.isEmpty()) {
                            System.out.println("There's no opening \"[\" hack before hack at " + (int)(i+1));
                            return;
                        }else if (stack.peek() == '[') stack.pop();
                        else {
                            System.out.println("Different types of opening and closing hacks at " +
                                    i + " and " + (int) (i + 1));
                            return;
                        }
                    } else if (mas[i] == '}') {
                        if (stack.isEmpty()) {
                            System.out.println("There's no opening \"{\" hack before hack at " + (int)(i+1));
                            return;
                        }else if (stack.peek() == '{') stack.pop();
                        else {
                            System.out.println("Different types of opening and closing hacks at " +
                                    i + " and " + (int) (i + 1));
                            return;
                        }
                    }
                }
                if (!stack.isEmpty()) {
                    System.out.println("There's not enough closing hacks");
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
