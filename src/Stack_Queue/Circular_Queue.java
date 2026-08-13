package Stack_Queue;

public class Circular_Queue {
    public int[] data;
    protected static final int Default_Size = 10;

    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public Circular_Queue(){
        this(Default_Size);
    }
    public Circular_Queue(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return size == data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean insert(int val){
        if(isFull()) return false;
        data[end++] = val;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty!");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;

    }

    public int front() throws Exception{
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " <- ");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println("END");
    }



}
