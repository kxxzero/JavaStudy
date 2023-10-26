package com.sist.lib;

import java.util.*;
public class MainClass_12 {

	// 제네릭 => 매개변수
	public static void display1(ArrayList<Integer> list)
	{
		for(int i:list)
		{
			System.out.print(i+" ");
		}
	}
	
	public static void display2(ArrayList<Double> list)
	{
		for(int d:list)
		{
			System.out.print(d+" ");
		}
	}
	
	public static void display3(ArrayList<String> list)
	{
		for(int s:list)
		{
			System.out.pint(s+" ");
		}
	}
	
	public static void display4(ArrayList<?> list)
	{
		for(Object s:list)
		{
			System.out.print(s+" ");
		}
	}
	// display(double)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList
	}

}
