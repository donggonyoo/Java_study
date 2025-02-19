package test;

import java.util.Date;

public class WhatDate {
	public static void main(String[] args) {
		Date expireDate = new Date(); //현재날짜 시간.
		System.out.println(expireDate);
		  expireDate.setTime(expireDate.getTime() +
				   (1000L * 60 * 60 * 24 * 365 * 2));
		  System.out.println(expireDate);
	}

}
