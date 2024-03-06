package mydemoapp.pages.Home;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Step;


import java.time.Duration;

public class HomeScreen extends HomeLocators {
    public boolean isTitlePresent() {
        return homeScreenTitle.isDisplayed();
    }

    public void tap(){
        new TouchAction((PerformsTouchActions) androidDriver).press(PointOption.point(1002, 375))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .release()
                .perform();
    }
}
