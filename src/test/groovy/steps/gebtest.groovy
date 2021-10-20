package steps
import geb.spock.GebReportingSpec
import io.cucumber.java.en.Then
import io.cucumber.java.en.When

class gebtest extends GebReportingSpec {

    @When("user give geb")
    public void user_give_geb() {

        // go("https://mvnrepository.com/artifact/io.cucumber/cucumber-gherkin/7.0.0")
    }
    @Then("output gives")
    public void output_gives() {
        System.out.println("hi")
    }
}
