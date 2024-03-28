package PageObjectModelDesignPatternProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {

	WebDriver driver;

	By SigninBtn = By.linkText("SIGN-ON");
	By userName = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input");
	By password = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input");
	By submit = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input");

	// constructor
	SignIn(WebDriver d) {
		driver = d;
	}

	public void clickSignIn() {
		driver.findElement(SigninBtn).click();
	}

	public void setenteruserName(String uName) {
		driver.findElement(userName).sendKeys(uName);
	}

	public void setenterPassword(String uPassword) {
		driver.findElement(password).sendKeys(uPassword);
	}

	
	public void clickSubmit() {
		driver.findElement(submit).click();
	}
}
