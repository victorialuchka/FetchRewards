package step_defs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pages.MainPage;
import org.junit.AfterClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pojo.LeftBowlDataContainer;
import pojo.RightBowlDataContainer;
import utilities.Button;
import utilities.ConfigReader;
import utilities.Driver;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FakeGoldBar {

    WebDriver driver = Driver.getDriver();
    MainPage mainPage = new MainPage(driver);
    private String firstLeftNumber;
    private String secondLeftNumber;
    private String firstRightNumber;
    private String secondRightNumber;
    private String fakeGoldBar;

    @Given("^User is on Fetch Rewards Game page$")
    public void user_is_on_Fetch_Rewards_Game_page() {
        driver.get(ConfigReader.getProperty("game.link"));
        assertEquals("Login page title mismatch!", "React App", driver.getTitle());
    }

    @When("^user inserts the following numbers in the left bowl$")
    public void user_inserts_the_following_numbers_in_the_left_bowl(List<LeftBowlDataContainer> leftBowl) {
        mainPage.getLeftZero().sendKeys(leftBowl.get(0).getLeft0());
        mainPage.getLeftOne().sendKeys(leftBowl.get(0).getLeft1());
        mainPage.getLeftTwo().sendKeys(leftBowl.get(0).getLeft2());
        mainPage.getLeftThree().sendKeys(leftBowl.get(0).getLeft3());
    }

    @When("^user inserts the following numbers in the right bowl$")
    public void user_inserts_the_following_numbers_in_the_right_bowl(List<RightBowlDataContainer> rightBowl) {
        mainPage.getRightZero().sendKeys(rightBowl.get(0).getRight0());
        mainPage.getRightOne().sendKeys(rightBowl.get(0).getRight1());
        mainPage.getRightTwo().sendKeys(rightBowl.get(0).getRight2());
        mainPage.getRightThree().sendKeys(rightBowl.get(0).getRight3());
    }


    @When("^user verifies the weighing list$")
    public void user_verifies_the_weighing_list() {
        String list = mainPage.getWeighingList().get(0).getText();
        System.out.println("List from the first time: " + list);
        if (list.contains("<")) {
            firstLeftNumber = String.valueOf(list.charAt(1));
            secondLeftNumber = String.valueOf(list.charAt(3));
            firstRightNumber = String.valueOf(list.charAt(5));
            secondRightNumber = String.valueOf(list.charAt(7));
        } else if (list.contains(">")) {
            firstLeftNumber = String.valueOf(list.charAt(13));
            secondLeftNumber = String.valueOf(list.charAt(15));
            firstRightNumber = String.valueOf(list.charAt(17));
            secondRightNumber = String.valueOf(list.charAt(19));
        } else if (list.contains("=")) {
            fakeGoldBar = mainPage.getEight().getText();
        }
    }

    @When("^user verifies the weighing list second time$")
    public void user_verifies_the_weighing_list_second_time() {
        if (fakeGoldBar == null) {
            String list = mainPage.getWeighingList().get(1).getText();
            System.out.println("List from second time: " + list);
            if (list.contains("<")) {
                firstLeftNumber = String.valueOf(list.charAt(1));
                firstRightNumber = String.valueOf(list.charAt(3));
            } else if (list.contains(">")) {
                firstLeftNumber = String.valueOf(list.charAt(9));
                firstRightNumber = String.valueOf(list.charAt(11));
            }
        }
    }

    @When("^user verifies the weighing list third time$")
    public void user_verifies_the_weighing_list_third_time() {
        if (fakeGoldBar == null) {
            String list = mainPage.getWeighingList().get(2).getText();
            System.out.println("List from third time: " + list);
            if (list.contains("<")) {
                fakeGoldBar = String.valueOf(list.charAt(1));
            } else if (list.contains(">")) {
                fakeGoldBar = String.valueOf(list.charAt(7));
            }
        }
    }

    @Then("^user inserts 2 numbers in the left bowl$")
    public void user_inserts_2_numbers_in_the_left_bowl() throws InterruptedException {
        if (fakeGoldBar == null) {
            Thread.sleep(3000);
            mainPage.getLeftZero().sendKeys(firstLeftNumber);
            mainPage.getLeftOne().sendKeys(secondLeftNumber);
        }
    }

    @Then("^user inserts 2 numbers in the right bowl$")
    public void user_inserts_2_numbers_in_the_right_bowl() throws InterruptedException {
        if (fakeGoldBar == null) {
            Thread.sleep(3000);
            mainPage.getRightZero().sendKeys(firstRightNumber);
            mainPage.getRightOne().sendKeys(secondRightNumber);
        }
    }

    @Then("^user clicks on \"([^\"]*)\" button$")
    public void user_clicks_on_button(Button button) throws InterruptedException {
        if (fakeGoldBar == null) {
            if (button.equals(Button.RESET)) {
                mainPage.getResetButton().click();
            } else if (button.equals(Button.WEIGH)) {
                mainPage.getWeightButton().click();
            } else {
                mainPage.getResultButton().click();
            }
        }
        Thread.sleep(2000);
    }


    @Then("^user inserts 1 number in the left bowl$")
    public void user_inserts_1_number_in_the_left_bowl() throws InterruptedException {
        if (fakeGoldBar == null) {
            Thread.sleep(2000);
            mainPage.getLeftZero().sendKeys(firstLeftNumber);
        }
    }

    @Then("^user inserts 1 number in the right bowl$")
    public void user_inserts_1_number_in_the_right_bowl() throws InterruptedException {
        if (fakeGoldBar == null) {
            Thread.sleep(2000);
            mainPage.getRightZero().sendKeys(firstRightNumber);
        }
    }


    @Then("^user clicks on fake gold bar and verifies pop-up message \"([^\"]*)\"$")
    public void user_clicks_on_fake_gold_bar_and_verifies_pop_up_message(String expectedMessage)  {
        List<WebElement> coinList = mainPage.getCoinList();

        try {
            for (int i = 0; i < coinList.size(); i++) {
                if (coinList.get(i).getText().equals(fakeGoldBar)) {
                    System.out.println("fake gold bar:" + fakeGoldBar);
                    coinList.get(i).click();
                    Thread.sleep(1000);
                    Alert alert = driver.switchTo().alert();
                    assertEquals("Alert text is not matching!", expectedMessage, alert.getText());
                    System.out.println("Alert message is: " + alert.getText());
                    alert.accept();
                }
            }
        } catch (Exception e) {
            System.out.println("Error");

        }
    }

    @When("^user clicks on random fake gold bar and verifies error pop-up message \"([^\"]*)\"$")
    public void user_clicks_on_random_fake_gold_bar_and_verifies_error_pop_up_message(String expectedMessage) throws InterruptedException {
        mainPage.getCoinList().get(0).click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        assertEquals("Alert text is not matching!", expectedMessage, alert.getText());
        System.out.println("Alert message is: " + alert.getText());
        alert.accept();

    }

    @Then("^user gets list of Weighings and outputs it$")
    public void user_gets_list_of_Weighings_and_outputs_it() {
        List<WebElement> weighingList = mainPage.getWeighingList();
        System.out.println("Number of weighings: " + weighingList.size());
        System.out.println("Weighings:");

        if (weighingList.size() >= 1) {
            for (WebElement element : weighingList) {
                System.out.println(element.getText());
            }
        }
    }

    @AfterClass
    public static void tearDown(){
        Driver.closeDriver();
    }

}
