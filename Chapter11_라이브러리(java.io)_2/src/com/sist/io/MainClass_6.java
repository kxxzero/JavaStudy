package com.sist.io;

import java.io.*;
import java.util.*;
// 객체 단위 저장 => 객체 단위로 읽기 => ObjectInputStream
// ObjectOutputStream
class Sawon implements Serializable // Serializable : 메모리 직렬화 저장 => 인터페이스
{
	private int sabun;
	private String name;
	private String dept;
	private String job;
	private int pay;
	
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	public Sawon(int sabun, String name, String dept, String job, int pay) {
		super();
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.job = job;
		this.pay = pay;
	}
	
	public Sawon()
	{
		
	}
	
	
}
public class MainClass_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			// 메모리에 저장 => ArrayList
			ArrayList<Sawon> list=new ArrayList<Sawon>();
			list.add(new Sawon(1, "홍길동", "개발부", "대리", 3800));
			list.add(new Sawon(2, "홍길동", "개발부", "대리", 3800));
			list.add(new Sawon(3, "홍길동", "개발부", "대리", 3800));
			list.add(new Sawon(4, "홍길동", "개발부", "대리", 3800));
			list.add(new Sawon(5, "홍길동", "개발부", "대리", 3800));
			
			// 파일에 저장
			FileOutputStream fos=new FileOutputStream("c:\\java_data\\emp.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(list);
			oos.close();
			fos.close();
			System.out.println("객체 단위 저장 완료!");
		}catch(Exception ex) {}
		
	}

}
