package Tests;

import List.DoubleList;
import Sorting.BubbleSort;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


public class BubbleSortTest {

    @Test
    public void testbubbleSort() {
        ArrayList <Integer> resultado = new ArrayList<Integer>();
        DoubleList<Integer> d = new DoubleList<Integer>();
        d.AddTail(3);
        d.AddTail(1);
        d.AddTail(2);
        BubbleSort b = new BubbleSort();
        b.bubbleSort(d);
        resultado.add(1);
        resultado.add(2);
        resultado.add(3);
        for (int i=0; i<3;i++) {
            Assert.assertEquals(resultado.get(i).intValue(),d.get(i).intValue());
        }


    }
}