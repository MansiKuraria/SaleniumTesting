//ca45ce3c-04e0-495d-a715-8ae8f8afe6cb
package selenium_demo.selenium_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://www.selenium.dev/downloads/");
        driver.manage().window().maximize();
    }
}
