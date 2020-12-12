package org.cb.ta.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;


public class BATest
{
    @BeforeClass
    public void beforeClass() {
        System.out.println(" *** Before Class");
    }

    @Test
    public void BA1() {
        System.out.println("b1");
    }
}
