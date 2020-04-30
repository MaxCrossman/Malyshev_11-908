import java.util.Stack;

public class Main {

    public static int getValue(String arg) {
        String result = "";
        boolean neg = false;
        for (int i = 0; i < arg.length(); i++) {
            if (arg.matches("^\\s*-\\d+\\s*[+*\\-]{1}\\s*$")) neg = true;
            if (arg.substring(i,i+1).matches("^\\d$")) result+= arg.substring(i,i+1);
        }
        if (neg) return (-1)*Integer.parseInt(result);
        else  return Integer.parseInt(result);
    }

    public static Integer calculate(String... varargs) {
        Stack<Integer> stack = new Stack<>();
        for (String arg: varargs) {
            if (stack.isEmpty() && arg.matches("^\\s*-?\\d*\\s*[*+\\-]{1}\\s*$")) {
                System.out.println("Wrong format");
                return null;
            }
            if (arg.matches("^\\s*-?\\d+\\s*[*+\\-]{1}\\s*$")) {
                if (arg.matches("^\\s*-?\\d+\\s*[*]{1}\\s*$")) {
                    stack.push(stack.pop()*getValue(arg));
                } else if (arg.matches("^\\s*-?\\d+\\s*[+]{1}\\s*$")) {
                    stack.push(stack.pop()+getValue(arg));
                } else if (arg.matches("^\\s*-?\\d+\\s*[\\-]{1}\\s*$")) {
                    stack.push(stack.pop()-getValue(arg));
                }
            } else if (arg.matches("^\\s*[*+\\-]{1}\\s*$")) {
                if (stack.size() != 2) {
                    System.out.println("Wrong format");
                    return null;
                } else {
                    if (arg.matches("[\\*]")) {
                        stack.push(stack.pop()*stack.pop());
                    } else if (arg.matches("[\\+]")) {
                        stack.push(stack.pop()+stack.pop());
                    } else if (arg.matches("[\\-]")) {
                        stack.push(-1*(stack.pop()-stack.pop()));
                    }
                }
            } else if (arg.matches("^\\s*-?\\d+\\s*$")) {
                if (stack.size() > 1) {
                    System.out.println("Wrong format");
                    return null;
                } else {
                    stack.push(Integer.parseInt(arg));
                }
            } else {
                System.out.println("Wrong format");
                return null;
            }
        }
        if (stack.size() != 1) {
            System.out.println("Wrong format");
            return null;
        } else {
            return stack.peek();
        }
    }
    public static void main(String[] args) {
        System.out.println(calculate("10","15 +","20","*"));
        System.out.println(calculate("10","9 +"));
        System.out.println(calculate("-90000"));
        System.out.println(calculate("90000","53-","-89900         +"));
        System.out.println(calculate("9","-9", "*"));
        System.out.println(calculate("9","+"));
        System.out.println(calculate("9","8"));
        System.out.println(calculate("9","8","7-"));
        System.out.println(calculate("5 +"));
        System.out.println(calculate("*"));
    }
}
