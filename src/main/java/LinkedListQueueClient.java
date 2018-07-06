public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(8);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(30);
        queue.enqueue(100);
        queue.enqueue(88);
        System.out.println("Dequeued item is " + queue.dequeue().key);
    }
}
