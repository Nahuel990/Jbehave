package com.genesis.jbehave.pages;

import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class personal extends WebDriverPage{
    private final WebDriverProvider webDriverProvider;

    public personal(WebDriverProvider webDriverProvider) {
        super(webDriverProvider);
        this.webDriverProvider = webDriverProvider;

    }
    public void wait(String xpath){
        //Es un wait para la clase, espera 10 segundos antes de declarar el elemento como no enontrado, en cuanto lo encuentra sigue el curso
        (new WebDriverWait(webDriverProvider.get(),30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }
    public void abrirPagina(String sitio){
        try{
            //Maximiza el browser
            webDriverProvider.get().manage().window().maximize();
            //Recibe el sitio desde el StoryFile, valida que la URL que se abre en el navegador es la misma que la esperada
            get("http://" + sitio);
            Assert.assertEquals(webDriverProvider.get().getCurrentUrl(), "http://"+sitio +"/");
        }catch (Exception e){
            System.out.println(e.getCause());
        }
    }
    public void clickBoton(String boton){
        //Crea el Xpath que se usa para los test, esto se puede abstraer todavia mas dejandolos al comienzo de la clase
        //Y haciendo que "boton" tome un valor de expresion regular para cuando entre al metodo
        String button = "//*[text()='"+boton+"']";
        //Espera a que encuentre el elemento
        this.wait(button);
        WebElement element = webDriverProvider.get().findElement(By.xpath(button));
        JavascriptExecutor executor = (JavascriptExecutor) webDriverProvider.get();
        executor.executeScript("arguments[0].click()", element);
        //findElement(By.xpath(button)).click();
    }
    public void escriboNumeros(String tipoNumero, String numero){
        //Es el Xpath del codigo de area se usa en el metodo que valida el ingreso
        String valor = "//*[@name='"+tipoNumero+"']";
        //Toma el Xpath del campo codigo de area y valida que este presente
        (new WebDriverWait(webDriverProvider.get(),30)).until(ExpectedConditions.elementToBeClickable(By.xpath(valor)));
        //Levanta desde el StoryFile el tipo de campo que se quiere llenar y le pasa el numero
        findElement(By.name(tipoNumero)).sendKeys(numero);
    }
    public void validarNombreUsuario(String usuario, String apellido){
        String user = "//*[text()='"+usuario+" " +apellido+"']";
        this.wait(user);
        Assert.assertEquals(usuario+" " +apellido,findElement(By.xpath(user)).getText());
    }
    public void validarEstadoLinea(String validarEstadoLinea){
        String line = "//*[text()='"+validarEstadoLinea+"']";
        this.wait(line);
        Assert.assertEquals(validarEstadoLinea, findElement(By.xpath(line)).getText());
    }
    public void validarTituloPantalla(String titulo){
        String title= "//*[text()='"+titulo+"']";
        (new WebDriverWait(webDriverProvider.get(),30)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(title)));
        Assert.assertEquals(titulo, findElement(By.xpath(title)).getText());
    }
}
