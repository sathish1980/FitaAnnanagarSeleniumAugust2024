package Testcase;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import Utils.ExcelfileRead;

public class DataProviderAnnotaions {

	
	@DataProvider
	public Object[][] GetValidSearchTestdata() throws IOException
	{
		return ExcelfileRead.ExcelRead("Validsearch");
	}
}
