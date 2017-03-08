package com.genesis.jbehave.pages;

import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by nahue on 23/2/2017.
 */
public class telecom extends WebDriverPage {
    private final WebDriverProvider webDriverProvider;

    public telecom(WebDriverProvider webDriverProvider) {
        super(webDriverProvider);
        this.webDriverProvider = webDriverProvider;

    }
    public void wait(String xpath){
        //Es un wait para la clase, espera 10 segundos antes de declarar el elemento como no enontrado, en cuanto lo encuentra sigue el curso
        (new WebDriverWait(webDriverProvider.get(),10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }
    public void validarPlanes(String nombrePlan){
        String plan = "//*[text()='"+nombrePlan+"']";
        this.wait(plan);
        Assert.assertEquals(nombrePlan, findElement(By.xpath(plan)).getText());
    }

    public void clickBotonParser(String botonParser){
        //Metodo generado por tener espacios en los webelements en lugar de posicionarlos con css
        String button = "//*[contains(text(),'"+botonParser+"')]";
        //Espera a que encuentre el elemento
        this.wait(button);
        WebElement element = webDriverProvider.get().findElement(By.xpath(button));
        JavascriptExecutor executor = (JavascriptExecutor) webDriverProvider.get();
        executor.executeScript("arguments[0].click()", element);
    }
    public void clickSolicitar(){
        //Metodo mal generado, la pagina no sigue un patron adecuado, el nombre del boton se pasa como parametro y no como valor
        this.wait("//*[@id=\"send\"]");
        findElement(By.id("send")).click();
    }
}
