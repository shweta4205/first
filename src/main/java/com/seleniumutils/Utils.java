package com.seleniumutils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.baseclass.com.Library;

public class Utils extends Library {
	 WebDriver driver;
     
		
     

		//Constructor
		public  Utils(WebDriver driver) {
			this.driver=driver;
		}	
		
		//to take screenshot
		public void screenshot(String path)  {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			try {
			FileUtils.copyFile(source, new File(path));
			}
		 catch (IOException e) {
			e.printStackTrace();
			}
		}
			public void getTitle() {
				String title=driver.getTitle();
				System.out.println(driver.getTitle());
			}

			public void clicksignin() {
				
			}
				
				
			public void emailid(String email) {
				// TODO Auto-generated method stub
				
			}
}





