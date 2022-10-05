package DMGTPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FootBallSubMenu {

    public FootBallSubMenu(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath="//a[text()='Football']")
    public WebElement footBallSubMenu;

}
