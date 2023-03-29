package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class Sumar implements Interaction
{
    private int a;
    private int b;

    public Sumar(int a, int b)
    {
        this.a=a;
        this.b=b;
    }

    public static Sumar numeros(int a, int b)
    {
        return Tasks.instrumented(Sumar.class,a,b);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        int suma= a+b;
    }
}
