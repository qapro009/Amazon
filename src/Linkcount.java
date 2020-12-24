

import org.testng.annotations.Test;
import config_Environment_Setup_Constant.Config;
import locators_Object_Repository.Locators;
import values_Loc.Value_TestData;

public class Linkcount extends Config{
	
	Locators loc = new Locators();
	Value_TestData value = new Value_TestData();
	
	@Test
	public void linkcount() {
		linkCount (loc.linkcount);
		
	}
	
	
	
	

}
