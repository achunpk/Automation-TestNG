package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import java.lang.Thread.*;

public class GoogleTest
{
    WebDriver driver;

    @BeforeMethod
    public void setUp()
    {
     System.setProperty("webdriver.chrome.driver","C:/Users/nimal/Automation-selenium/Automation-TestNG/chromedriver.exe");
     driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().deleteAllCookies();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
     driver.get("http://www.google.com");
    }

    @Test
    public void googleTitleTest()
    {
        String title=driver.getTitle();
        System.out.println(title);
    }

    @Test
    public void googleLogoTest() throws InterruptedException {

        boolean b2 = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
    }

    @Test
    public void GmailLinkTest()
    {  boolean b1 = driver.findElement(By.linkText("Gmail")).isDisplayed();

    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
