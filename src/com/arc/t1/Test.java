package com.arc.t1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//스캐너를 사용
		//주민등록번호 입력 991222-1234567
		//나이
		//계절
		//성별
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하세요~~");
		String num = sc.next();
		
		
		String year = num.substring(0, 2);
		String mon = num.substring(2, 4);
		String sex = num.substring(7, 8);
		
		String y = null;
		if(sex.equals("1") || sex.equals("2")) {
			y="19";
		}else if(sex.equals("3") || sex.equals("4")) {
			y="20";
		}
		
		year = y+year;
		int age = 2019 - Integer.parseInt(year) +1;
		System.out.println("나이 : "+age);
		
		
		
		if(mon.equals("03") || mon.equals("04") || mon.equals("05")) {
			System.out.println("계절 : 봄");
		}else if(mon.equals("06") || mon.equals("07") || mon.equals("08")) {
			System.out.println("계절 : 여름");
		}else if(mon.equals("09") || mon.equals("10") || mon.equals("11")) {
			System.out.println("계절 : 가을");
		}else if(mon.equals("12") || mon.equals("01") || mon.equals("02")) {
			System.out.println("계절 : 겨울");
		}//if
		
		
		/*
		if(sex.equals("1") || sex.equals("3") || sex.equals("5")) {
			System.out.println("성별 : 남");
		}else if(sex.equals("2") || sex.equals("4") || sex.equals("6")){
			System.out.println("성별 : 여");
		}
		
		char ch = num.charAt(7)
		if(ch == '1')
		
		*/
		int n=Integer.parseInt(sex)%2;
		if(n==0) {
			System.out.println("성별 : 여");
		}else {
			System.out.println("성별 : 남");
		}//if
		
	}//main

}
