package com.pcschool.ocp.d07.case1;

import java.util.Arrays;

import com.pcschool.ocp.d07.case1.food.Food;
import com.pcschool.ocp.d07.case1.food.Hamburger;
import com.pcschool.ocp.d07.case1.food.Sandwich;

public class Breakfirst2 {
	public static void main(String[] args) {
		Food[] foods = {
				new Sandwich("火腿蛋"),
				new Sandwich("火腿蛋"),
				new Hamburger("牛肉蛋堡"),};
		
		System.out.println("總金額: " + Arrays.stream(foods).mapToInt(food -> food.getPrice()).sum());
	}
}
