package mydemoapp.pages;

import common_utils.ConfigLoader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.time.Duration;

public class BasePage {
    // Use a static instance to share the driver across different instances of BasePage
    public static AppiumDriver androidDriver;

    public AppiumDriver getDriver() {
        if (androidDriver == null) {
            ConfigLoader configLoader = new ConfigLoader();
            DesiredCapabilities capabilities = new DesiredCapabilities(configLoader.getCapability());
            try {
                androidDriver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
                androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                System.out.println("created driver succesfulluysiubvdsy;");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return androidDriver;
    }
}
