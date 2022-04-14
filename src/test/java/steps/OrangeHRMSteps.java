package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.OrangeHRMEditPage;
import pages.OrangeHRMLoginPage;
import pages.OrangeHRMTimeSheetPage;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;

public class OrangeHRMSteps {
    WebDriver driver = Driver.getDriver();
    OrangeHRMTimeSheetPage timeSheetPage = new OrangeHRMTimeSheetPage();
    OrangeHRMLoginPage loginPage = new OrangeHRMLoginPage();
    OrangeHRMEditPage editPage = new OrangeHRMEditPage();

    @Given("user navigates to the OrangeHRM application")
    public void user_navigates_to_the_OrangeHRM_application() {
        driver.get(ConfigReader.getProperty("OrangeHRM"));
    }

    @When("user provides login {string} and password {string}")
    public void userProvidesLoginAndPassword(String username, String password) {
        loginPage.userName.sendKeys(username);
        loginPage.password.sendKeys(password+ Keys.ENTER);
    }

    @When("user selects dropdown with value {string}")
    public void userSelectsStringDropdownWithValueInt(String value) {
        BrowserUtils.selectDropdownByValue(timeSheetPage.dropDown,value);
    }

    @Then("user clicks on edit button")
    public void userClicksOnEditButton() {
        timeSheetPage.editButton.click();
    }

    @And("user sends project name {string}")
    public void userSendsProjectName(String projectName){
        editPage.projectNameBox.clear();
        editPage.projectNameBox.sendKeys(projectName+Keys.TAB);


    }

    @Then("user selects administration {string} from the dropdown")
    public void userSelectsAdministrationFromTheDropdown(String activity) {
        BrowserUtils.selectDropdownByValue(editPage.activityNameDropdown,activity);
    }

    @And("user provides hours")
    public void userProvidesHours() {
        editPage.hoursForMonday.sendKeys("8");
        editPage.hoursForTuesday.sendKeys("8");
        editPage.hoursForWednesday.sendKeys("8");
        editPage.hoursForThursday.sendKeys("4");
        editPage.hoursForFriday.sendKeys("8");
    }

    @And("user clicks on save button")
    public void userClicksOnSaveButton() {
        editPage.saveButton.click();
    }
//
//    @Then("user clicks on submit button")
//    public void userClicksOnSubmitButton() {
//        editPage.submitButton.click();
//    }

    @Then("user validates status is submitted")
    public void userValidatesStatusIsSubmitted() {
        String actualMessage = editPage.status.getText();
        String expectedMessage = "Status: Submitted";
        Assert.assertEquals(expectedMessage,actualMessage);
    }

    @When("user clicks on edit button to remove")
    public void userClicksOnEditButtonToRemove() {
        editPage.editButton.click();
        editPage.checkBox.click();
        editPage.removeRowButton.click();
        System.out.println(driver.findElement(By.id("validationMsg")));
    }
}
