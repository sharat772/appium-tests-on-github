package mydemoapp.pages.Login;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.time.Duration;

public class LoginScreen extends LoginLocators{
    public boolean isTitlePresent() {
        return loginScreenTitle.isDisplayed();
    }

    public void tap(){
        new TouchAction((PerformsTouchActions) androidDriver).press(PointOption.point(1002, 375))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .release()
                .perform();
    }
}
