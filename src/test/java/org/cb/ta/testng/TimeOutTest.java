package org.cb.ta.testng;

import org.testng.annotations.Test;

public class TimeOutTest {

    @Test(timeOut = 1000)
    public void testName() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Timeout test");
    }
}
