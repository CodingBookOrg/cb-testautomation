package org.cb.ta.testng;

import org.testng.annotations.*;


public class BATest
{
    @BeforeSuite
    public void beforeSuite() {
        System.out.println(" !!! Before Suite");
    }

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

    @AfterSuite
    public void afterSuite() {
        System.out.println(" !!! After Suite");
    }
}
