# TESTNG (Test Next Generation)
1. Official Web Page of TestNG
2. 
**What is a test framework?** <br>

Provides methodology and tools for testing (developing, executing, monitoring)
They simplify the test process. Junit, NUnit, PyUnit and TestNG are test frameworks
Common features:
- create test scripts
- execute test scripts
- monitor
   - logs
   - reports
- data source (excel, database)

**Why TestNG?**
    
Has features of other framework. Also has:
- hierarchy
- parallel test execution
   
3. Using
    - IntelliJ IDEA
    - Maven

4. @Test Annotation

5. testng.xml
    - suite -> test > class/..
6. Multiple xml configuration files
7. Exclude keyword (we can use regular expressions)
8. Include keyword (we can use regular expressions)
9. Using packages in a test group in xml configuration
10. @BeforeTest annotation
11. @AfterTest annotation
12. @BeforeSuite and @AfterSuite annotations
13. @BeforeClass and @AfterClass annotations
14. @BeforeMethod and @AfterMethod annotations
15. Grouping:
    - **smoke test**: A test suite that covers the main functionality of
      a component or system to determine whether it works properly
      before planned testing begins.

    - **regression testing**: A type of change-related testing to detect
      whether defects have been introduced or uncovered in unchanged areas
      of the software. 
      
a) Define groups in xml configuration <br>
`    <groups>`<br>
`<define name="smoke"></define>`<br>
`<define name="e2e"></define>`<br>
`<run><include name="smoke"/></run>`<br>
`</groups>`<br><br>
We can use regular expressions in xml file (eg: request*, fix.*)
<br>

b) Use groups variable `@Test(groups={"Smoke", "Regression"})`


16. Defining dependencies `(@Test(dependsOnMethods = {"login"}))`<br>
    Eg: Logout depends on Login
17. Defining timeout `(@Test(timeOut = 4000)))` in milliseconds <br>
    Eg: Performance related tests
18. Defining suite scoped parameter
19. Defining test scoped parameter
20. @DataProvider (In a method or in a separate class using static 
    modifier) annotation and dataProvider attribute in @Test annotation.
    @Optional annotation for optional values.
21. TestNG Listeners
22. Parallel execution
23. Ordering by priority


## NOTES
- If you do not define an order, test cases are ordered alphabetically
  (you can use @dependsOnX or @Test(priority = "1"))
- Access modifier for each test method should be `public`, 
  otherwise it will not be run
- Parameter order for TestNG and Junit are different. 
  So moving form one framework to another might cause headaches.
  Because of that, TestNG has org.testng.AssetJUnit package.
  By using this, you can easily change from TestNG to JUnit or vice versa
- @BeforeX and @AfterX annotations are called **Configuration** annotations.
  All @Test methods are dependent on these methods
- If any method that is dependent upon fails, then 
  test is skipped ( not failed ) <br>
  Eg: A `signin` error should cause `user dashboard` test to skip, not fail 
  
- ###Assert Types:
    - **Hard Asserts:** If an error occurs; it will not continue to test the
    following assertions in the same test method (using try-catch block 
    will end up wrong test results; so, it is not suggested)
      <br><br>
    - **Soft Asserts:** If an error occurs; it will still continue to test the
    following assertions in the same test method (SoftAssert class )
