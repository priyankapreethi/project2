package DMGTPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DateAndTime {

    public DateAndTime(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //strong[text()='Tuesday, Oct 4th 2022']
    //span[text()= '3PM']

    @FindBy(xpath="//strong[text()='Wednesday, Oct 5th 2022']")
    public WebElement DGMTDate;

    @FindBy(xpath="//span[text()= '9AM']")
    public WebElement DGMTTime;



}
