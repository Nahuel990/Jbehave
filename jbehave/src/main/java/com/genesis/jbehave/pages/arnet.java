package com.genesis.jbehave.pages;

import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;

/**
 * Created by nahue on 24/2/2017.
 */
public class arnet extends WebDriverPage {

    private final WebDriverProvider webDriverProvider;

    public arnet(WebDriverProvider webDriverProvider) {
        super(webDriverProvider);
        this.webDriverProvider = webDriverProvider;
    }
}
