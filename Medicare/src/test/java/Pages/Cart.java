package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Cart {
    WebDriver driver;
    @FindBy(xpath = "//a[contains(@href,'/medicare/show/3/product')]")
    WebElement productSelection;

    @FindBy(xpath = "//a[contains(@href,'/medicare/cart/add/3/product')]")
    WebElement addCart;

    @FindBy(id = "count_3")
    WebElement UserID;

    @FindBy(xpath = "//a[text()='View Products']")
    WebElement allProducts;

    @FindBy(xpath = "//a[contains(@href,'/medicare/show/5/product')]")
    WebElement showProduct1;

    @FindBy(xpath = "//a[contains(@href,'/medicare/cart/add/5/product')]")
    WebElement addCart1;

    @FindBy(xpath = "//a[contains(@href,'/medicare/cart/validate')]")
    WebElement validate;

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

    @FindBy(xpath = "//button[@type='submit' and contains(., 'Address')]")
    WebElement submit;

    @FindBy(id = "cardNumber")
    WebElement creditCard;

    @FindBy(id = "expityMonth")
    WebElement EMonth;

    @FindBy(id = "expityYear")
    WebElement EYear;

    @FindBy(id = "cvCode")
    WebElement CCode;

    @FindBy(xpath = "//a[contains(@href,'/medicare/cart/checkout?execution=e2s2&_eventId_pay')]")
    WebElement Pay;

    public void addtoCart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        // linkText.click();
        productSelection.click();
        this.run(3000);
        addCart.click();
        this.run(3000);
        // validate.click();
        //  this.run(3000);
        // homePage.click();
        //this.run(3000);
        allProducts.click();
        this.run(3000);
        showProduct1.click();
        this.run(3000);
        addCart1.click();
        this.run(3000);
        validate.click();
        this.run(3000);
        addressLineOne.sendKeys("1105 Research Center Drive Atlanta SW,");
        addressLineTwo.sendKeys("1105 Research Center Drive");
        city.sendKeys("Atlanta");
        postalCode.sendKeys("30316");
        state.sendKeys("Georgia");
        country.sendKeys("United States");
        this.run(3000);
        submit.click();
        creditCard.sendKeys("5655-8958-0024");
        this.run(1000);
        EMonth.sendKeys("02");
        this.run(1000);
        EYear.sendKeys("2027");
        this.run(1000);
        CCode.sendKeys("051");
        this.run(3000);
        Pay.click();
        this.run(5000);

    }

    void run(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
