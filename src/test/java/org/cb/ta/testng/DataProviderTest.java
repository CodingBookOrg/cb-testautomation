package org.cb.ta.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
    @Test(dataProvider = "createLoginData")
    public void printData(String userName, String password, boolean result) {
        System.out.println(userName+":"+password+":"+result);
    }

    @Test(dataProvider = "createLoginDataFromClass", dataProviderClass = DataProviderClass.class)
    public void dataFromClass(String userName, String password, boolean result) {
        System.out.println(userName+":"+password+":"+result);
    }

    @DataProvider
    public Object[][] createLoginData() {
        Object[][] loginData = new Object[2][3];
        //login name - password - login result
        loginData[0][0] = "cb";
        loginData[0][1] = "pass";
        loginData[0][2] = false;

        loginData[1][0] = "codingbook";
        loginData[1][1] = "pass";
        loginData[1][2] = true;

        return loginData;
    }
}
