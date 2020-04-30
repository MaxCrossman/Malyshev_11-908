public class Main {

    public static void main(String[] args) {
        Integer[] mas = {1,2,5,89};
	    LinkedCollection<Integer> lc = new LinkedCollection<>(mas);
        System.out.println(lc.size());
    }
}
