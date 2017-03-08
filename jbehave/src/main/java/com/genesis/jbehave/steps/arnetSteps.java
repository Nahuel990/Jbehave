package com.genesis.jbehave.steps;

import com.genesis.jbehave.pages.pageFactory;
import com.genesis.jbehave.pages.arnet;

/**
 * Created by nahue on 24/2/2017.
 */
public class arnetSteps {

    private arnet arnet;

    public arnetSteps(pageFactory pageFactory) {
        //Instancia la clase arnet y le pasa el driver que viene delegado desde el goal
        arnet = pageFactory.newArnet();
    }
}
