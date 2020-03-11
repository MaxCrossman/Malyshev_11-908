public class Main {

    public static void main(String[] args) {
        int[] mas1 = {};
        int[] mas2 = {-2,-3,4,0,1,-1,3,2};
        MyLinkedList2 mll1 = new MyLinkedList2(mas1);
        mll1.println();
        MyLinkedList2 mll2 = new MyLinkedList2(mas2);
        mll1.println();
        mll2.insert(-4);
        mll2.insert(-4);
        mll2.insert(5);
        mll2.insert(0);
        mll2.println();
        mll1.insert(6);
        mll1.println();
        mll1.delete(8);
        mll1.delete(2);
        mll1.delete(6);
        mll1.delete(6);
        mll1.println();
        mll1.insert(69);
        mll1.insert(-4);
        mll1.insert(72);
        mll1.insert(37);
        mll1.insert(-4);
        mll1.insert(6);
        mll1.insert(-4);
        MyLinkedList2 mll3 = mll1.merge(mll2);
        mll3.println();
        System.out.println(mll3.maxNum());
        MyLinkedList2[] mllmas;
        mllmas = mll3.divide();
        mllmas[0].println();
        mllmas[1].println();
        mllmas[0].newList().println();
        mllmas[1].newList2().println();
    }
}
