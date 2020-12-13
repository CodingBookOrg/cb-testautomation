package org.cb.ta.testng;

import org.testng.annotations.*;

import static org.testng.Assert.assertFalse;


public class CBMainPageTest
{
    @BeforeClass
    public void beforeClass() {
        System.out.println(" *** Before Class");
    }

    @BeforeMethod
    public void beforeMe() {
        System.out.println("Before method");
    }

    @Test(priority = 2)
    public void failing() {
        assertFalse(true);
    }

    @Test(priority = 1)
    public void passing() {
        System.out.println("passing");
    }

    @Test(priority = 3)
    public void passing2() {
        System.out.println("passing2");
    }

    @AfterMethod
    public void afterMe() {
        System.out.println("After method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println(" *** After class");
    }
}
