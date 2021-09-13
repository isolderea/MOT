package POC.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

@DefaultUrl("https://automationintesting.online/#/")
public class ErrorsPage extends PageObject {

    //Define your locators
    @FindBy(css=".alert.alert-danger > p")
    private List<WebElement>  errors;

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

    public int get_number_of_errors() {
        return errors.size();
    }


}