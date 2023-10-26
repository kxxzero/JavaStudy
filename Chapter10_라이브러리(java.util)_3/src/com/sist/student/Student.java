package com.sist.student;

// 학생 1명에 대한 데이터를 모아서 한 번에 관리 => 클래스
// 학생이라는 데이터형을 생성 => 사용자 정의 데이터형
// 데이터 은닉화 => 읽기/쓰기 기능 추가
public class Student {
	private int hakbun;
	private String name;
	private int kor, eng, math;
	
	// getter/setter
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
	
	// 생성자 오버로딩 => 1개의 메소드로 여러 개 기능 설정
	public Student()
	{
	}
	
	// 생성자
	public Student(int hakbun, String name, int kor, int eng, int math) {
		super();
		this.hakbun = hakbun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
}
