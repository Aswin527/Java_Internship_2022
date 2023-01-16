package com.example.string.UpperLower;

import java.util.Scanner;

public class StringConvert {

	public static void main(String[] args) {
		String str;
        System.out.println("Enter a String : ");
        Scanner scn=new Scanner(System.in);
        str=scn.nextLine();
        char strArr[] = str.toCharArray();
        for (int i = 0; i < strArr.length; i++) {
                if (strArr[i] >= 'a' && strArr[i] <= 'z') {//checking each letter whether it is lower case
                        strArr[i] = (char) ((int) strArr[i] - 32);//difference between lower and upper case is 32 in ANSCII 
                }
        }
        
        System.out.println("Upper case string is : ");
        for (int i = 0; i < strArr.length; i++) {
                System.out.print(strArr[i]);
        }
        System.out.println("\n");
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] >= 'A' && strArr[i] <= 'Z') {
                    strArr[i] = (char) ((int) strArr[i] + 32);
            }
        }
        System.out.println("Lower case string is : ");
        for (int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i]);
        }
        
        scn.close();
	}

}
