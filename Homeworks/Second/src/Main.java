public class Main {

    public static void main(String[] args) {
	MyList<Integer> lOne = new MyList<>();
	lOne.insert(6);
	lOne.insert(1);
	lOne.insert(2);
	lOne.insert(5);
	lOne.insert(8);
	lOne.insert(10);
	lOne.insert(3);
	MyList<Integer> lTwo = new MyList<>();
	lTwo.insert(3);
	lTwo.insert(5);
	lTwo.insert(6);
	lTwo.insert(10);
	lTwo.insert(9);
	MyList<String> lThree = new MyList<>();
	lThree.insert("semiconductors");
	lThree.insert("asparagus");
	lThree.insert("higher");
	lOne.println();
	lTwo.println();
	lThree.println();
	MyList<Integer> lFour = lOne.intersect(lTwo);
	lFour.println();
//	MyList lFive = lThree.intersect(lFour);
//	lFive.print();
    }
}
