package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.Constantes;
import models.setdata.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import questions.Validar;
import tasks.Abrir;
import tasks.Autenticarse;

import java.util.List;

public class DominioStepDefinitions {

    @Before
    public void setStage()
    {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("el actor ingresa a saucedemo")
    public void elActorIngresaASaucedemo(DataTable table){
        OnStage.theActorCalled(Constantes.ACTOR).wasAbleTo(Abrir.laWebTurbocycle(AbrirLoombokData.setData(table).get(0)));
    }

    @When("el se autentica$")
    public void elSeAutentica(DataTable table){
        OnStage.theActorInTheSpotlight().attemptsTo(Autenticarse.conCredenciales(AutenticarseLoombokData.setData(table).get(0)));
    }
    @Then("el valida el ingreso correctamente$")
    public void elValidaElIngresoCorrectamente(DataTable table)
    {
        List<List<String>> data = table.asLists(String.class);
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validar.elresutlado(), Matchers.equalTo(data.get(1).get(0))));
    }


}
