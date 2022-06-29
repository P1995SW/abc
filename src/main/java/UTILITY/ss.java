package UTILITY;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ss {
	public static void ss(WebDriver driver, String name) throws IOException {
		
		String d= ss.date();
	
	       File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       
	       File destination = new File("D:\\Software testing\\Java Automation\\Selenium\\ss\\"+name+d+".jpg");
	       
	       FileHandler.copy(source, destination);
	       
	     
	}
	public static String date() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH-mm-ss");// format the time date & time as required
		LocalDateTime currentTime = LocalDateTime.now();//return the current time
		String d=dtf.format(currentTime);//format the time given my now() method to required format & return string
		return d;
		
//    String date= DateTimeFormatter.ofPattern("yyyy-MMM-dd HH-mm-ss").format(LocalDateTime.now());	
//	  return date;
	
       
		
	}
}
