package com.java.execption;

public class House {
	
	public int houseId;
	
	public String houseName;
	
	public int houseSize;

	public House(int houseId,String houseName,int houseSize){
		this.houseId = houseId;
		this.houseName = houseName;
		this.houseSize = houseSize;
	}
	
	public String getHouseName() {
		return houseName;
	}

	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	public int getHouseSize() {
		return houseSize;
	}

	public void setHouseSize(int houseSize) {
		this.houseSize = houseSize;
	}

	public int getHouseId() {
		return houseId;
	}

	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}
	
	

}
