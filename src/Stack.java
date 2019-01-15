import java.util.ArrayList;

public class Stack<E> {
    private MyNode<E> top;

    public Stack(){
        this.top = null;
    }

    public boolean isEmpty(){
        if(this.top == null){
            return true;
        }
        return false;
    }

    public E peek(){
        return this.top.getData();
    }

    public void push(E item){
       if(isEmpty()){
           MyNode<E> newNode = new MyNode<>();
           newNode.setData(item);
           newNode.setNext(null);
           this.top = newNode;
       }
       else{
           MyNode<E> newItem = new MyNode<>();
           newItem.setData(item);
           newItem.setNext(this.top);
           this.top = newItem;
       }
    }

    public E pop(){
        if(isEmpty()){
            return null;
        }
        E data = this.top.getData();
        this.top = this.top.getNext();
        return data;
    }

    public void displayAll(){
        MyNode<E> pointer = top;
        System.out.println("");
        while(pointer != null){
            System.out.print("  " + pointer.getData());
            pointer = pointer.getNext();
        }
        System.out.println("");
    }
}


