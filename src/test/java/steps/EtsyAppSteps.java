package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.EtsyMainPage;
import utilities.ConfigReader;
import utilities.Driver;
import java.util.List;
import java.util.Locale;

public class EtsyAppSteps {
    WebDriver driver = Driver.getDriver();
    EtsyMainPage mainPage = new EtsyMainPage();

    @Given("user navigates to the Etsy application")
    public void user_navigates_to_the_Etsy_application() {
        driver.get(ConfigReader.getProperty("EtsyUrl"));
    }

    @When("user searches for {string}")
    public void user_searches_for(String itemName) {
        mainPage.searchBox.sendKeys(itemName+ Keys.ENTER);
    }

    @When("user applies for price filter over {int}")
    public void user_applies_for_price_filter_over(Integer int1) {
        mainPage.filterButton.click();
        mainPage.buttonOver_1000.click();
        mainPage.applyButton.click();
    }

    @Then("user validates that the items price is equal or over {double}")
    public void user_validates_that_the_items_price_is_equal_or_over(Double double1) throws InterruptedException {

        List<WebElement> prices = mainPage.listOfPrices;
        Thread.sleep(3000);

//        boolean moreThan1000 = false;
        for (WebElement element : prices){
            String strPrice = element.getText().replace(",","");
            double doublePrice = Double.parseDouble(strPrice);
            Assert.assertTrue(doublePrice>=double1);
        }
    }

    @Then("user validates search result items contain keyword {string} or {string}")
    public void userValidatesSearchResultItemsContainKeyword(String item1, String item2) {
        List<WebElement> itemsNames = mainPage.itemsNames;

        for (int i = 0; i < itemsNames.size(); i++) {
            String strItem = itemsNames.get(i).getText();
            boolean condition = strItem.toLowerCase().contains(item1) || strItem.toLowerCase().contains(item2);
            if (condition) {
                StringBuilder stb = new StringBuilder();
                stb.append(strItem);
                System.out.println(strItem);
                Assert.assertTrue(strItem.toLowerCase(Locale.ROOT).contains(item1) || strItem.toLowerCase(Locale.ROOT).contains(item2));
            }
        }
    }

    @When("user clicks on {string} section")
    public void userClicksOnSection(String section) {
        if(section.equalsIgnoreCase("Mother's Day Gifts")){
            mainPage.mothersDayGift.click();
        }else if(section.equalsIgnoreCase("Jewelry and Accessories")){
            mainPage.jewelryAndAccessories.click();
        }else if(section.equalsIgnoreCase("Clothing and Shoes")){
            mainPage.clothingAndShoes.click();
        }else if(section.equalsIgnoreCase("Home & Living")){
            mainPage.homeAndLiving.click();
        }else if(section.equalsIgnoreCase("Wedding & Party")){
            mainPage.weddingAndParty.click();
        }else if(section.equalsIgnoreCase("Toys & Entertainment")){
            mainPage.toyAndEntertainment.click();
        }else if(section.equalsIgnoreCase("Art & Collectibles")){
            mainPage.artAndCollectibles.click();
        }else if(section.equalsIgnoreCase("Craft Supplies and Tools")){
            mainPage.craftAndSupplies.click();
        }else if(section.equalsIgnoreCase("Gift and Gift Cards")){
            mainPage.giftAndGiftCards.click();
        }
    }

    @Then("user validates title is {string}")
    public void userValidatesTitleIs(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
}
