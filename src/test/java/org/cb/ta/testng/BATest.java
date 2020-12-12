package org.cb.ta.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class BATest
{
    @BeforeTest
    public void beforeTest() {
        System.out.println(" ### Before Test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println(" *** Before Class");
    }

    @Test
    public void BA1() {
        System.out.println("b1");
    }

    @AfterTest
    public void afterTest() {
        System.out.println(" ### After Test");
    }

}
