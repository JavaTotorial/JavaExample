package com.pcschool.ocp.d12_exception.case1;

import java.util.Scanner;

public class InputDemo {
	public static void main(String[] args) {
		input();
	}

	public static void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入一個數字: ");
		int x = scanner.nextInt();
		System.out.printf("x= %d %s\n", x, x % 2 == 0 ? "偶數" : "奇數");
	}
}
