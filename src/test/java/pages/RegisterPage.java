package pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    public RegisterPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy ( id = "nav-link-accountList-nav-line-1")
    public WebElement button;

    @FindBy(linkText = "Start here.")
    public WebElement startHere;

    @FindBy(id = "ap_customer_name")
    public WebElement userNameTextBox;

    @FindBy(id = "ap_email")
    public WebElement emailTextBox;

    @FindBy(id = "ap_password")
    public WebElement passwordTextBox;

    @FindBy(id = "ap_password_check")
    public WebElement passwordConfirmationTextBox;

    @FindBy(id = "continue")
    public WebElement createAccountButton;


}
