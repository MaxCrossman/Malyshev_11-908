public class Main {

    public static void main(String[] args) {
        NumList nl = new NumList();
        nl.insert(59);
        nl.insert(-32);
        nl.insert(3);
        nl.insert(0);
        System.out.println(nl.getMaxValue());
        System.out.println(nl.getCommonValue());
        System.out.println(nl.hasNegative());
    }
}
