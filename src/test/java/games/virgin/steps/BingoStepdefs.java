package games.virgin.steps;

import games.virgin.pages.BingoPage;
import games.virgin.pages.GamePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class BingoStepdefs {

    @Given("I am on home pages {string}")
    public void iAmOnHomePages(String expectedUrl) throws InterruptedException {
        new BingoPage().clickOnAcceptCookiesButton();
        Assert.assertEquals( expectedUrl, new GamePage().getTheCurrentUrl(), "User is not on homepage");

    }

    @When("I click on Blog menu link")
    public void iClickOnBlogMenuLink() {
        new BingoPage().clickOnBingoElement();
    }

    @Then("I should be on Bingo page and verified the page heading")
    public void iShouldBeOnBingoPageAndVerifiedThePageHeading() {
        Assert.assertEquals( "Welcome to the Virgin Games Blog", new BingoPage().getTitle(), "User is not on bingo page");
    }
}
