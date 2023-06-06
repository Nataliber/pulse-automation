package test.java.io.prompt.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {                          //the type , place where store,the name of report files
                //"pretty",  used to print out additional information about the
                // scenario currently executed
                "rerun:target/rerun.txt",   // generates rerun.txt for keep tracking of failed tests
                "json:target/cucumber.json",  //generates cucumber json report
                "html:target/cucumber-report.html", //generates default cucumber html report
                "timeline:target/timeline-report",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = {
                "src/test/resources/features"
        },
        glue = "io/prompt/step_definitions", // glue : where we pass step_definitions path
        dryRun = false,  //turn on and off our step_definition implementations running
                        // or not so we can easily generate snippet.
        tags = "@broadcast",
        publish = false
)


public class PromptRunner {


}




