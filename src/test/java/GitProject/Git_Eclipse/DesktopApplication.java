package GitProject.Git_Eclipse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumOptions;

import com.gargoylesoftware.htmlunit.javascript.host.URL;

public class DesktopApplication {

	public static void main(String[] args) throws InterruptedException {
		String appPathe="C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Accessories\\Paint.lnk";
		DesktopOptions drop = new DesktopOptions();
		drop.setApplicationPath(appPathe);
		
//		URL url = new URL();
//		WiniumOptions path = (WiniumOptions) url.associateValue(drop, "http://localhost:9999");
		WebDriver driver = new WiniumDriver(drop);
		
		Thread.sleep(10000);
		driver.findElement(By.name("File")).click();
		
	}

}
