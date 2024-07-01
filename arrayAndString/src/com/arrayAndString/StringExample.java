package com.arrayAndString;

public class StringExample {

	public static void main(String[] args) {
		
		String st="Hello World";
		String st1=new String("Hi there");
		String st2="Hello World";
		String st3=new String("Hi there");
		System.out.println(st.hashCode());
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st3.hashCode());
		
		String ss="   ";
		System.out.println(st.length());
		System.out.println(st.charAt(5));
		System.out.println(st.concat(st3));
		System.out.println(st.compareTo(st3));
		System.out.println(st.equalsIgnoreCase(st3));
		System.out.println(st.contains("Hello"));
		System.out.println(st.contains("H"));
		System.out.println(st.endsWith("d"));
		System.out.println(st.toLowerCase());
		System.out.println(st.toUpperCase());
		System.out.println(st.indexOf('W'));
		System.out.println(ss.isBlank());
		System.out.println(st.isEmpty());
		System.out.println(st.replace('H', 'h'));
		System.out.println(st.replace("Hello", "Hi"));
		System.out.println(st.substring(4, 8));
		st="Hi there";
		System.out.println(st.hashCode());
		
		StringBuffer buffer=new StringBuffer("Welocme");
		StringBuilder builder=new StringBuilder("Hello");

	}

}
