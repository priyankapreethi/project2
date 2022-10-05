package DMGTHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUp {

    public WebDriver driver;
    BaseClass baseClass;

    public SetUp(BaseClass baseClass) {
        this.baseClass = baseClass;
    }



    @Before
    public void runBefore() throws InterruptedException {
        System.out.println("Before");
        WebDriverManager.chromedriver().setup();
        Thread.sleep(3000);
        driver = new ChromeDriver();
        Thread.sleep(3000);
        baseClass.setDriver(driver);
        baseClass.initialize(driver);


    }
    @After
    public void runAfter(){
        System.out.println("After annotation");
    }
}
