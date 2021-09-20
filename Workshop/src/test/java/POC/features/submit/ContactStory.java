package POC.features.submit;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import POC.steps.serenity.EndUserSteps;

@Narrative(
        title = "Submit booking form2",
        text = {"In order to get in touch with the hotel",
                "As a user2",
                "I want to be able to submit a form"}
)

@RunWith(SerenityRunner.class)
public class ContactStory {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EndUserSteps user;

    //Tags
    @WithTag("MOT")
    @Test
    public void check_page_url() {
        user.is_the_home_page();

    }
    //JIRA Integration
    @Issue("#WIKI-1")
    @Pending @Test
    public void submit_contact_form() {
        //add code to submit form;
}

    @Test
    @Ignore
    public void submit_with_errors() {
        //add code to check the errors
    }
} 