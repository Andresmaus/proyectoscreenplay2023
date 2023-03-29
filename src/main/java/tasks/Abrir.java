package tasks;

import models.setdata.AbrirLoombokData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Browser;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task
{
    private AbrirLoombokData abrirLoombokData;

    public Abrir(AbrirLoombokData abrirLoombokData) {
        this.abrirLoombokData=abrirLoombokData;
    }

    public static Abrir laWebTurbocycle(AbrirLoombokData abrirLoombokData)
    {
        return Tasks.instrumented(Abrir.class,abrirLoombokData);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Open.url(abrirLoombokData.getUrl()),
                Browser.maximize());

    }
}
