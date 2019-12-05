package gaming.prikoluhi;

public class Nickname {
    private char first;
    private char second;
    private char third;

    public Nickname(char first, char second, char third) {
        this.first = Character.toUpperCase(first);
        this.second = Character.toUpperCase(second);
        this.third = Character.toUpperCase(third);
    }

    public String toString() {
        String s = "";
        return s+first+second+third;
    }

    public Nickname(String name) {
        first = Character.toUpperCase(name.charAt(0));
        second = Character.toUpperCase(name.charAt(1));
        third = Character.toUpperCase(name.charAt(2));
    }

    public void printNickname() {
        System.out.print(first+second+third);
    }
}
