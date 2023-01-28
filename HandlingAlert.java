package week3day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.findElement(By.id("j_idt88:j_idt91")).click();
		Alert alert = driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
		alert.accept();
		driver.findElement(By.id("j_idt88:j_idt93")).click();
		Alert alert2 = driver.switchTo().alert();
		String text1=alert2.getText();
		System.out.println(text1);
		alert2.dismiss();
		driver.findElement(By.id("j_idt88:j_idt95")).click();
		driver.findElement(By.id("j_idt88:j_idt98")).click();
		driver.findElement(By.id("j_idt88:j_idt104")).click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Jayapriya S");
		String text2=alert3.getText();
		System.out.println(text2);
		alert3.accept();
		driver.findElement(By.id("j_idt88:j_idt106")).click();
		driver.findElement(By.id("j_idt88:j_idt108")).click();
		driver.findElement(By.id("j_idt88:j_idt111")).click();
		driver.findElement(By.xpath("//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-maximize ui-corner-all']")).click();
	}

}
