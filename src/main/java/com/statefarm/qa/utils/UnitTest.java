package com.statefarm.qa.utils;

public class UnitTest {

	
	
	
	public static void main(String[] args) {
		 Configuration configuration1 = Configuration.getInstance();
		 Configuration configuration = Configuration.getInstance();
		 
		 UnitTest unit1 = new UnitTest();
		 UnitTest unit2 = new UnitTest();
		 
		 
		 System.out.println(configuration.hashCode() );
		 System.out.println("------------------------------------");
		 System.out.println(configuration1.hashCode() );
		 System.out.println("------------------------------------");
		 System.out.println(unit1.hashCode() );
		 System.out.println("------------------------------------");
		 System.out.println(unit2.hashCode() );
	}
}
