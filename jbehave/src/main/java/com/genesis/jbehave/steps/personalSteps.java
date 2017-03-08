package com.genesis.jbehave.steps;

import com.genesis.jbehave.pages.pageFactory;
import org.jbehave.core.annotations.*;
import com.genesis.jbehave.pages.personal;

public class personalSteps {

    private personal personal;

    public personalSteps(pageFactory pageFactory) {
        //Instancia la clase personal y le pasa el driver que viene delegado desde el goal
        personal = pageFactory.newPersonal();
    }

    @Given("Abro el sitio web $Personal")
    public void abrirPagina(String sitio){
        //Abre cualquier sitio web, se puede instanciar desde cualquier step
        personal.abrirPagina(sitio);
    }
    @When("Hago click en el boton $Texto")
    public void clickBoton(String boton) {
        //Valida el boton por Xpath dinamico con el nombre, si hay 2 botones iguales elige el primero (ojo con esto)
        personal.clickBoton(boton);
    }

    @When("Escribo como $TipoDeNumeroAIngresar $NumeroAIngresar")
    public void escriboNumeros(String tipoNumero, String numero ) {
        //Ingresa los numeros en base al tag Name del HTML (ver que password = IDToken2), ver si aplica al resto de las historias
        personal.escriboNumeros(tipoNumero, numero);
    }
    @Then("Se muestra $Nombre $Usuario como usuario logueado")
    @Given("Tengo como usuario logueado a $Nombre $Usuario")
    public void validarNombreUsuario(@Named("Nombre") String usuario, @Named("Usuario") String apellido){
        personal.validarNombreUsuario(usuario,apellido);
    }

    @Then("Se muestra el estado $Activa")
    public void validarEstadoLinea(String estado){
        personal.validarEstadoLinea(estado);
    }
    @Then("Se muestra la pantalla de $NombreTituloPantalla")
    public void validarTituloPantalla(String titulo){
        personal.validarTituloPantalla(titulo);
    }

    @AfterStories
    public void quit(){
        //Quita el driver despues de correr las Stories de este StoryFile
        personal.quit();
    }
}