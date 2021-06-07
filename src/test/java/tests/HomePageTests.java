package tests;

import org.junit.Test;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.RegisterPage;
import utilities.Driver;


public class HomePageTests {
    RegisterPage registerpage = new RegisterPage();

    @Test
    public void homePageTest() throws InterruptedException {
        Driver.getDriver().get("https://www.amazon.com/");
        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(registerpage.button).perform();

        registerpage.startHere.click();

        Thread.sleep(5000);

        registerpage.userNameTextBox.sendKeys("Enis KArabulut");
        registerpage.emailTextBox.sendKeys("ekaraasada3243@gmail.com");
        registerpage.passwordTextBox.sendKeys("123123fsadf");
        registerpage.passwordConfirmationTextBox.sendKeys("123123fsadf");
        registerpage.createAccountButton.click();

        //Authentication required

        Thread.sleep(3000);
        String title = Driver.getDriver().getTitle();
        Assert.assertEquals(title,"Authentication required");
    }


        }
