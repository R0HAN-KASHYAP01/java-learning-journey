package Stack_Queue;

public class Custom_Stack {
    protected int[] data;
    private static final int Default_size = 10;

    int top = -1;

    public Custom_Stack(){
        this(Default_size);
    }
    public Custom_Stack(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return top == data.length-1;
    }
    public boolean isEmpty(){
        return top == -1;
    }

    public boolean push(int val){
        if(isFull()) return false;
        data[++top] = val;
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot pop from an empty stack!!");
        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;
        return data[top--];
    }

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot peek from an empty stack!!");
        }
        return data[top];
    }

}
