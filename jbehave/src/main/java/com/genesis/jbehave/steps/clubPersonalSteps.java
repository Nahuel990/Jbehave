package com.genesis.jbehave.steps;

import com.genesis.jbehave.pages.pageFactory;
import com.genesis.jbehave.pages.clubPersonal;
import org.jbehave.core.annotations.Given;

/**
 * Created by nahue on 24/2/2017.
 */
public class clubPersonalSteps {

    private clubPersonal clubPersonal;
    public clubPersonalSteps(pageFactory pageFactory) {
        //Instancia la clase clubPersonal y le pasa el driver que viene delegado desde el goal
        clubPersonal = pageFactory.newClubPersonal();
    }

    @Given("Cargo el sitio $club")
    public void abrirPaginaSegura(String sitioSeguro){
        clubPersonal.abrirPaginaSegura(sitioSeguro);
    }
}
