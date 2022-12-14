package cleanTest.todoLy;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import utils.GetProperties;


@Tag("Sanity")
public class LoginTest extends TestBaseTodoLy{
    @Test
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
    @Tag("SmokeTest")
    public void verifyLoginSuccessfully(){
        mainPage.loginButton.click();
        loginModal.emailTextBox.setText(GetProperties.getInstance().getUser());
        loginModal.passwordTextBox.setText(GetProperties.getInstance().getPwd());
        loginModal.loginButton.click();
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR login was not successfully");

    }
}
