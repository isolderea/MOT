package POC.steps.serenity;

import POC.pages.ErrorsPage;
import POC.pages.MainPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class EndUserSteps {

    MainPage HomePage;
    ErrorsPage ErrorPage;

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

    @Step
    public void are_all_errors_present() {
        HomePage.open();
        HomePage.submit_Form();
        //ErrorPage
        int error_number = ErrorPage.get_number_of_errors();
        assertThat(error_number,equalTo(5));
    }
}