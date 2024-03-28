package PageObjectModelDesignPatternProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SignInTest {
	WebDriver driver;

	@Test
	public void VerifySignInTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Automation//SeleniumPOM//Drivers//geckodriver.exe");

		driver = new FirefoxDriver();

//object for SignIn Page

		SignIn s = new SignIn(driver);

		// maximizing the window
		driver.manage().window().maximize();

		// implicitly waiting for each method
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// opening the webpage
		driver.get("https://demo.guru99.com/selenium/newtours/");

		s.clickSignIn();
		s.setenteruserName("Chenna15");
		Thread.sleep(3000);
		s.setenterPassword("test@1234");

		Thread.sleep(3000);

		s.clickSubmit();

		// validation
		if (driver.getPageSource().contains("Welcome back to  Mercury Tours!")) {
			System.out.println("Test-PASSED");
		} else {
			System.out.println(" SIgn-In Failed -->TEST-FAILED");
		}

	}

}
