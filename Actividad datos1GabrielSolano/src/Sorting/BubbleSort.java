package Sorting;

import List.DoubleList;
import List.List;
import Nodes.DoubleNode;


public class BubbleSort<T extends Comparable>{



    public void bubbleSort(DoubleList<T> List){
        T temp;
        int n = List.getLength();
        for (int i = 0; i < n-1; i++)
            for( int j = 0; j < n-1; j++)
                if (List.getNode(j).getInfo().compareTo(List.getNode(j+1).getInfo())>0){
                    temp =  List.getNode(j).getInfo();
                    List.getNode(j).setInfo(List.getNode(j+1).getInfo());
                    List.getNode(j+1).setInfo((T) temp);

                }
    }


    public void printDoubleList(DoubleList<T> List){
        int n = List.getLength();
        for (int i=0; i<n; ++i)
            System.out.println(List.getNode(i).getInfo() + " ");
        System.out.println();
    }



}
