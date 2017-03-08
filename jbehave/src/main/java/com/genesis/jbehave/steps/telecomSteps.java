package com.genesis.jbehave.steps;

import com.genesis.jbehave.pages.pageFactory;
import com.genesis.jbehave.pages.*;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by nahue on 23/2/2017.
 */
public class telecomSteps {
    private telecom telecom;
    public telecomSteps(pageFactory pageFactory) {
        //Instancia la clase telecom y le pasa el driver que viene delegado desde el goal
        telecom = pageFactory.newTelecom();
    }

    @When("Hago click en $Solicitaloahora")
    public void clickBotonParser(String botonParser){
        telecom.clickBotonParser(botonParser);
    }
    @When("Clickeo en Solicitar")
    public void clickSolicitar(){
        telecom.clickSolicitar();
    }
    @Then("Se carga el plan $NombreDelPlan")
    public void validarPlanes(String nombrePlan){
        telecom.validarPlanes(nombrePlan);
    }

}
