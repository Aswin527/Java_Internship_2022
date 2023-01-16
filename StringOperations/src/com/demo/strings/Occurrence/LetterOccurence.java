package com.demo.strings.Occurrence;

import java.util.Scanner;

public class LetterOccurence {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String:- ");
		String str;
		str=scn.nextLine();
		String pi="";
		System.out.println("Repeated Letters are:");
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(pi.indexOf(c)!=-1) {
				continue;
			}
			int k=getCount(str,c);
			if(k>1)
				System.out.println(c);
			pi+=c;
		}
	}
	
	static int getCount(String s,char c) {
		String d=s.replace(c+"", "");
		return s.length()-d.length();
	}
}
