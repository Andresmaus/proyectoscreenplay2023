package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.MenuPage;

public class Validar implements Question {

    public static Validar elresutlado()
    {
        return new Validar();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(MenuPage.LBL_MENSAJE_EXITOSO).answeredBy(actor);

    }
}
