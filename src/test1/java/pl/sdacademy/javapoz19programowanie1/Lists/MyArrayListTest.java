package pl.sdacademy.javapoz19programowanie1.Lists;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static pl.sdacademy.javapoz19programowanie1.Lists.MyArrayList.*;

public class MyArrayListTest {

    @Test
    public void removeOfMiddleEleemntShouldRemoveItFromList() {

        //  given
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(3);
        myArrayList.add(5);
        // when

        myArrayList.remove(1);


//        then

        Assert.assertEquals(2, MyArrayList.size());

        Assert.assertEquals((Integer) 1, myArrayList.get(0));
        Assert.assertEquals((Integer) 5, myArrayList.get(1));
    }

    @Test
    public void add_replacingShouldAddElementInMiddleOfListThatofSize10(){

    }


    @Test
    public void removeOfLastEleemntShouldRemoveItFromList() {

        //  given
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(3);
        myArrayList.add(5);
        // when

        myArrayList.remove(1);


//        then

        Assert.assertEquals(2, MyArrayList.size());

        Assert.assertEquals((Integer) 1, myArrayList.get(0));
        Assert.assertEquals((Integer) 3, myArrayList.get(1));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void removeofNonExistingElementShouldThrowArrayIndexOutOfBoundException() {
//        given
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(3);
        myArrayList.add(5);

//        when
        myArrayList.remove(3);
    }


    @Test
    public void add_replacingShouldAddElementInMiddleList() {

//        given

        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0);
        myArrayList.add(10);
        myArrayList.add(22);
        myArrayList.add(40);
        myArrayList.add(50);



//        when

        myArrayList.add_replacing(3, 30);

//        then
        System.out.println();
        Assert.assertEquals(5, myArrayList);
        Assert.assertEquals((Integer) 0, myArrayList.get(0));
        Assert.assertEquals((Integer) 10, myArrayList.get(1));
        Assert.assertEquals((Integer) 20, myArrayList.get(2));
        Assert.assertEquals((Integer) 30, myArrayList.get(3));
        Assert.assertEquals((Integer) 40, myArrayList.get(4));

    }

    @Test
    public void add_replacingShouldElementAtEnd(){

        
    }

    @Test
    public void add_replacingShouldThrowArrayIndexOutOfBoundExceptionWhenAddingOnWrongIndex(){

    }


}