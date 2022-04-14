package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PizzaAppPage {
    public PizzaAppPage(){
        WebDriver driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "pizza1Pizza")
    public WebElement pizza1;
    @FindBy(className = "toppings1")
    public WebElement toppings1Box;
    @FindBy(className = "toppings2")
    public WebElement toppings2Box;
    @FindBy(id = "pizza1Qty")
    public WebElement quantityBox;
    @FindBy(id = "pizza1Cost")
    public WebElement cost;
    @FindBy(id = "name")
    public WebElement name;
    @FindBy(id = "email")
    public WebElement email;
    @FindBy(id = "phone")
    public WebElement phone;
    @FindBy(id = "cashpayment")
    public WebElement cashPaymentRadioButton;
    @FindBy(id = "ccpayment")
    public WebElement ccPaymentRadioButton;
    @FindBy(id = "placeOrder")
    public WebElement placeOrderButton;
    @FindBy(id = "dialog")
    public WebElement dialogWindow;
}
