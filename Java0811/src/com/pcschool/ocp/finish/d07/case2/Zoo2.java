package com.pcschool.ocp.finish.d07.case2;

public class Zoo2 {
	public static void main(String[] args) {
		Animal animal1 = new Fish();
		Animal animal2 = new Penguin();
		
		if(animal1 instanceof Bird)
			((Bird) animal1).move();
		else
			System.out.println("Fish　不可轉型成　Bird");
		((Bird) animal2).move();
	}
}