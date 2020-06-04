package Tests;

import List.DoubleList;
import Sorting.InsertionSort;
import Sorting.SelectionSort;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class SelectionSortTest {
    @Test
    public void SelectionTest(){
        ArrayList<Integer> resultado = new ArrayList<>();
        DoubleList<Integer> esperado = new DoubleList<Integer>();

        DoubleList<Integer> d = new DoubleList<Integer>();
        d.AddTail(3);
        d.AddTail(1);
        d.AddTail(2);
        SelectionSort sel = new SelectionSort();
        sel.selectionSort(d);
        resultado.add(1);
        resultado.add(2);
        resultado.add(3);
        for (int i=0; i<3;i++) {
            Assert.assertEquals(resultado.get(i).intValue(),d.get(i).intValue());
        }

    }
}
