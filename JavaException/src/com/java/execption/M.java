package com.java.execption;

import java.util.ArrayList;
import java.util.List;


/**
 * @author Zhong,Jason
 *
 */
public class M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		//init Houses
		List houses = new ArrayList<House>();
		House h1 = new House(1107,"house1",101);
		House h2 = new House(1108,"house2",1001);
		houses.add(h1);
		houses.add(h2);
		
		//init Owner
		Owner owner = new Owner("jiazhong",houses);
		
		try {
			owner.sellHouse(h2);
		} catch (HouseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
