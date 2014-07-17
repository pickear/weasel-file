package com.weasel.file;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.weasel.file.exception.FileNotFoundException;

/**
 * 
 * @author Dylan
 * 
 */
public class PropertyReader {

	private static Properties properties = new Properties();

	private PropertyReader(String fileName) {
		InputStream is = PropertyReader.class.getResourceAsStream(fileName);
		try {
			properties.load(is);
		} catch (IOException e) {
			throw new FileNotFoundException("can not load file", e);
		}
	}

	public String getProperty(String key) {
		return properties.getProperty(key);
	}

	/**
	 * @param fileName
	 * @return
	 */
	public static PropertyReader read(String fileName) {
		
		return new PropertyReader(fileName);
	}
}
