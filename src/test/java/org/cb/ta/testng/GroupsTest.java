package org.cb.ta.testng;

import org.testng.annotations.Test;

public class GroupsTest {
    @Test(groups = {"smoke", "e2e"})
    public void test1() {
    }

    @Test(groups = {"smoke", "e2e"})
    public void test2() {
    }

    @Test(groups = {"e2e"})
    public void test3() {
    }

    @Test(groups = {"e2e"})
    public void test4() {
    }

    @Test(groups = {"e2e"})
    public void test5() {
    }
}
