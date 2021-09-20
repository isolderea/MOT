package POC.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

@DefaultUrl("https://automationintesting.online/#/")
public class MainPage extends PageObject {

    //Define your locators
    @FindBy(id="submitContact")
    private WebElement submitButton;

    @FindBy(id="name")
    private WebElement nameInput;

    @FindBy(id="email")
    private WebElement emailInput;

    @FindBy(id="subject")
    private WebElement subjectInput;

    @FindBy(id="phone")
    private WebElement phoneInput;

    @FindBy(id ="description")
    private WebElement messageInput;

    @FindBy(css="div > h1")
    private WebElement greetingText;

    @FindBy(css = "div > div.row.contact > div:nth-child(2) > div > h2")
    private  WebElement successText;

    //Define your locator methods
    public void enter_contact_information(String Name, String Email, String Phone, String Subject, String Message ) {
        nameInput.sendKeys(Name);
        emailInput.sendKeys(Email);
        subjectInput.sendKeys(Subject);
        phoneInput.sendKeys(Phone);
        messageInput.sendKeys(Message);
    }

    public String get_greeting_text() {
        return greetingText.getText();
    }

    public String get_contact_text() {
        return successText.getText();
    }

    public void submit_Form() {
        submitButton.click();
    }

}