package DMGTPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SportMenu {

    public SportMenu(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath="//a[@xpath = '1']")
    public WebElement sportMenu;


    @FindBy(xpath="//button[@class='button_127GD primary_2xk2l']")
    public WebElement gotItButtonClick;



public void sportMethod(){
    sportMenu.click();
}
}
