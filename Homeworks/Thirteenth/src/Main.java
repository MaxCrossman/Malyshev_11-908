public class Main {

    public static void main(String[] args) {
        ArrayStack<Integer> ass = new ArrayStack<>();
        ass.push(5);
        ass.push(3);
        ass.push(8);
        ass.push(90);
        ass.println();
        System.out.println(ass.peek());
        ass.println();
        System.out.println(ass.pop());
        ass.println();
        ass.pop();
        ass.pop();
        ass.pop();
        ass.println();

        LinkedStack<String> lss = new LinkedStack<>();
        lss.push("Lol");
        lss.push("Kek");
        lss.push("Cheburek");
        lss.push("0_0");
        lss.println();
        System.out.println(lss.peek());
        lss.println();
        System.out.println(lss.pop());
        lss.println();
        lss.pop();
        lss.pop();
        lss.pop();
        lss.println();
    }
}
