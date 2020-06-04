package Sorting;

import List.DoubleList;

public class InsertionSort<T extends Comparable> {

    public void insertionSort(DoubleList<T> list) {
        int n = list.getLength();
        for (int j =1; j < n; j++) {
            T key = (T)list.get(j);
            int i = j - 1;
            while ((i > -1) && (list.get(i).compareTo(key)>0)) {
                list.getNode(i + 1).setInfo(list.get(i));
                i--;
            }
            list.getNode(i + 1).setInfo(key);

        }
        return;
    }
    public void printDoubleList(DoubleList<Integer> list){
        int n = list.getLength();
        for (int i=0; i<n; ++i)
            System.out.println(list.getNode(i).getInfo() + " ");
        System.out.println();
    }
}


