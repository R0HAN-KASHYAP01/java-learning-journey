package Stack_Queue;

public class QueueMain {
    static void main(String[] args) throws Exception {

    Custom_Queue queue = new Custom_Queue(5);
    queue.insert(23);
    queue.insert(21);
    queue.insert(56);
    queue.insert(46);
    queue.insert(90);

//    queue.display();
//    queue.remove();
//    queue.display();

        Circular_Queue queue1 = new Circular_Queue(5);
        queue1.insert(23);
        queue1.insert(75);
        queue1.insert(66);
        queue1.insert(99);
        queue1.insert(87);
        queue1.display();
        queue1.remove();
        queue1.display();
        queue1.insert(254);
        queue1.display();
    }


}
