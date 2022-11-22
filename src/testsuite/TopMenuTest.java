package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {

        //Verify the text 'Computers'
        String expectedMessage = "Computers";
        WebElement message = driver.findElement(By.xpath("//div[@class='header-menu']//ul[1]//li[1]//a[text()='Computers ']"));
        String actualMessage = message.getText();//converting webElement into string
        Assert.assertEquals(expectedMessage, actualMessage);//verifying using the assert method

        //click on 'computers' tab and verify that user succefully naviagate
        driver.findElement(By.linkText("Computers")).click();

    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {

        //click on Electronics tab and verify that user can succesfully navigate
        driver.findElement(By.linkText("Electronics")).click();

        //verify the text Electronics
        String expectedMessage1 = "Electronics";
        WebElement message1 = driver.findElement(By.xpath("//div[@class='header-menu']//ul[1]//li[2]//a[text()='Electronics ']"));
        String actualMessage1 = message1.getText();
    }

    @Test

    public void userShouldNavigateToTApparelPageSuccessfull() {
        //click on 'Apparel' tab and verify that user succefully naviagate
        driver.findElement(By.linkText("Apparel")).click();

        //Verify the text 'Apparel'
        String expectedMessage = "Apparel";
        WebElement message = driver.findElement(By.xpath("//div[@class='header-menu']//ul[1]//li[3]//a[text()='Apparel ']"));
        String actualMessage = message.getText();//converting webElement into string
        Assert.assertEquals(expectedMessage, actualMessage);//verifying using the assert method

    }

    @Test
    public void userShouldNavigateToDigitalDownloadPageSuccessfull() {
        //click on 'Digital Download' tab and verify that user succefully naviagate
        driver.findElement(By.linkText("Digital downloads")).click();

        //Verify the text 'Digital downloads'
        String expectedMessage = "Digital downloads";
        WebElement message = driver.findElement(By.xpath("//div[@class='header-menu']//ul[1]//li[4]//a[text()='Digital downloads ']"));
        String actualMessage = message.getText();//converting webElement into string
        Assert.assertEquals(expectedMessage, actualMessage);//verifying using the assert method

    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        //click on 'Books' tab and verify that user succefully naviagate
        driver.findElement(By.linkText("Books")).click();

        //Verify the text 'Books'
        String expectedMessage = "Books";
        WebElement message = driver.findElement(By.xpath("//div[@class='header-menu']//ul[1]//li[5]//a[text()='Books ']"));
        String actualMessage = message.getText();//converting webElement into string
        Assert.assertEquals(expectedMessage, actualMessage);//verifying using the assert method

    }

    @Test
    public void userShouldNavigateToJewlryPageSuccessfull() {
        //click on 'Jewelry ' tab and verify that user succefully naviagate
        driver.findElement(By.linkText("Jewelry")).click();

        //Verify the text 'Jewelry '
        String expectedMessage = "Jewelry";
        WebElement message = driver.findElement(By.xpath("//div[@class='header-menu']//ul[1]//li[6]//a[text()='Jewelry ']"));
        String actualMessage = message.getText();//converting webElement into string
        Assert.assertEquals(expectedMessage, actualMessage);//verifying using the assert method

    }

    @Test
    public void userShoudNavigateToGiftCardPageSuccessfull() {
        //click on 'Gift Cards  ' tab and verify that user succefully naviagate
        driver.findElement(By.linkText("Gift Cards")).click();

        //Verify the text 'Gift Cards '
        String expectedMessage = "Gift Cards";
        WebElement message = driver.findElement(By.xpath("//div[@class='header-menu']//ul[1]//li[7]//a[text()='Gift Cards ']"));
        String actualMessage = message.getText();//converting webElement into string
        Assert.assertEquals(expectedMessage, actualMessage);//verifying using the assert method
    }

    @After
    public void closebar() {
        driver.quit();
    }
}

