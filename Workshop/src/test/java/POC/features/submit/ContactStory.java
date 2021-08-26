package POC.features.submit;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import POC.steps.serenity.EndUserSteps;

@RunWith(SerenityRunner.class)
public class ContactStory {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EndUserSteps user;

    @Issue("#WIKI-1")
    @Test
    public void check_page_url() {
        user.is_the_home_page();

    }

    @Pending @Test
    public void submit_contact_form() {
        //add code to submit form;
}

    @Pending @Test
    public void searching_by_ambiguious_keyword_should_display_the_disambiguation_page() {
    }
} 