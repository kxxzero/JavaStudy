package com.sist.lib;

import java.util.*;

class Sawon{
	private int sabun;
	private String name;
	private String dept;
	
	public Sawon(int sabun, String name, String dept)
	{
		this.sabun=sabun;
		this.name=name;
		this.dept=dept;
	}
	
	public void print()
	{
		System.out.println("사번:"+sabun);
		System.out.println("이름:"+name);
		System.out.println("부서:"+dept);
	}
}

public class MainClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Object 대신 저장해야 되는 데이터형 설정 => 모든 매개변수, 리턴형이 변경된
		// => 제네릭 => 컬렉션은 가급적이면 제네릭 사용 권장
		// 데이터 첨부 시에 워하는 데이터만 첨부 가능
		ArrayList<Sawon> list=new ArrayList(); 
		list.add(new Sawon(1, "홍길동", "개발부"));
		list.add(new Sawon(2, "홍길동", "영업부"));
		list.add(new Sawon(3, "홍길동", "총무부"));
		
		for(int i=0; i<list.size(); i++)
		{
			Sawon obj=(Sawon)list.get(i); // 형변환
			obj.print();
		}
		//list => Object
		
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add("홍길동");
//		list.add(4);
//		list.add(5);
//		
//		for(int i=0; i<list.size(); i++)
//		{
//			int val=(int)list.get(i);
//			System.out.println(val);
//		}
	}

}
