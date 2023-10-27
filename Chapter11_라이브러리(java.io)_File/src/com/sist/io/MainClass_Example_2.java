package com.sist.io;
import java.util.*;
import java.io.*;
// 입출력 => IO => 메모리 제어 => IO를 통해 파일로 전송
// 캡슐화 
class Student
{
	private int hakbun;
	private String name;
	private int kor, eng, math;
	private int total;
	private double avg;
	
	// 기능 첨부 => 읽기/쓰기
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
}

class StudentManager
{
	private static ArrayList<Student> list=new ArrayList<Student>();
	static
	{
		FileReader fr=null;
		try
		{
			// 1|홍길동|90|90|90|270|90.00
			fr=new FileReader("c:\\java_data\\student.txt");
			String data="";
			int i=0;
			while((i=fr.read())!=-1)
			{
				data+=(char)i;
			}			
			String[] stds=data.split("\n"); // 1명씩 저장
			for(String s:stds)
			{
				StringTokenizer st=new StringTokenizer(s, "|");
				Student ss=new Student();
				ss.setHakbun(Integer.parseInt(st.nextToken()));
				ss.setName(st.nextToken());
				ss.setKor(Integer.parseInt(st.nextToken()));
				ss.setEng(Integer.parseInt(st.nextToken()));
				ss.setMath(Integer.parseInt(st.nextToken()));
				ss.setTotal(Integer.parseInt(st.nextToken()));
				ss.setAvg(Double.parseDouble(st.nextToken()));
				list.add(ss);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				fr.close();
			}catch(Exception ex) {}
		}
	}
	
	// 파일을 읽어서 초기화
	// 전체 목록 출력
	public ArrayList<Student> studentAllData()
	{
		return list;
	}
	
	// 학생 한 명에 대한 상세보기
	public Student studentDetailData(int hakbun)
	{
		Student ss=new Student();
		for(Student s:list)
		{
			if(s.getHakbun()==hakbun)
			{
				ss=s;
				break;
			}
		}
		return ss;
	}
	
	// 추가
	public void studentInsert(Student ss)
	{
		list.add(ss);
	}
	
	// 수정
	public void studentUpdate(int hakbun, Student ss)
	{
		int i=0;
		for(i=0; i<list.size(); i++)
		{
			Student s=list.get(i);
			if(s.getHakbun()==hakbun)
			{
				break;
			}
		}
		list.set(i, ss); // 수정
	}
	
	// 삭제
	public void studentDelete(int hakbun)
	{
		int i=0;
		for(i=0; i<list.size(); i++)
		{
			Student s=list.get(i); // 삭제될 대상
			if(s.getHakbun()==hakbun)
			{
				break; // i가 몇 번인지 확인 => 인덱스 번호
			}
		}
		list.remove(i);
	}
	
	public void save()
	{
		FileWriter fw=null;
		try
		{
			fw=new FileWriter("c:\\java_data\\student.txt");
			String msg="";
			for(Student s:list)
			{
				msg+=s.getHakbun()+"|"+s.getName()+"|"+s.getKor()+"|"+s.getEng()+"|"+s.getMath()+"|"+s.getTotal()+"|"+s.getAvg()+"\r\n";
			}
			msg=msg.substring(0, msg.lastIndexOf("\r\n"));
			fw.write(msg);
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				fw.close();
			}catch(Exception ex) {}
		}
	}
	
	public void getRead()
	{
		
	}
}
public class MainClass_Example_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
