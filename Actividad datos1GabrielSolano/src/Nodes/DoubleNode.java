package Nodes;


public class DoubleNode<T> {
    private T info;//Stored Information
    private DoubleNode<T> Back;//The next node reference
    private DoubleNode<T> Front;//The prior node reference


    public DoubleNode(T info, DoubleNode<T> Back, DoubleNode<T> Front){
        this.Back=Back;
        this.info=info;
        this.Front=Front;
    }

    public DoubleNode(T info){
        this(info,null,null);
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public void setBack(DoubleNode<T> back) {
        Back = back;
    }

    public void setFront(DoubleNode<T> front) {
        Front = front;
    }

    public T getInfo() {
        return info;
    }


    public DoubleNode<T> getFront() {
        return Front;
    }
}