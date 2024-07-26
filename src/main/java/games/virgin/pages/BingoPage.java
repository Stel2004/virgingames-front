package games.virgin.pages;

import games.virgin.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BingoPage extends Utility {

    private static final Logger log = Logger.getLogger(BingoPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Blog')]")
    WebElement bingoMenuLink;

    @CacheLookup
    @FindBy(xpath = "//div[@class='option']/label[@for='privacy_pref_optin']")
    WebElement acceptCookiesButton;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome to the Virgin Games Blog')]")
    WebElement pageTitle;

    public void clickOnAcceptCookiesButton() throws InterruptedException {
        clickOnElement(acceptCookiesButton);
        Thread.sleep(2000);
        log.info("Clicking on accept cookies button : " + acceptCookiesButton.toString());
    }

    public void clickOnBingoElement(){
        clickOnElement(bingoMenuLink);
        log.info("Clicking on bingo menu link: " + bingoMenuLink.toString());
    }

    public String getTitle(){
        return pageTitle.getText();
    }






}
