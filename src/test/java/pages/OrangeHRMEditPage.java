package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrangeHRMEditPage {
    public OrangeHRMEditPage(){
        WebDriver driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "initialRows_0_projectName")
    public WebElement projectNameBox;

    @FindBy(id = "initialRows_0_projectActivityName")
    public WebElement activityNameDropdown;

    @FindBy(id = "initialRows_0_0")
    public WebElement hoursForMonday;

    @FindBy(id = "initialRows_0_1")
    public WebElement hoursForTuesday;

    @FindBy(id = "initialRows_0_2")
    public WebElement hoursForWednesday;

    @FindBy(id = "initialRows_0_3")
    public WebElement hoursForThursday;

    @FindBy(id = "initialRows_0_4")
    public WebElement hoursForFriday;

    @FindBy(id = "submitSave")
    public WebElement saveButton;

//    @FindBy(id = "btnSubmit")
//    public WebElement submitButton;

    @FindBy(id = "timesheet_status")
    public WebElement status;

    @FindBy(id = "btnEdit")
    public WebElement editButton;

    @FindBy(id = "initialRows_0_toDelete")
    public WebElement checkBox;

    @FindBy(id = "submitRemoveRows")
    public WebElement removeRowButton;
    @FindBy(id = "//li[@class='ac_even']")
    public WebElement coke;


}
