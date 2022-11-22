package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigatedToLoginPageSuccessfully() {

        //Find login link and click on login link
        driver.findElement(By.linkText("Log in")).click();


        String expectedMessage = "Welcome, Please Sign In!";
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualMessage = actualTextMessageElement.getText();
        Assert.assertEquals(expectedMessage, actualMessage);


    }

    @Test
    public void userShouldloginWithValidCredentials() {
        driver.findElement(By.xpath("//a[text() = 'Log in']")).click();//click on the login link
        //Enter valid username
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("test123@gmail.com");
        //Enter valid password
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("abc123");
        //click on Login button
        driver.findElement(By.xpath("//button[@type='submit' and @class='button-1 login-button']")).click();
        //verify the logout text is display
        String expectedMessage = "Log out";
        WebElement actualMessage = driver.findElement(By.xpath("//a[@class='ico-logout']"));
        String actualMessage1 = actualMessage.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void verifyTheErrorMessage() {
        driver.findElement(By.xpath("//a[text() = 'Log in']")).click();//click on the login link
        //Enter valid username
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("test12@gmail.com");
        //Enter valid password
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("test12345");
        //click on Login button
        driver.findElement(By.xpath("//button[@type='submit' and @class='button-1 login-button']")).click();
        //verify the error message is display
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "The credentials provided are incorrect";
        WebElement actualMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        String actualMessage1 = actualMessage.getText();
        Assert.assertEquals("Login not successfull", actualMessage1, expectedMessage);
    }

    @After
    public void TearDown() {
        closeBrowser();
    }


}

