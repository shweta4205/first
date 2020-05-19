package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	
	
	@CucumberOptions(
				features="src\\test\\resources\\Features\\LinkedIn.feature"  
				//,	glue= {"stepdefinition"}

	//tags = {"@tc_01_login"," @tc_02_admin"}
	)

	
/*
 * @CucumberOptions(features="src\\test\\resources\\Features\\Linkined.feature"
 * , glue= {"stepdefintion"}
 * 
 * //tags = {"@tc_01_login"," @tc_02_admin"} )
 */

	public class Testrunner1 {
	/*
	 * @AfterClass public static void extendReport() { Reporter.loadXMLConfig(
	 * "src\\test\\resources\\configurationproperties\\extent-config.xml");
	 * Reporter.setSystemInfo("user", System.getProperty("user.name"));
	 * Reporter.setSystemInfo("os", "Windows");
	 * 
	 * 
	 * }
	 */
	

		}


