package org.cb.ta.testng;

import org.testng.annotations.*;

import static org.testng.Assert.assertFalse;


public class ParametersTest
{
    @Parameters({"url", "urlTitle", "organization"})
    @Test
    public void printParams(String url, @Optional String urlTitle, String organization) {
        System.out.println(url + ":" + urlTitle + ":" + organization);
    }
}
