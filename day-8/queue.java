import java.util.*;

class queue{
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);

        PriorityQueue<Integer> q1 = new LinkedList<>();
        q1.offer(10);
        q1.offer(20);
        q1.offer(30);
        System.out.println(q1);
    }
}