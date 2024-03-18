package com.adhiraj.main;

import java.text.DecimalFormat;

public class Main2 {
	public static void main(String[] args) {
		double numb1 = 123456.7891;
		double numb2 = 987.65432154;
		
		String pattern1 = ".#####";  // it means printing four digits after decimal.
		
		DecimalFormat format1 = new DecimalFormat(pattern1);
		System.out.println(format1.format(numb1));
		System.out.println(format1.format(numb2));
		
		System.out.println("============================");
		String pattern2 = "##,##,##.####";
		DecimalFormat format2 = new DecimalFormat(pattern2);
		System.out.println(format2.format(numb1));
		System.out.println(format2.format(numb2));
	}
}

/*
	O/P:
	123456.7891
	987.65432
	============================
	12,34,56.7891
	9,87.6543
*/
