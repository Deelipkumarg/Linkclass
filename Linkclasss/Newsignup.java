package Linkclasss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newsignup {

	public static void main(String[] args) throws InterruptedException {

		
		// set property to launch chrome
				System.setProperty("webdriver.chrome.driver", "/home/deelip/Downloads/chromedriver_linux64 (1)/chromedriver");
				WebDriver	wd = new ChromeDriver();
				
				// pageload time
				 wd.manage().timeouts().pageLoadTimeout(35, TimeUnit.SECONDS);

				 // launch the website
					wd.get("https://linkclassroom.com/");
				    wd.manage().window().maximize();   // maximize the browser
				 // time wait
					 wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
					 
					    Thread.sleep(3000);      // waiting time
						wd.findElement(By.xpath("//*[text()='JOIN TODAY']")).click();
						Thread.sleep(2000);
						wd.findElement(By.xpath("//*[text()='Phone/Email id']")).click();
						Thread.sleep(2000);
						wd.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[3]/div[2]/form[1]/input[1]")).click();
				
						//signup with email id
						Thread.sleep(1000);
						wd.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[3]/div[2]/form[1]/input[1]")).sendKeys("deelip one");
						wd.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[3]/div[2]/form[1]/input[2]")).sendKeys("deelip1@mailinator.com");
						wd.findElement(By.xpath("//*[text()='NEXT']")).click();
						
						
				
	}

}
