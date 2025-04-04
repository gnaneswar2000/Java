package com.gnani.exceptionHandling;

public class User {

	public static void main(String[] args) throws LoginException   {
		try {
			int i = 1;
			int res = i/0;
		} catch (ArithmeticException e) {
			throw new LoginException("WTF!!!");
			}
	}
}
