package com.epam.design_patterns.tddjunit;

public class RemoveCharacterA {
	public String remove(String string) {
		int length = string.length();
		return string.substring(0,Math.min(length, 2)).replace("A", "") +
			   string.substring(Math.min(length, 2),length);
	}
}
