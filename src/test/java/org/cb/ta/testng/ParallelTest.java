package org.cb.ta.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import static org.testng.Assert.assertFalse;


public class ParallelTest
{

    @Test
    public void gotoCB() {
        System.setProperty("webdriver.chrome.driver", "webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.codingbook.org");
    }


}
