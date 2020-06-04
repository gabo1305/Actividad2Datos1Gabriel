package Sorting;

import List.DoubleList;
import List.List;
import Nodes.DoubleNode;

public class SelectionSort<T extends Comparable> {

    public void selectionSort(DoubleList<T> List) {

        for(int i=0;i<List.getLength()-1;i++){
            int index=i;
            for(int j=i;j<List.getLength();j++){
                if(List.get(j).compareTo(List.get(index))<0){
                    index=j;
                }
            }
            T smaller =List.get(index);
            List.getNode(index).setInfo(List.get(i));
            List.getNode(i).setInfo(smaller);
        }
        return;

    }

    public void printDoubleList(DoubleList<T> list){
        int n = list.getLength();
        for (int i=0; i<n; ++i)
            System.out.println(list.getNode(i).getInfo() + " ");
        System.out.println();
    }
}
