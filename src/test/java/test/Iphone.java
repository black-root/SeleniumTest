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

/**
 *
 * @author debianyisus
 */
public class Iphone {

    public Iphone(String USERNAME, String AUTOMATE_KEY, String URL) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browserName", "iPhone");
        caps.setCapability("device", "iPhone 8 Plus");
        caps.setCapability("realMobile", "true");
        caps.setCapability("os_version", "11.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("https://av.occ.ues.edu.sv/");
  
        WebElement email = driver.findElement(By.id("username"));
        email.sendKeys("CA16009");
        
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("15666");
        
        WebElement enviar = driver.findElement(By.id("loginbtn"));
        enviar.submit();

/*
        element.sendKeys("BrowserStack");
        element.submit();*/

        System.out.println(driver.getTitle());
        driver.quit();
    }
}
