package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;

public class MenuPage
{

    MenuPage() {
        // Do nothing because of X and Y.
    }
    public static final Target LBL_MENSAJE_EXITOSO = Target.the("Home").located(By.xpath("//span[contains(text(),'Products')]"));

}
