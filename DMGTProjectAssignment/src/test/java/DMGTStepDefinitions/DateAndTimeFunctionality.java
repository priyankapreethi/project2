package DMGTStepDefinitions;

import DMGTHooks.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTimeFunctionality {

    BaseClass baseClass;

    public DateAndTimeFunctionality(BaseClass baseClass) {
        this.baseClass = baseClass;
    }

    String currentdatedisplay;
    String currenttimedisplay;
    @Given("user opens {string}")
    public void user_opens(String string) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        baseClass.getDriver().get("https://www.dailymail.co.uk/home/index.html");
        baseClass.getDriver().manage().window().maximize();
        Thread.sleep(4000);
    }

    @When("user gets the {string} and {string}")
    public void user_gets_the_and(String string1, String string2) {
        // Write code here that turns the phrase above into concrete actions
// Create object of SimpleDateFormat class and decide the format
       DateFormat dateFormat = new SimpleDateFormat(" EEEE, MMM d yyyy");
        DateFormat dateFormatfortime = new SimpleDateFormat("ha");
        //get current date time with Date()
        Date date = new Date();
        Date fortime = new Date();
        // Now format the date
        String date1= dateFormat.format(date);
        String time1= dateFormatfortime.format(fortime);
        // Print the Date
        System.out.println("Current system date " +date1);
        System.out.println("Current system time " +time1);
        String dmgtdate =  baseClass.getDateandtime().DGMTDate.getText();

       String dmgttime =  baseClass.getDateandtime().DGMTTime.getText();
           System.out.println("xpath dmgt date "+dmgtdate);
        System.out.println("xpath dmgt time "+dmgttime);
        System.out.println(date1.equalsIgnoreCase(dmgtdate));
        System.out.println(time1.equalsIgnoreCase(dmgttime));

            /*System.out.println("current date display here");
        }else{
            System.out.println("both dates are not matched");
        }*/


       // currenttimedisplay = baseClass.getDateandtime().DGMTTime.getAttribute(string2);
       // System.out.println("current time display here"+ currenttimedisplay);

    }
}
