package com.weasel.file.test;

import com.weasel.file.PropertyReader;

/**
 * @author Dylan
 * @mail pickear@gmail.com
 * @time 2014年7月17日
 */
public class PropertyReaderTest {
	

	public static void main(String[] args) {
		
		PropertyReader reader = PropertyReader.read("classpath*:application.properties");
		System.out.println(reader.getProperty("jdbc.dirverClass"));
		System.out.println(reader.getProperty("jdbc.url"));
		System.out.println(reader.getProperty("jdbc.username"));
		System.out.println(reader.getProperty("jdbc.password"));
	}
}
