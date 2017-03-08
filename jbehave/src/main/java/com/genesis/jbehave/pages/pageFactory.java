package com.genesis.jbehave.pages;

import org.jbehave.web.selenium.WebDriverProvider;

public class pageFactory {

    private final WebDriverProvider webDriverProvider;

    public pageFactory(WebDriverProvider webDriverProvider) {
        this.webDriverProvider = webDriverProvider;
    }
    public personal newPersonal() {
        return new personal(webDriverProvider);
    }

    public telecom newTelecom(){
        return new telecom(webDriverProvider);
    }
    public arnet newArnet(){
        return new arnet(webDriverProvider);
    }
    public clubPersonal newClubPersonal(){return new clubPersonal(webDriverProvider);}
}