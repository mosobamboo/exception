package com.java.execption;

public class HouseException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public HouseException(){
		super();
	}
	
	public HouseException(String msg){
		super(msg);
	}
	
	public HouseException(String msg, Throwable cause) {
		super(msg, cause);
	}	
	
	public HouseException(Throwable cause) {
		super(cause);
	}	

}
