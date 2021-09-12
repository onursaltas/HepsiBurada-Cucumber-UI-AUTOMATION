package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", //"src/test/java/Iphone.feature"yazarsak sadece belirli bir feature file run edilir.
        plugin = { "pretty", "html:target/cucumber-reports" },
        glue= {"stepDefinitions"},
        monochrome = false

        /*   Bu kullanıldığı takdirde daha detalı bir report sağlar.
        plugin = {"pretty",
                "html:target/site/cucumber-pretty",
                "json:target/cucumber.json","html:target/cucumber-html-report","usage:target/cucumber-usage.json","" +
                "junit:target/cucumber-results.xml"}
         */

)
public class TestRunner {
}