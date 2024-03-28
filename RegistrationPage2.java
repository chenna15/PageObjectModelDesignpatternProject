package PageObjectModelDesignPatternProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

@Test
public class RegistrationPage2 {
//method 2 to create object pages
	WebDriver driver;
	
/*
 * syntax-1
 @FindBy(how=How.LINk_TEXT,using="REGISTER")
 WebElement RegLink;
 
 @FindBy(how=How.NAME,using="firstName")
 WebElement firstName;
 
 
 syntax-2
 @FindBy(name="FirstName")
 
 */
	
	@FindBy(how=How.LINK_TEXT,using="REGISTER")
	WebElement RegLink;

	@FindBy(name="firstName")
	WebElement FirstName;
	
	@FindBy(name="lastName")
	WebElement LastName;
	
	@FindBy(name="phone")
	WebElement phone;
	
	@FindBy(name="userName")
	WebElement email;
	
	@FindBy(name="address1")
	WebElement address1;
	
	@FindBy(name="address2")
	WebElement address2;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="state")
	WebElement state;
	
	@FindBy(name="postalCode")
	WebElement postalcode;
	
	@FindBy(name="country")
	WebElement country;
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="confirmPassword")
	WebElement confirmpassword;
	
	@FindBy(name="submit")
	WebElement registerBtn;

//class constructor
RegistrationPage2(WebDriver d) {
//this.driver = driver;
	driver= d;
	PageFactory.initElements(d, this);   //additional method
}

//these are all object identification elements

public void clickRegLink() {
	RegLink.click();
}

public void setFirstName(String fname) {
FirstName.sendKeys(fname);
}

public void setLastName(String lname) {
	LastName.sendKeys(lname);
}

public void setPhone(String ph) {
	phone.sendKeys(ph);
}

public void setEmail(String mail) {
	email.sendKeys(mail);
}

public void setAddress1(String addr1) {
	address1.sendKeys(addr1);
}

public void setAddress2(String addr2) {
address1.sendKeys(addr2);
}

public void setCity(String City) {
	city.sendKeys(City);

}

public void setState(String State) {
state.sendKeys(State);
}

public void setPostalcode(String pstlcode) {
	postalcode.sendKeys(pstlcode);
}

public void setCountry(String Cntry) {
	country.sendKeys(Cntry);
}

public void setUsername(String usrname) {
	username.sendKeys(usrname);
}

public void setUsrpassword(String usrpwd) {
	password.sendKeys(usrpwd);
}

public void setConfirmpassword(String cnfrmpwd) {
	confirmpassword.sendKeys(cnfrmpwd);
}

public void ClickRegisterBtn() {
	registerBtn.click();
}

//quit the browser
public void Quit() {
 driver.quit();
}
}
