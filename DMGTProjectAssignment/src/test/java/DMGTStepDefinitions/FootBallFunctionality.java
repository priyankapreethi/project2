package DMGTStepDefinitions;

import DMGTHooks.BaseClass;
import io.cucumber.java.en.Given;

public class FootBallFunctionality {


    BaseClass baseClass;

    public FootBallFunctionality(BaseClass baseClass) {
        this.baseClass = baseClass;
    }



    @Given("user clicks on football submenu")
    public void userClicksOnFootballSubmenu() {
        baseClass.getFootballsubmenu().footBallSubMenu.click();
    }
}
