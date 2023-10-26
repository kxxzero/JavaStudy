package com.sist.student;

/*
 *  클래스
 *  	1) 데이터 => 오라클의 column
 *  		데이터형을 만든다
 *  		=> Music => 가수명, 제목, 앨범...
 *  		=> Movie => 제목, 감독, 출연...
 *  		=> 캡슐화 => 변수에 읽기/쓰기 기능 추가
 *  	2) 사용자 요청 => 기능
 *  		=> 목록 출력, 상세보기, 찾기, 예매, 추천...
 *  		=> 상속/포함/오버라이딩
 *  	3) 데이터가 여러 개일 경우 => 모아서 관리
 *  		=> 컬렉션(계속 갱신, 추가 => 가변형)/배열(고정하기 어려움)
 *  		=> 배열 대신 컬렉션을 이용해서 처리하면 편리함
 *  		컬렉션
 *  		 - List : 중복 허용, 순서 있음(인덱스 번호)
 *				· ArrayList : 비동기, 데이터베이스 프로그램 특성화
 *					get() : 읽기
 *					size() : 총 개수
 *					add() : 추가
 *					=> 실제 수정 => 오라클에서 수정, 삭제, 추가 			
 */

import java.util.*;
public class StudentManager {

	private static ArrayList<Student> list=new ArrayList<Student>();
	
	// 여러 명 저장
	// 초기화 => 생성자
	public StudentManager()
	{
		list.add(new Student(1, "홍길동", 89, 79, 90));
		list.add(new Student(2, "심청이", 88, 78, 89));
		list.add(new Student(3, "춘향이", 87, 77, 88));
		list.add(new Student(4, "이순신", 86, 76, 87));
		list.add(new Student(5, "박문수", 85, 75, 86));
	}
	// 리턴형 / 매개변수
	
	// 1. 목록 출력
	public ArrayList<Student> studentAllData()
	{
		return list;
	}
	
	// 2. 상세보기
	public Student studentDetailData(int hakbun)
	{
		Student s=new Student();
		for(Student std:list)
		{
			if(std.getHakbun()==hakbun)
			{
				s=std;
				break;
			}
		}
		return s;
	}
	
	// 자동 증가 => sequence => 중복이 없는 데이터 생성
	public int hakbunMaxData()
	{
		int max=0;
		for(Student std:list)
		{
			if(max<std.getHakbun())
			{
				max=std.getHakbun();
			}
		}
		return max+1;
	}
	
	// 3. 학생 추가 : add
	// 추가, 수정 => 매개변수가 많음(클래스로 전송)
	// 순서 없이 처리
	public void studentInsert(Student std)
	{
		list.add(std);
		System.out.println("학생 추가가 완료되었습니다.");
	}
	
	
	// 4. 학생 수정 : set(int index, 데이터)
	public void studentUpdate(Student std)
	{
		int index=0;
		for(int i=0; i<list.size(); i++)
		{
			Student s=list.get(i);
			if(s.getHakbun()==std.getHakbun())
			{
				index=i;
				break;
			}
		}
		list.set(index, std);
		System.out.println("학생 수정이 완료되었습니다.");
	}
	
	// 5. 학생 삭제 : remove(int index)
	public void studentDelete(int hakbun)
	{
		for(int i=0; i<list.size(); i++)
		{
			Student s=list.get(i);
			if(s.getHakbun()==hakbun)
			{
				list.remove(i);
				System.out.println(hakbun+"학번을 삭제하였습니다.");
				break;
			}
		}
	}

	// 6. 학생 찾기 : contains
	public ArrayList<Student> studentFindData(String name)
	{
		ArrayList<Student> arr=new ArrayList<Student>();
		for(Student std:list)
		{
			if(std.getName().contains(name))
			{
				arr.add(std);
			}
		}
		return arr;
	}

}
