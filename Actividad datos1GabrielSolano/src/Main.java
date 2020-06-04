import List.DoubleList;
import Sorting.BubbleSort;
import Sorting.InsertionSort;
import Sorting.SelectionSort;


public class Main {

    public static void main(String[] args) {


        BubbleSort b = new BubbleSort();
        SelectionSort sel = new SelectionSort();
        InsertionSort ins = new InsertionSort();

        DoubleList<Integer > d = new DoubleList<Integer>();
        DoubleList<String > s = new DoubleList<String>();
        s.AddTail("be");
        s.AddTail("ba");
        s.AddTail("a");
        s.AddTail("d");
        s.AddTail("x");

        d.AddTail(4);
        d.AddTail(1);
        d.AddTail(2);
        d.AddTail(0);
        d.AddTail(2);
        d.AddTail(7);

        d.printing();

        System.out.println("xd");


        System.out.println("Selection");
        sel.selectionSort(s);
        sel.printDoubleList(s);
        System.out.println("Bubble");
        b.bubbleSort(d);
        b.printDoubleList(d);
        System.out.println("insertion");

        ins.insertionSort(s);
        ins.printDoubleList(s);


    }
}
