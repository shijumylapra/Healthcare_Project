package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Login {
    WebDriver driver;

    @FindBy(id = "login")
    WebElement LoginButton;

    @FindBy(id = "username")
    WebElement Uname;

    @FindBy(id = "password")
    WebElement Pass;

    @FindBy(xpath = "//input[@class='btn btn-primary']")
    WebElement loginbtn;

    @FindBy(xpath = "//div[@class='alert alert-danger fade in']")
    WebElement validText;


    public void login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        Uname.sendKeys("vkgh@gmail.com");
        Pass.sendKeys("$2a$06$OgRtBskA2g5Wg0HDgRE5ZsOQNDHUZSdpJqJ2.PGXv0mKyEvLnKP7SW");
        loginbtn.click();
        Assert.assertEquals(validText.getText(), "Username and Password is invalid!");
        System.out.println(validText.getText());
        this.run(5000);
        Uname.sendKeys("shiju@gmail.com");
        Pass.sendKeys("25+eerd25");
        loginbtn.click();
        this.run(5000);
    }

    void run(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            e.getMessage();
        }
    }

//    void String connection()
//    {
//
//        String get=null;
//        try{
//
//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            Connection con = (Connection) DriverManager.getConnection
//                    ("jdbc:mysql://localhost:3306/mysql","root","password");
//            Statement stmt = (Statement) con.createStatement();
//            ResultSet rs=stmt.executeQuery("SELECT * FROM posts ORDER BY id DESC LIMIT 1");
//            if (rs.next())
//            {
//                get = rs.getString("");
//            }
//
//        }
//        catch(Exception e){
//
//        }
//        return get;
//    }
//    }

}


