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

Using groups variable @Test(groups={"Smoke", "Regression"})

16. Defining dependencies (@Test(dependsOnMethods = {"login"}))
17. Defining timeout (@Test(timeOut = 4000))) in milliseconds
18. Defining suite scoped parameter
19. Defining test scoped parameter

### NOTES
- If you do not define an order, test cases are ordered alphabetically 
