package DMGTPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GalleryImage {

    public GalleryImage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath="//div[@class='viewGalleryText-2XMcO']")
    public WebElement galleryImage;






}
