package org.cb.ta.testng;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


public class CBMainPageTest
{
    @Test
    public void failing() {
        assertFalse(true);
    }

    @Test
    public void passing() {
        assertTrue(true);
    }
}
