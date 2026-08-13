package Stack_Queue;

public class Dynamic_CircularQueue extends Circular_Queue{
    public Dynamic_CircularQueue(int size){
        super(size);
    }
    public Dynamic_CircularQueue(){
        super();
    }

    @Override
    public boolean insert(int val) {
        if (this.isFull()) {
            // double the array size
            int[] temp = new int[data.length * 2];

            // copy all previous items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }
        return super.insert(val);

    }
}
