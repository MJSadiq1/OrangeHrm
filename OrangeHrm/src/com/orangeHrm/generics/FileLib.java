package com.orangeHrm.generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileLib extends Base {
	
	public String getpropertyValue(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("./Data/commondata.property");
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}

}
