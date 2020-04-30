import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        ArrayQueue<Integer> aq = new ArrayQueue<>();
        System.out.println(aq.offer(3));
        System.out.println(aq.offer(4));
        System.out.println(aq.offer(9));
        System.out.println(aq.poll());
        System.out.println(aq.poll());
        System.out.println(aq.poll());
        LinkedQueue<Integer> lq = new LinkedQueue<>();
        System.out.println(lq.offer(3));
        System.out.println(lq.offer(4));
        System.out.println(lq.offer(9));
        System.out.println(lq.poll());
        System.out.println(lq.poll());
        System.out.println(lq.poll());
    }
}
