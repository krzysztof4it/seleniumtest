package pl.krzysztof4it;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {


    public static void main(String[] args) {


        /*
        Download driver gecko - https://github.com/mozilla/geckodriver/releases
        *
        * */
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\krzysztof.tlaga\\IdeaProjects\\Selenium Tests\\geckodriver-v0.18.0-win64\\geckodriver.exe");

        /*new driver */
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("http://demo.guru99.com/"); /*open website in new window -> Firefox*/

        WebElement element=driver.findElement(By.xpath("//input[@name='emailid']")); /*find element - type and name */

        element.sendKeys("abc@gmail.com");
        WebElement button=driver.findElement(By.xpath("//input[@name='btnLogin']")); /* find button by type and name*/

        button.click(); /* clikck on element - button */


    }
}
