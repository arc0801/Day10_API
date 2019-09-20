package com.arc.t1;

import java.util.Scanner;

public class Test2 {
	
	public static void main(String[] args) {
		// 주민등록번호 입력 971222-1234567
		//  9 7 1 2 2 2 1 2 3 4 5 6 7(검증용 번호)
		// *2 3 4 5 6 7 8 9 2 3 4 5 
		// 18+21+4 10 12 
		// sum/11
		// 11-나머지    ;; 만약 결과값이 두자리라면 결과값을 /10 나머지 값으로 검증번호 비교
		// 결과값 == 검증용 번호
		
		Scanner sc = new Scanner(System.in);
		
		String num = "971222-1234567";
		num = num.replace("-", "");
		int sum = 0;
		
		
		for(int i=0;i<num.length()-1;i++) {
			char a = num.charAt(i);
			String b = num.valueOf(a);
			sum = sum + Integer.parseInt(b)*(2+i);
			System.out.println(sum);
			
		}
		
		
		
		
		
		
		
	}//main
}
