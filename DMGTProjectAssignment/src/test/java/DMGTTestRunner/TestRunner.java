package DMGTTestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Features"},
        glue     = {"DMGTStepDefinitions", "DMGTHooks"},
        dryRun = true

)
public class TestRunner {

}
