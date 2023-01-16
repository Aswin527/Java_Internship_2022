package com.challenge.string.IntegerInString;

public class CheckInteger {
	public String checkInt(String str) {
		str=str.replaceAll("[^0-9]", " ");
		str = str.replaceAll(" +", " ");
		return str;
	}
}
