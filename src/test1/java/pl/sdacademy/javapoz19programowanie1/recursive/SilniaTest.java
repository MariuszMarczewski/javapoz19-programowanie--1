package pl.sdacademy.javapoz19programowanie1.recursive;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SilniaTest {

    @Test
    public void silnia(){

        Silnia test1 = new Silnia();

        Assert.assertEquals(1, test1.silnia(1));
        Assert.assertEquals(2, test1.silnia(2));
        Assert.assertEquals(6, test1.silnia(3));
        Assert.assertEquals(24, test1.silnia(4));
        Assert.assertEquals(120, test1.silnia(5));
        Assert.assertEquals(720, test1.silnia(6));

    }


    @Test
    public void fraction(){
        Silnia test2 = new Silnia();

        Assert.assertEquals(1, test2.silnia(1));
        Assert.assertEquals(2, test2.silnia(2));
        Assert.assertEquals(6, test2.silnia(3));
        Assert.assertEquals(24, test2.silnia(4));
        Assert.assertEquals(120, test2.silnia(5));
        Assert.assertEquals(720, test2.silnia(6));
    }

}