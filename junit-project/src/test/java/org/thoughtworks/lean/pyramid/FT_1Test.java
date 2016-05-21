package org.thoughtworks.lean.pyramid;

import org.junit.Ignore;
import org.junit.Test;
import org.thoughtworks.lean.Foo;

import static org.junit.Assert.assertEquals;

public class FT_1Test {
    @Test
    public void test1() {
        new Foo();
    }

    @Test
    public void test2() throws InterruptedException {
        Thread.sleep(100);
        assertEquals(1,2);
    }

    @Ignore
    @Test
    public void test3(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test4() throws InterruptedException {
        Thread.sleep(100);
        throw new RuntimeException();
    }


}
