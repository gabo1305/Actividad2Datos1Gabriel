package Tests;

import List.DoubleList;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DoubleListTest {

    @Test
    public void addTail() {
        //Obtenemos el ultimo elemento de la lista, para verificar que se agrega al final
        DoubleList<String> resultado = new DoubleList<String>();
        resultado.AddTail("H");
        resultado.AddTail("X");
        resultado.AddTail("Z");
        Assert.assertEquals("Z",resultado.get(resultado.getLength()-1));
    }

    @Test
    public void isEmpty() {
        DoubleList prueba = new DoubleList();
        Assert.assertEquals(true,prueba.isEmpty());

        DoubleList prueba2 = new DoubleList();
        prueba2.AddTail(5);
        Assert.assertEquals(false,prueba2.isEmpty());
    }

    @Test
    public void get() {
        DoubleList test = new DoubleList();
        test.AddTail("Hola");
        test.AddTail("Buenas");//Posición 1
        test.AddTail("Pura vida");
        Assert.assertEquals("Buenas",test.get(1));

    }


    @Test
    public void getLength() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Hola");
        arrayList.add("Buenas");
        arrayList.add("Pura vida");
        arrayList.add("Adios");//Largo 4


        DoubleList list = new DoubleList();
        list.AddTail("Hola");
        list.AddTail("Buenas");
        list.AddTail("Pura vida");
        list.AddTail("Adios");//Largo 4
        Assert.assertEquals(arrayList.size(),list.getLength());

    }

}