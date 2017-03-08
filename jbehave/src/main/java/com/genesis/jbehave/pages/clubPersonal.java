package com.genesis.jbehave.pages;

import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;

/**
 * Created by nahue on 24/2/2017.
 */
public class clubPersonal extends WebDriverPage {
    private final WebDriverProvider webDriverProvider;

    public clubPersonal(WebDriverProvider webDriverProvider) {
        super(webDriverProvider);
        this.webDriverProvider = webDriverProvider;
    }

    public void abrirPaginaSegura(String sitioSeguro){
        try{
            //Maximiza el browser
            webDriverProvider.get().manage().window().maximize();
            //Recibe el sitio desde el StoryFile, es para conexiones https
            get("https://" + sitioSeguro);
        }catch (Exception e){
            System.out.println(e.getCause());
        }
    }
}
