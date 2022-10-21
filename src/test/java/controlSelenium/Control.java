package controlSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import singletonSession.Session;

import java.time.Duration;

public class Control {

    protected By locator;
    protected WebElement control;

    public Control (By locator){
        this.locator=locator;
    }

    protected void findControl(){
        control= Session.getInstance().getBrowser().findElement(this.locator);
    }

    /**
     *
     */
    public void click(){
        this.findControl();
        control.click();
    }

    public boolean isControlDisplayed(){
        try {
            this.findControl();
            return control.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

    public String getText(){
        this.findControl();
        return control.getText();
    }


    public void waitClickable(){
        WebDriverWait wait = new WebDriverWait(Session.getInstance().getBrowser(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(this.locator));
    }

    public WebElement getControl() {
        return control;
    }
}
