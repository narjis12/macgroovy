package pages
import geb.Page
class LoginPage extends Page{
    static at ={
        waitFor { title == "Portal DEV Live" }
        driver.manage().window().maximize()
        waitFor {$(".login-logout-navigation .flex-auto")}

    }
    static content ={
        loginButtonclick{$(".login-logout-navigation .flex-auto").click()}
        // logincredentials{module(Login)}
        //asaa{$(By.id(""))}

    }

}