package com.qspy.crm.generalUtilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtility 
{
	public  String ToReadDataFromProp(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream(".//src//test/resources/commondata.properties");
		Properties prop=new Properties();
		prop.load(fis);;
		String value=prop.getProperty(key);
		return value;
	}
}
