package com.weasel.file.exception;

/**
 * @author Dylan
 * @mail pickear@gmail.com
 * @time 2014年7月17日
 */
public class FileNotFoundException extends RuntimeException{

	/**
	 * IOException.java
	 */
	private static final long serialVersionUID = 5314537421745810054L;

	public FileNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public FileNotFoundException(String message) {
		super(message);
	}
	

}
