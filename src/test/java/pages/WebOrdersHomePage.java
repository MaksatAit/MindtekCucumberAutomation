package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebOrdersHomePage {
    public WebOrdersHomePage(){
        WebDriver driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@href='Process.aspx']")
    public WebElement orderModule;

    @FindBy(xpath = "//a[@href='Default.aspx']")
    public WebElement allOrders;

    @FindBy(xpath = "//tbody//tr[2]//td[2]")
    public WebElement firstName;
}
