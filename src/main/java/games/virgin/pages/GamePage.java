package games.virgin.pages;

import games.virgin.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GamePage extends Utility {
    private static final Logger log = Logger.getLogger(GamePage.class.getName());

    public GamePage() {
        PageFactory.initElements(driver, this);
    }

    public String getTheCurrentUrl() {
        return driver.getCurrentUrl();
    }

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Allow all cookies')]")
    WebElement acceptCookiesButton;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Login')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='option']/label[@for='privacy_pref_optin']")
    WebElement acceptCookiesButtonn;

    public void clickOnAcceptCookiesButton() throws InterruptedException {
        clickOnElement(acceptCookiesButtonn);
        Thread.sleep(2000);
        log.info("Clicking on accept cookies button : " + acceptCookiesButtonn.toString());
    }

    @CacheLookup
    @FindBy(linkText = "Login")
    WebElement loginLink;

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("Clicking on login link : " + loginLink.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Join Now')]")
    WebElement joinNow;

    public void clickOnJoinNow() {
        clickOnElement(joinNow);
        log.info("Clicking on join now : " + joinNow.toString());
    }


}
