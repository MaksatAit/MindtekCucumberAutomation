package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrangeHRMTimeSheetPage {
    public OrangeHRMTimeSheetPage(){
        WebDriver driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "startDates")
    public WebElement dropDown;

    @FindBy(id = "btnEdit")
    public WebElement editButton;



}
