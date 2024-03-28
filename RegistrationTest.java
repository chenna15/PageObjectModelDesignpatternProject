package PageObjectModelDesignPatternProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

// method 1 which is traditional
public class RegistrationTest {
	public static WebDriver driver = null;

	@Test
	public void verifyFLightRegistrationTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Automation//SeleniumPOM//Drivers//geckodriver.exe");

		driver = new FirefoxDriver();
//object foor first method
		// RegistrationPage RGPage= new RegistrationPage(driver);

//object for second method
		RegistrationPage2 RGPage = new RegistrationPage2(driver);

		// maximizing the window
		driver.manage().window().maximize();

		// implicitly waiting for each method
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// opening the webpage
		driver.get("https://demo.guru99.com/selenium/newtours/");

		RGPage.clickRegLink();
		RGPage.setFirstName("Matham");
		RGPage.setLastName("Chenna Basava");
		RGPage.setPhone("96521*****");
		RGPage.setEmail("test123@gmail.com");
		RGPage.setAddress1("123/56");
		RGPage.setAddress2("Nandikotkur");
		RGPage.setCity("Kurnool");
		RGPage.setState("AP");
		RGPage.setPostalcode("518401");
		RGPage.setCountry("India");
		RGPage.setUsername("Chenna15");
		RGPage.setUsrpassword("test@1234");
		RGPage.setConfirmpassword("test@1234");
		RGPage.ClickRegisterBtn();

//validation
		if (driver.getPageSource().contains("Thank you for registering.")) {
			System.out.println("You registered Successfully.-TEST PASSED");
		} else {
			System.out.println(("Your registration failed. -TEST FAILED"));
		}
		Thread.sleep(5000);
		// RGPage.Quit();
	}

}
