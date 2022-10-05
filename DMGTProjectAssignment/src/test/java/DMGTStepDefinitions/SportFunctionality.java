package DMGTStepDefinitions;

import DMGTHooks.BaseClass;
import DMGTHooks.SetUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class SportFunctionality {

    BaseClass baseClass;

    public SportFunctionality(BaseClass baseClass) {
        this.baseClass = baseClass;
    }

   /* @When("user clicks on sport link")
    public void user_clicks_on_sport_link() throws InterruptedException {
        // Write code here that turns the phrase above into concrete
        System.out.println("user enter sportfunctionality1");
       *//* WebElement firstResult = new WebDriverWait(baseClass.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(""))));
// Print the first result
        System.out.println(firstResult.getText());*//*
        WebElement wbsport =  baseClass.getSport().sportMenu;
        Actions act = new Actions(baseClass.getDriver());
        act.doubleClick(wbsport).perform();
        Thread.sleep(2000);

    }*/
/*
    @When("user is on sports page")
    public void userIsOnSportsPage() {


        //confirmation box
       // WebElement confirmation = baseClass.getDriver()

        baseClass.getSport().gotItButtonClick.click();

        WebElement sportlink =  baseClass.getSport().sportMenu;
        //explicit wait
        WebDriverWait wait = new WebDriverWait(baseClass.getDriver(), 30);
                wait.until(ExpectedConditions.elementToBeClickable(sportlink));
        sportlink.click();

    }*/

    /*@When("user is on sports page {string}")
    public void userIsOnSportsPage(String arg0) {
        //confirmation box
        // WebElement confirmation = baseClass.getDriver()

        baseClass.getSport().gotItButtonClick.click();

        WebElement sportlink =  baseClass.getSport().sportMenu;
        //explicit wait
        WebDriverWait wait = new WebDriverWait(baseClass.getDriver(), );
        wait.until(ExpectedConditions.elementToBeClickable(sportlink));
        sportlink.click();
    }*/
    @When("user is on sports page {string}")
    public void user_is_on_sports_page(String string) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        baseClass.getSport().sportMenu.click();

        //confirmation box
        // WebElement confirmation = baseClass.getDriver()
        /*WebElement wbsport =  baseClass.getSport().sportMenu;
        Actions act = new Actions(baseClass.getDriver());
        act.doubleClick(wbsport).perform();
        Thread.sleep(3000);*/
       //baseClass.getSport().gotItButtonClick.click();

        /*WebElement sportlink =  baseClass.getSport().sportMenu;
        //explicit wait
        WebDriverWait wait = new WebDriverWait(baseClass.getDriver(),50);
        wait.until(ExpectedConditions.elementToBeClickable(sportlink));
        
        sportlink.click();*/
    }

    @And("user quit")
    public void userQuit() {
        System.out.println("print user quit");
        //baseClass.getDriver().quit();
            }



    @When("user gets sports related football sub menu")
    public void userGetsSportsRelatedFootballSubMenu() {

       /* String sportsWebElement = baseClass.getSport().sportMenu.getText();
        System.out.println(sportsWebElement+"print sport string value1");*/


    }
}
