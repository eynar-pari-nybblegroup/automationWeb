package cleanTest.todoLy;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import utils.GetProperties;

public class LoginParamaterTest extends TestBaseTodoLy{
   // @Test
    @ParameterizedTest
    @CsvSource(
         {
            "ngroup001@ng.com,12345",
            "fhr@fhr.com,12345",
            "usertodoly@gmail.com,danger1234",
            "enzo222@gmail.com,enzo222"
         }
    )
    @Order(1)
    @DisplayName("Verify login is successfully")
    @Description("this test case is to verify the login using valid credentials with any role")
    @Owner("Eynar")
    @Link("www.jira.com/doc01")
    @Issue("www.jira.com/bug0005")
    @Lead("Testttt")
    @Epic("Login")
    @Feature("Authentication")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Story Login")
    @Tag("Sanity")
    public void verifyLoginSuccessfully(String user,String password){
        mainPage.loginButton.click();
        loginModal.emailTextBox.setText(user);
        loginModal.passwordTextBox.setText(password);
        loginModal.loginButton.click();
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR login was not successfully");

    }
}
