package org.cb.ta.testng;

import org.testng.annotations.*;

import static org.testng.Assert.assertFalse;

@Listeners(TestListener.class)
public class TestListenerTest
{

    @Test
    public void failing() {
        assertFalse(true);
    }

    @Test
    public void passing() {
        System.out.println("passing");
    }

    @Test(timeOut = 1000)
    public void timeout() throws InterruptedException {
        System.out.println("timeout");
        Thread.sleep(2000);
    }
}
