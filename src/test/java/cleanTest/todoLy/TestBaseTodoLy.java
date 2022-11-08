package cleanTest.todoLy;

import com.google.common.collect.ImmutableMap;
import io.qameta.allure.Attachment;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.todoLy.LoginModal;
import pages.todoLy.MainPage;
import pages.todoLy.MenuSection;
import singletonSession.Session;
import utils.GetProperties;

import static com.github.automatedowl.tools.AllureEnvironmentWriter.allureEnvironmentWriter;

@ExtendWith(TestResultExtension.class)
public class TestBaseTodoLy {
     public MainPage mainPage=new MainPage();
     public LoginModal loginModal= new LoginModal();
     public MenuSection menuSection= new MenuSection();
     @BeforeEach
     public void setup(){
          allureEnvironmentWriter(
                  ImmutableMap.<String, String>builder()
                          .put("Browser", GetProperties.getInstance().getBrowser())
                          .put("URL", GetProperties.getInstance().getHost())
                          .put("User", GetProperties.getInstance().getUser())
                          .put("Pwd", GetProperties.getInstance().getPwd())
                          .build(), System.getProperty("user.dir")
                          + "/build/allure-results/");
         Session.getInstance().getBrowser().get(GetProperties.getInstance().getHost());
     }
     @AfterEach
     public void cleanup(){
          Session.getInstance().closeBrowser();
     }



}
