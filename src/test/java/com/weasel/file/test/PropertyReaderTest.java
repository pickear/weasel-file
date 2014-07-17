package com.weasel.file.test;

import com.weasel.file.PropertyReader;
import com.weasel.lang.helper.JdkLoggerFactory;
import com.weasel.lang.logging.JdkLogger;

/**
 * @author Dylan
 * @mail pickear@gmail.com
 * @time 2014年7月17日
 */
public class PropertyReaderTest {
	
	private final static JdkLogger log = JdkLoggerFactory.getLogger(PropertyReaderTest.class);

	public static void main(String[] args) {
		
		PropertyReader reader = PropertyReader.read("/application.properties");
		log.info(reader.getProperty("jdbc.dirverClass"));
	}
}
