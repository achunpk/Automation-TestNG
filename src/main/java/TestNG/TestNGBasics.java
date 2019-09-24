package TestNG;

import org.testng.annotations.*;

public class TestNGBasics {
    //PRE-CONDITIONS ANNOTATIONS----->STARTING WITH @Before
    @BeforeSuite //1
    public void setUp()
    {
        System.out.println("Setup system property for chrome");
    }

    @BeforeClass //3
    public void launchBrowser()
    {
        System.out.println("Launch chrome browser");
    }

    @BeforeMethod //4
    public void enterURL()
    {
        System.out.println("Enter URL");
    }

    @BeforeTest //2
    public void login()
    {
        System.out.println("Login method");
    }

    //TEST CASE ---->STARTING WITH @Test
    @Test //5
    public void googleTitleTest()
    {
        System.out.println("Google Title test");
    }


    @Test
    public void searchTest()
    {
        System.out.println("Search Test");
    }

    //POST CONDITIONS ----->STARTING WITH @After
    @AfterMethod //6
    public void logout()
    {
        System.out.println("Logout method");
    }

    @AfterTest //8
    public void deleteAllCookies()
    {
        System.out.println("Delete all cookies");
    }

    @AfterClass //7
    public void closeBrowser()
    {
        System.out.println("Close the browser");
    }

    /*@AfterSuite
    public void generateTestReport() {
        System.out.println("generateTestReport");
    }*/
}

/*Output
*
*
Setup system property for chrome
Launch chrome browser
Login method
Enter URL
Google Title test
Logout method
Close the browser
Delete all cookies
PASSED:Google title test
*/
