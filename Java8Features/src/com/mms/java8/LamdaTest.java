package com.mms.java8;

public class LamdaTest {

	public static void main(String[] args) {
		
		//legacy way of implementation
		Addition add1 = new Addition();
		int legacySum = add1.operation(4, 5);
		System.out.println(legacySum);
		
		
		
	}

}


// functional interface 
//only one method
 interface MathOperation
 {
	 int operation(int a, int b);
 }

 
 //legacy way of implementing
 class Addition implements MathOperation
 {

	@Override
	public int operation(int a, int b) {
		
		return  a +b;
	}
	 
 }
 