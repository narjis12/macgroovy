import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.firefox.FirefoxDriver

System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver")
driver =  {new FirefoxDriver()}
baseUrl = "https://portal-dev.my-portal.io/home?user=demo&password=portal"
userName = "myUserName11"
environments {
    // when system property 'geb.env' is set to 'remote' use a remote Firefox driver
    windows {
        driver = {
            System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver")
            driver =  {new FirefoxDriver()}
            baseUrl = "https://portal-master.my-portal.io/home?user=demo&password=portal"
        }
    }
}
def chromeDriver(boolean headless) {
    ChromeOptions chromeOptions = new ChromeOptions()
    if (headless) chromeOptions.addArguments("--headless")
    new ChromeDriver(chromeOptions)
}

System.getenv("environments")
//reportsDir = "target/geb-reports"
autoClearCookies = false

waiting {
    timeout = 10
    retryInterval = 0.5
}