package QUEUE;

public class  PriorityQueue {
    public static void main(String[] args) {
        java.util.PriorityQueue<Integer> queue = new java.util.PriorityQueue(10, (o1, o2) -> (Integer)o2-(Integer)o1);
        queue.add(4);
        queue.add(3);
        queue.add(12);
        System.out.println(queue.poll());
    }
}
