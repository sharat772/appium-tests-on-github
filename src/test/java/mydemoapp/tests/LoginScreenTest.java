package mydemoapp.tests;

import mydemoapp.BaseTest;
import mydemoapp.pages.Login.LoginScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginScreenTest extends BaseTest {
    LoginScreen loginScreen;

    @Test(description = "Test homeScreenTitle")
    public void testLocationPermission() {
        //Arrange
        loginScreen = new LoginScreen();
        //ACT
        //Assert
        Assert.assertTrue(loginScreen.isTitlePresent());
    }
}
