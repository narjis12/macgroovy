package steps

import geb.spock.GebReportingSpec
import io.cucumber.java.en.When

class hi extends GebReportingSpec{
    @When("saia")
    public void saia() {
System.out.println("in class")
    }
}
