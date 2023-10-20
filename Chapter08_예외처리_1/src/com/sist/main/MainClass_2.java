package com.sist.main;

/*
 * 	인터페이스의 다형성
 * 		- 1개의 메소드를 이용해서 다른 내용으로 구현 => 오버라이딩
 * 		- 
 */

interface II
{
	public void print()
	{
		
	}
}

class Music implements II
{
	public void print()
	{
		System.out.println("음악 목록 출력...");
	}
}

class Movie implements II
{
	public void print()
	{
		System.out.println("영화 목록 출력...");
	}
}

class Food implements II
{
	public void print()
	{
		System.out.println("맛집 목록 출력...");
	}
}

public class MainClass_2 {

	public static void main(String[] args) {
		II i=new Music();
		i.print();
		
		i=new Movie();
		i.print();
		
		i=new Food();
		i.print();
	}
}
