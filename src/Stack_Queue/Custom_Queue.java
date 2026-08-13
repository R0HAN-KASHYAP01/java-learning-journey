package Stack_Queue;

public class Custom_Queue {
    private int[] data;
    protected static final int Default_Size = 10;

    int end = 0;

    public Custom_Queue(){
        this(Default_Size);
    }
    public Custom_Queue(int size){
        this.data = new int[size];

    }

    public boolean isFull(){
        return end == data.length;
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(int val){
        if(isFull()){
            return false;
        }
        data[end++] = val;
        return true;

    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty!");
        }
        int removed = data[0];
        for(int i = 1; i<data.length; i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[0];
    }

    public void display(){
        for(int i = 0; i<end; i++){
            System.out.print(data[i] + " <- ");
        }
        System.out.println("End");
    }
}
