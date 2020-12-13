package org.cb.ta.testng;

import org.testng.annotations.Test;

public class DependentTest {
    @Test(dependsOnMethods = {"test2", "test3"})
    public void test1() {

    }

    @Test
    public void test2() {

    }

    @Test
    public void test4() {

    }

    @Test(dependsOnMethods = { "test4" })
    public void test3() {

    }
}
