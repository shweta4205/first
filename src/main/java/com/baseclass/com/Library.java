package com.baseclass.com;


	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebDriverException;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	import com.google.common.io.Files;

	public class Library {
		public static WebDriver driver;
		public static Properties prop;
		
		
		public void lunchapplication() throws IOException {
			System.out.println("1111:: Came here in lunchapplication ");
			FileInputStream fileIS = new FileInputStream("C:\\Users\\shwet\\eclipse-workspacejava\\linkedinproject\\src\\test\\resources\\configurationproperties\\config.proterties");
			prop=new Properties();
			prop.load(fileIS);//load the config file
			String brower = prop.getProperty("browser");
			try {
				if (brower.equalsIgnoreCase("firfox")) {
					
					driver = new FirefoxDriver();
				}
				else if (brower.equalsIgnoreCase("chrome")) {
					
				System.setProperty( "webdriver.chrome.driver", "C:\\Users\\shwet\\eclipse-workspacejava\\linkedinproject\\src\\test\\resources\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			 driver.manage().window().maximize();
		     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			 driver.get(prop.getProperty("url"));
		}
		     catch(WebDriverException e) {
		    	 System.out.println("driver could not be launched");
		     }
		}
		     public void quit() {
		    	 driver.close();
					
				}	
		     public void  take_screenshot(String path) throws IOException {
		    	 TakesScreenshot ts = (TakesScreenshot)driver;
		    	 File source = ts.getScreenshotAs(OutputType.FILE);
		    	 FileUtils.copyFile(source,new File(path));
		    	 
		    	
		     }
		     public void getTitle() {
					String title=driver.getTitle();
					System.out.println(driver.getTitle());
				}

}


