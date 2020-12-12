package org.cb.ta;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CBMainPageTest
{
    @Test
    public void gotoCodingBook() {
        System.setProperty("webdriver.chrome.driver", "webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.codingbook.org");
    }
}
