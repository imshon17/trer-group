package com.trer.group.bean;

import org.springframework.stereotype.Component;

import java.util.Random;
@Component
public class AuthCode {
	private static String authCode;

	private AuthCode() {

	}


	public static String getAuthCode() {
		if (authCode == null) {
			authCode = getCode();
		}
		return authCode;

	}


	private static String getCode() {
		String numbers = "0123456789";
		int lenghtCode = 6;
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < lenghtCode; i++) {
			int index = random.nextInt(numbers.length());
			sb.append(numbers.charAt(index));
		}
		return sb.toString();
	}
}
