package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage
{
    LoginPage() {
        // Do nothing because of X and Y.
    }
    public static final Target TXT_USERNAME= Target.the("campo de texto para escribir usuario").located(By.id("user-name"));
    public static final Target TXT_PASSWORD= Target.the("campo de texto para escribir contrasena").located(By.id("password"));
    public static final Target BTN_LOGIN= Target.the("boton para autenticarse").located(By.id("login-button"));
}
