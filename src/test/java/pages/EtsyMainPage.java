package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class EtsyMainPage {
    public EtsyMainPage(){
        WebDriver driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "global-enhancements-search-query")
    public WebElement searchBox;

    @FindBy(xpath = "//span[@class='wt-icon wt-icon--smaller-xs']")
    public WebElement filterButton;

    @FindBy(xpath = "//label[@for='price-input-4']")
    public WebElement buttonOver_1000;

    @FindBy(xpath = "//button[@class='wt-btn wt-btn--primary wt-width-full wt-mt-xs-3 wt-mb-xs-3 wt-mr-xs-3']")
    public WebElement applyButton;

    @FindBy(xpath = "//p[@class='wt-text-title-01']//span[@class='currency-value']")
    public List <WebElement> listOfPrices;

    @FindBy(tagName = "h3")
    public List<WebElement> itemsNames;

    @FindBy(xpath = "//span[@class='wt-display-table-cell wt-text-left-xs']")
    public WebElement mothersDayGift;
    @FindBy(id = "catnav-primary-link-10855")
    public WebElement jewelryAndAccessories;

    @FindBy(id = "catnav-primary-link-10923")
    public WebElement clothingAndShoes;

    @FindBy(id = "catnav-primary-link-891")
    public WebElement homeAndLiving;

    @FindBy(id = "catnav-primary-link-10983")
    public WebElement weddingAndParty;

    @FindBy(id = "catnav-primary-link-11049")
    public WebElement toyAndEntertainment;

    @FindBy(id = "catnav-primary-link-66")
    public WebElement artAndCollectibles;

    @FindBy(id = "catnav-primary-link-562")
    public WebElement craftAndSupplies;

    @FindBy(id = "catnav-primary-link--10")
    public WebElement giftAndGiftCards;
}
