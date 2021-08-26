package POC.steps.serenity;

import POC.pages.MainPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class EndUserSteps {

    MainPage HomePage;

    @Step
    public void enters(String keyword) {
        HomePage.enter_keywords(keyword);
    }

    @Step
    public void is_the_home_page() {
        HomePage.open();
        String title = HomePage.get_greeting_text();
        assertThat(title, containsString("Welcomed"));
    }

    @Step
    public void submit() {
        HomePage.submit_Form();
    }

}