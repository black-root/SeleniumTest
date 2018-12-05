/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import org.junit.Assert;

/**
 *
 * @author debianyisus
 */
public class TestiOS {

    /*
    url= https://www.browserstack.com
    email: ronald21122@gmail.com
    clave: dlik2194
     */
  public static final String USERNAME = "rogelioalvarez1";
  public static final String AUTOMATE_KEY = "9e8tWJ1fEqp3LqRUgmdj";
  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    /**
     * @param args the command line arguments
     * @throws java.net.MalformedURLException
     */
    public static void main(String[] args) throws MalformedURLException {
       // Iphone ip = new Iphone(USERNAME, AUTOMATE_KEY, URL);
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browserName", "iPhone");
        caps.setCapability("device", "iPhone 8 Plus");
        caps.setCapability("realMobile", "true");
        caps.setCapability("os_version", "11.0");


        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("https://av.occ.ues.edu.sv/");
        
        
        driver.findElement(By.id("username")).sendKeys("CA16009");
        pausa(500);
        driver.findElement(By.id("password")).sendKeys("15669");
        pausa(500);
        driver.findElement(By.id("loginbtn")).submit();
        //Assert.assertEquals("Área personal", driver.getTitle());
        pausa(500);
        driver.findElement(By.linkText("Programacion III")).click();
        //si se incrementa el tiempo dara problemas
        pausa(9000);
        
                
        
/*
        element.sendKeys("BrowserStack");
        element.submit();*/

        System.out.println(driver.getTitle());
        driver.quit();

    }

    public static void pausa(long sleeptime){
        try{
            Thread.sleep(sleeptime);
        } catch(InterruptedException ex){};
    }
}