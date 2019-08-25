package pl.sdacademy.javapoz19programowanie1.lists;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class MyLinkedListTest {

    @Test
    public void addShouldAddElementRoEmptyList() {

        //  given

        MyLinkedList myLinkedList = new MyLinkedList();

//        when
        myLinkedList.add(5);

//        then
        Assert.assertEquals(1,myLinkedList.size());

    }

    @Test
    public void shouldAddElementToNonEmptyLIst() {

        //  given

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);

//        when
        myLinkedList.add(5);

//        then
        Assert.assertEquals(5,myLinkedList.size());

    }

    @Test
    public void getShoulReturnFirstElement(){
//        TODO

    }

//    @Test
//    public void getShoulReturnFirstElement(){
////        TODO

//    }

    @Test
    public void getShouldReturnMidleElement(){
//        given
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(0);
        myLinkedList.add(10);
        myLinkedList.add(20);
        myLinkedList.add(30);
        myLinkedList.add(40);
        myLinkedList.add(50);

//        when
        Integer result = myLinkedList.get(3);

//        then
        Assert.assertEquals((Integer) 30, result);

    }


    @Test
    public void removeShouldRemoveMiddleElement() {

        //        given
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(0);
        myLinkedList.add(10);
        myLinkedList.add(20);
        myLinkedList.add(30);
        myLinkedList.add(40);


//        when
        myLinkedList.remove(2);

//        then
        Assert.assertEquals(4, myLinkedList.size());
        Assert.assertEquals(0, myLinkedList.size());
        Assert.assertEquals(10, myLinkedList.size());
        Assert.assertEquals(30, myLinkedList.size());
        Assert.assertEquals(40, myLinkedList.size());

    }
}