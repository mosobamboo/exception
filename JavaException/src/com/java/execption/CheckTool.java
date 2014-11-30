package com.java.execption;

public class CheckTool {

	public static void checkHouse(House house) throws HouseException{
		if(house.getHouseSize()>1000){
			throw new HouseException("house size not limitted!");
		}
	}
	
}
