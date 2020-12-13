package org.cb.ta.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
    @DataProvider
    public static Object[][] createLoginDataFromClass() {
        Object[][] loginData = new Object[2][3];
        //login name - password - login result
        loginData[0][0] = "cb_class";
        loginData[0][1] = "pass";
        loginData[0][2] = false;

        loginData[1][0] = "codingbook_class";
        loginData[1][1] = "pass";
        loginData[1][2] = true;

        return loginData;
    }
}
