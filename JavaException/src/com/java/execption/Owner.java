package com.java.execption;

import java.util.List;

/**
 * owner model
 * 
 * @author jiazhong
 *
 */
public class Owner {
	
	public String name;
	
	public List<House> houses;
	
	
	public Owner(String name){
		this.name = name;
	}

	public Owner(String ownerName,List<House> houses){
		this.name = ownerName;
		this.houses = houses;
	}
	
	public void sellHouse(House house) throws HouseException{
		
		CheckTool.checkHouse(house);
		houses.remove(house);
		System.out.println("house "+house.houseName +" sold !");
	}

	
}
