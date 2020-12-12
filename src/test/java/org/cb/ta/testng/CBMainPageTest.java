package org.cb.ta.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


public class CBMainPageTest
{
    @BeforeMethod
    public void beforeMe() {
        System.out.println("Before method");
    }

    @Test
    public void failing() {
        assertFalse(true);
    }

    @Test
    public void passing() {
        System.out.println("passing");
    }

    @Test
    public void passing2() {
        System.out.println("passing2");
    }

    @AfterMethod
    public void afterMe() {
        System.out.println("After method");
    }
}
