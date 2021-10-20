package setups

import geb.spock.GebReportingSpec
import io.cucumber.java.After
import io.cucumber.java.Before;

class setupPage extends GebReportingSpec{
    @Before(value="@web")
    static void login()
    {
        System.out.println("in before method")
    }
    @After(value="@web")
    static void after()

    {
        System.out.println("in after method")
    }
}
