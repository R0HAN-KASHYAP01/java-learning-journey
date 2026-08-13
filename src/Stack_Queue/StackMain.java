package Stack_Queue;

public class StackMain {
    static void main(String[] args) throws StackException {
        Custom_Stack stack = new Custom_Stack();

        stack.push(23);
        stack.push(64);
        stack.push(2);
        stack.push(98);
        stack.push(18);

        System.out.println(stack.pop());
        System.out.println(stack.peek());

        DynamicStack stack2 = new DynamicStack(5);
        stack2.push(34);
        stack2.push(98);
        stack2.push(310);
        stack2.push(344);
        stack2.push(78);
        stack2.push(23);


    }
}
