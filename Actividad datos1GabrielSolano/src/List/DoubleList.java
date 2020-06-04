package List;


import Nodes.DoubleNode;

import java.util.Objects;

public class DoubleList<T extends Comparable> implements List<T> {
    private DoubleNode<T> head,tail;
    private int length;

    public DoubleList(){
        head=tail=null;
        length=0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DoubleList<?> that = (DoubleList<?>) o;
        return length == that.length &&
                head.equals(that.head) &&
                tail.equals(that.tail);
    }
    @Override
    public int hashCode() {
        return Objects.hash(head, tail, length);
    }
    public void AddTail(T Newinfo){
        DoubleNode<T> temp=new DoubleNode<T>(Newinfo);
        if(head==null){
            head=tail=temp;
        }
        else {
            tail.setFront(temp);
            temp.setBack(tail);
            tail=temp;
        }
        length++;
    }

    public boolean isEmpty(){
        boolean returning=false;
        if(head==null){
            returning=true;
        }
        return returning;
    }

    public void printing(){
        DoubleNode<T> Temp;

        for(Temp=head;Temp.getFront()!=null;Temp=Temp.getFront()){
            System.out.println(Temp.getInfo());
        }
        System.out.println(tail.getInfo());
    }

    public T get(int position){
        if(position>-1 && position<length){
            if(position==0)return head.getInfo();
            if(position==length-1)return tail.getInfo();
            DoubleNode<T> temp=head.getFront();
            for(int i=1;i!=position;i++){
                temp=temp.getFront();
            }
            return temp.getInfo();

        }
        return null;
    }
    public DoubleNode<T> getNode(int position){
        if(position>-1 && position<length){
            if(position==0)return head;
            if(position==length-1)return tail;
            DoubleNode<T> temp=head.getFront();
            for(int i=1;i!=position;i++){
                temp=temp.getFront();
            }
            return temp;

        }
        return null;
    }
    public int getLength(){
        return length;
    }
}
