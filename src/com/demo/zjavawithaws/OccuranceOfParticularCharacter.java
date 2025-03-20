package com.demo.zjavawithaws;

public class OccuranceOfParticularCharacter {

	public static void main(String[] args) {
		
		String str = "sai pratheek";
		
		str = str.replaceAll("\\s", "");
		char ch='a';
		
		int count = (int) str.chars().mapToObj(a->(char)a).filter(o->o.equals(ch)).count();
		System.out.println(count);

	}

}
