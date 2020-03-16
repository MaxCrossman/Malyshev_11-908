public class Main {
    /*
    Задания 1, 4 и 6 зачтены.
     */
    public static void main(String[] args) {
        StringList  l = new StringList();
        l.insert("50");
        l.insert("50");
        l.insert("51");
        l.insert("51");
        l.insert("52");
        l.insert("53");
        l.insert("53");
        l.insert("54");
        l.insert("54");
        l.println();
        System.out.println(l.hasStars());
        l.addStars();
        l.println();
        System.out.println(l.hasStars());
        l.removeStars();
        l.println();
        System.out.println(l.hasStars());
    }
}
