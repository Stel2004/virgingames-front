package games.virgin.steps;

import games.virgin.pages.GamePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class GameSteps {

    @Given("I am on home page {string}")
    public void iAmOnHomePage(String expectedUrl) throws InterruptedException {
        new GamePage().clickOnAcceptCookiesButton();
        Assert.assertEquals( expectedUrl, new GamePage().getTheCurrentUrl(), "User is not on homepage");

    }

    @When("I click on login button")
    public void iClickOnLoginButton() {
        new GamePage().clickOnLoginLink();
    }

    @Then("I should be on login-page {string}")
    public void iShouldBeOnLoginPage(String expectedUrl) {
        Assert.assertEquals( expectedUrl, new GamePage().getTheCurrentUrl(), "User is not on login page");

    }
}
