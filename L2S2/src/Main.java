public class Main {

    public static void main(String[] args) {
        List<String> l = new List<>();
        l.print();
        System.out.println("");
        l.insert("1");
        l.insert("1");
        l.insert("1");
        l.insert("1");
        l.insert("5");
        l.insert("5");
        l.insert("8");
        l.insert("13");
        l.insert("17");
        l.insert("17");
        l.insert("128");
        l.insert("1098");
        l.println();
        l.deleteRepeats();
        l.println();
        l.getHead().getLast().setNext(l.getHead().getNext().getNext().getNext());
        l.reverse();
        l.println();
    }

    public void cycleLength() {

    }
}