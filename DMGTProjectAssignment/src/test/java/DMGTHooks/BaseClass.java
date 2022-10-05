package DMGTHooks;

import DMGTPageObjects.DateAndTime;
import DMGTPageObjects.FootBallSubMenu;
import DMGTPageObjects.GalleryImage;
import DMGTPageObjects.SportMenu;
import org.openqa.selenium.WebDriver;

public class BaseClass {

    WebDriver driver;
    DateAndTime dateandtime;

    SportMenu sport;

    FootBallSubMenu footballsubmenu;

    GalleryImage galimg;

    public GalleryImage getGalimg() {
        return galimg;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public DateAndTime getDateandtime() {
        return dateandtime;
    }

    public SportMenu getSport() {
        return sport;
    }

    public FootBallSubMenu getFootballsubmenu() {
        return footballsubmenu;
    }

    public void initialize(WebDriver driver){

        dateandtime = new  DateAndTime(driver);
        sport = new SportMenu(driver);
        footballsubmenu = new FootBallSubMenu(driver);
        galimg = new GalleryImage(driver);
    }
}