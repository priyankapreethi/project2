import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class sprotsAndFootBallNavigation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        //  Thread.sleep(3000);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.dailymail.co.uk/home/index.html");
        driver.manage().window().maximize();


       /* String sportsWebElement = driver.findElement(By.xpath("//a[@xpath = '1']")).getText();
        System.out.println(sportsWebElement + "print sport string value1");

        //List<WebElement> list = (List<WebElement>) driver.findElement(By.xpath("//a[@xpath = '1']"));
        // System.out.println(list + "print sport string value1");


        ArrayList<String> al = new ArrayList<String>();

        al.add(sportsWebElement);
        System.out.println(al.get(0));
        System.out.println(al);
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).equalsIgnoreCase("Sports")) {
                System.out.println("the menu item has sports");

            }

        }*/
      // List<WebElement> abc = driver.findElements(By.xpath("//*[@class='link-wocc linkro-wocc selected']"));
       // List<WebElement> abc = driver.findElements(By.xpath("//*[@class='nav-primary cleared bdrgr3 cnr5']"));

       // System.out.println(abc);

       /* for(int i=0;i<abc.size();i++) {
            if(abc.get(i).getText().equalsIgnoreCase("Sports")){
                System.out.println(abc.get(i).getText().toUpperCase());
            }*/
        }

    }











