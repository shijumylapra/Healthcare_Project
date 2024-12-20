package Pages;

import Test.Baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;

public class SignUP
{

      WebDriver driver;
    @FindBy(xpath =  "//a[text()='Sign Up']")
    WebElement signUp;

    @FindBy(id = "firstName")
    WebElement first_name;
    @FindBy(id = "lastName")
    WebElement last_name;
    @FindBy(id = "email")
    WebElement email;
    @FindBy(id = "contactNumber")
    WebElement contNumber;
    @FindBy(id = "password")
    WebElement pass1;
    @FindBy(id = "confirmPassword")
    WebElement pass2;
    @FindBy(name = "_eventId_billing")
    WebElement submit;
    @FindBy(id = "addressLineOne")
    WebElement addressLineOne;
    @FindBy(id = "addressLineTwo")
    WebElement addressLineTwo;
    @FindBy(id = "city")
    WebElement city;
    @FindBy(id = "postalCode")
    WebElement postalCode;
    @FindBy(id = "state")
    WebElement state;
    @FindBy(id = "country")
    WebElement country;
    @FindBy(name = "_eventId_confirm")
    WebElement Bconfirm;
    @FindBy(xpath =  "//a[contains(@href,'/medicare/membership?execution=e1s3&_eventId_submit')]")
    WebElement subconfirm;
    @FindBy(xpath =  "//a[text()='Login Here']")
    WebElement Login;


    public void Signup(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        signUp.click();
        this.run(3000);
        first_name.sendKeys("Shiju");
        last_name.sendKeys("Abraham");
        email.sendKeys("shiju@gmail.com");
        contNumber.sendKeys("009152366520");
        pass1.sendKeys("25+eerd25");
        pass2.sendKeys("25+eerd25");
        this.run(5000);
        submit.click();
        addressLineOne.sendKeys("1175 S Arizona Ave");
        addressLineTwo.sendKeys("Chandler, AZ 85286");
        city.sendKeys("Chandler");
        postalCode.sendKeys("85286");
        state.sendKeys("AZ");
        country.sendKeys("United States");
        this.run(5000);
        Bconfirm.click();
        this.run(5000);
        subconfirm.click();
        this.run(5000);
        Login.click();
    }



//        LoginButton.click();
//        Uname.sendKeys("sd@gmail.com");
//        Pass.sendKeys("Sddhiju123");
//
//
//        loginbtn.click();
//        Assert.assertEquals(validText.getText(), "Username and Password is invalid!");
//        System.out.println(validText.getText());
//        this.run(5000);
//        Uname.sendKeys("sa@gmail.com");
//        Pass.sendKeys("Shiju123");
//        loginbtn.click();
//        this.run(5000);
//        // linkText.click();
//        productSelection.click();
//        this.run(3000);
//        addCart.click();
//        this.run(3000);
//        validate.click();
//        this.run(3000);
//        homePage.click();
//        this.run(3000);
//        allProducts.click();
//        this.run(3000);
//        showProduct1.click();
//        this.run(3000);
//        addCart1.click();
//        this.run(3000);
//        validate.click();
//
//        this.run(3000);
//
//        addressLineOne.sendKeys("1105 Research Center Drive Atlanta SW,");
//        addressLineTwo.sendKeys("1105 Research Center Drive");
//        city.sendKeys("Atlanta");
//        postalCode.sendKeys("30316");
//        state.sendKeys("Georgia");
//        country.sendKeys("United States");
//
//        this.run(3000);
//        submit.click();
//
//        creditCard.sendKeys("5655-8958-0024");
//        this.run(1000);
//        EMonth.sendKeys("02");
//        this.run(1000);
//        EYear.sendKeys("2027");
//        this.run(1000);
//        CCode.sendKeys("051");
//        this.run(3000);
//        Pay.click();
void run(int time) {
    try {
        Thread.sleep(time);
    } catch (Exception e) {
        e.getMessage();
    }
}
}
