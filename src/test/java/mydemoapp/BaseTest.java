package mydemoapp;

import common_utils.TestLogger;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import mydemoapp.pages.BasePage;

import java.lang.reflect.Method;
import java.time.Duration;

@Listeners(TestListener.class)
public class BaseTest {

    AppiumDriver androidDriver;

    @BeforeClass(groups = {"full", "sanity"})
    public void setUp() {
        // Initialize androidDriver using the driver instance from BasePage
        androidDriver = new BasePage().getDriver();
        System.out.println("assigned driver");
        androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        System.out.println("fuck theis");
    }

    @BeforeMethod(groups = {"full", "sanity"})
    public void beforeMethod(Method m) {
        TestLogger.info("STARTING TEST: " + m.getName());
        TestLogger.info("THREAD ID: " + Thread.currentThread().getId());
    }

    @AfterClass(groups = {"full", "sanity"})
    public void tearDown() {
        // No need to quit androidDriver here; it will be done in BasePage
        TestLogger.shutdown();
    }
}
