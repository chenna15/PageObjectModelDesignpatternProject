package PageObjectModelDesignPatternProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class RegistrationPage {
//it is just supported class
	WebDriver driver;

	By RegLink = By.linkText("REGISTER");
	By FirstName = By.name("firstName");
	By LastName = By.name("lastName");
	By phone = By.name("phone");
	By email = By.name("userName");
	By address1 = By.name("address1");
	By address2 = By.name("address2");
	By city = By.name("city");
	By state = By.name("state");
	By postalcode = By.name("postalCode");
	By country = By.name("country");
	By username = By.name("email");
	By password = By.name("password");
	By confirmpassword = By.name("confirmPassword");
	By registerBtn = By.name("submit");

//  class constructor
	RegistrationPage(WebDriver d) {
	//this.driver = driver;
		driver= d;
	}

// these are all object identification elements

	public void clickRegLink() {
		driver.findElement(RegLink).click();
	}

	public void setFirstName(String fname) {
		driver.findElement(FirstName).sendKeys(fname);
	}

	public void setLastName(String lname) {
		driver.findElement(LastName).sendKeys(lname);
	}

	public void setPhone(String ph) {
		driver.findElement(phone).sendKeys(ph);
	}

	public void setEmail(String mail) {
		driver.findElement(email).sendKeys(mail);
	}

	public void setAddress1(String addr1) {
		driver.findElement(address1).sendKeys(addr1);
	}

	public void setAddress2(String addr2) {
		driver.findElement(address1).sendKeys(addr2);
	}

	public void setCity(String City) {
		driver.findElement(city).sendKeys(City);

	}

	public void setState(String State) {
		driver.findElement(state).sendKeys(State);
	}

	public void setPostalcode(String pstlcode) {
		driver.findElement(postalcode).sendKeys(pstlcode);
	}

	public void setCountry(String Cntry) {
		driver.findElement(country).sendKeys(Cntry);
	}

	public void setUsername(String usrname) {
		driver.findElement(username).sendKeys(usrname);
	}

	public void setUsrpassword(String usrpwd) {
		driver.findElement(password).sendKeys(usrpwd);
	}

	public void setConfirmpassword(String cnfrmpwd) {
		driver.findElement(confirmpassword).sendKeys(cnfrmpwd);
	}

	public void ClickRegisterBtn() {
		driver.findElement(registerBtn).click();
	}
	
	//quit the browser
	public void Quit() {
     driver.quit();
	}
}
