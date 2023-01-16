package com.challenge.string.IntegerInString;

import java.util.Scanner;

public class CheckIntTest {

	public static void main(String[] args) {
		CheckInteger obj=new CheckInteger();
		String str;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String:");
		str=scn.nextLine();
		String int_values=obj.checkInt(str);
		System.out.println("Integer Values in Above String:-"+int_values);
	}

}
