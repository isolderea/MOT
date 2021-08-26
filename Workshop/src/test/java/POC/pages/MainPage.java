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

    @FindBy(css="div > h1")
    private WebElement greetingText;

    //Define your locator methods
    public void enter_keywords(String keyword) {
        nameInput.sendKeys(keyword);
    }

    public String get_greeting_text() {
        return greetingText.getText();
    }

    public void submit_Form() {
        submitButton.click();
    }

}