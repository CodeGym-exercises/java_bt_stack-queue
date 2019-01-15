public class Main {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<Integer>();
        Queue<Integer> myQueue = new Queue<Integer>();
        System.out.println("=======Stack=======");
        myStack.push(4);
        myStack.push(6);
        myStack.push(7);
        myStack.push(2);
        myStack.displayAll();

        myStack.pop();
        myStack.pop();
        myStack.displayAll();

        System.out.println("=======Queue=======");
        myQueue.enqueue(3);
        myQueue.enqueue(6);
        myQueue.enqueue(8);
        myQueue.enqueue(0);
        myQueue.enqueue(-3);
        myQueue.displayAll();

        myQueue.dequeue();
        myQueue.displayAll();

    }

}