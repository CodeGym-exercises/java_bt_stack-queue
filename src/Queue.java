public class Queue<E> {
    private MyNode<E> Head;
    private MyNode<E> Tail;

    public Queue(){
        this.Head = null;
        this.Tail = null;
    }

    public boolean isEmpty(){
        if(this.Head == null && this.Tail == null){
            return true;
        }
        return false;
    }

    public void enqueue(E data){
        MyNode<E> newNode = new MyNode<>();
        newNode.setData(data);
        if (isEmpty()){
            newNode.setNext(null);
            this.Head = newNode;
            this.Tail = newNode;
        }else{
            newNode.setNext(this.Head);
            this.Head = newNode;
        }
    }

    public E dequeue(){
        if(isEmpty()){
            return null;
        }
        MyNode<E> pointer = this.Head;
        while (pointer.getNext()!=this.Tail){
            pointer = pointer.getNext();
        }
        E data = this.Tail.getData();
        pointer.setNext(null);
        this.Tail = pointer;
        return this.Tail.getData();
    }

    public E peek(){
        if(!isEmpty()){
            return this.Head.getData();
        }
        return null;
    }

    public void displayAll(){
        if(!isEmpty()){
            System.out.println("");
            MyNode<E> pointer = this.Head;
            while (pointer!=null){
                System.out.print(" "+pointer.getData());
                pointer=pointer.getNext();
            }
            System.out.println("");
        }
    }

}
