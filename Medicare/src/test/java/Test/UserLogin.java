package Test;

import Pages.Cart;
import Pages.Login;
import Pages.SignUP;
import org.testng.annotations.Test;

public class UserLogin extends Baseclass {
    Login log = new Login();
    SignUP sign = new SignUP();
    Cart addCart = new Cart();
    @Test
    public void ValidateUser() {
        sign.Signup(wdriver);
        log.login(wdriver);
        addCart.addtoCart(wdriver);
    }
}
