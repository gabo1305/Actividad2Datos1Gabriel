package Tests;

import List.DoubleList;
import Sorting.BubbleSort;
import Sorting.InsertionSort;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class InsertionSortTest {

    @Test
    public void testInsertionSort(){
        ArrayList<Integer> resultado = new ArrayList<>();
        DoubleList<Integer> esperado = new DoubleList<Integer>();


        esperado.AddTail(3);
        esperado.AddTail(1);
        esperado.AddTail(2);
        InsertionSort ins = new InsertionSort();
        ins.insertionSort(esperado);
        resultado.add(1);
        resultado.add(2);
        resultado.add(3);
        for (int i=0; i<3;i++) {
            Assert.assertEquals(resultado.get(i).intValue(),esperado.get(i).intValue());
        }

        ArrayList<String> resultado2 = new ArrayList<>();
        DoubleList<String> esperado2 = new DoubleList<String>();


        esperado2.AddTail("c");
        esperado2.AddTail("a");
        esperado2.AddTail("b");
        InsertionSort ins2 = new InsertionSort();
        ins2.insertionSort(esperado2);
        resultado2.add("a");
        resultado2.add("b");
        resultado2.add("c");
        for (int i=0; i<3;i++) {
            Assert.assertEquals(resultado2.get(i).toString(),esperado2.get(i).toString());
        }

    }
}
