package com.arc.t1;

public class Test3 {

	public static void main(String[] args) {
		double d = Math.ceil(6.25); //올림
		System.out.println(d);
		d=6.72;
		d = Math.floor(d); //내림
		System.out.println(d);
		d=6.48;
		d = Math.round(d);
		System.out.println(d); //반올림
		
		d = Math.random();
		System.out.println(d);
		
		
		d = Math.random()*10;
		System.out.println((int)(d));
		
		
		
	}

}
