package com.sist.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// 캡슐화
@Getter
@Setter
@Data
@NoArgsConstructor // 디폴트 생성자
@AllArgsConstructor // 매개변수 생성자

public class Music {
	// private : 은닉화
	// 변수 => 저장/값 읽기 => 메소드화
	private int mno;
	private String title;
	/*
	 * 	public void setTitle(String title)
	 * 	{
	 * 		this.title=title;
	 * 	}
	 */
	private String singer;
	private String album;
	private int idcrement;
	private String state;
	// 은닉화한 데이터를 클라이언트가 볼 수 있도록 하는 방법
	// 변수 => 메모리에 저장, 메모리에서 데이터 읽기
	// => 읽기 / 쓰기 => 기능 추가 => getter/setter : 데이터를 숨기고 메소드를 통해 변수의 기능을 사용할 수 있음 => 마우스 오른쪽 - 'source' - 'Generate Getter-Setter'
	
//	public int getMno() {
//		return mno;
//	}
//	public void setMno(int mno) {
//		this.mno = mno;
//	}
//	public String getTitle() {
//		return title;
//	}
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	public String getSinger() {
//		return singer;
//	}
//	public void setSinger(String singer) {
//		this.singer = singer;
//	}
//	public String getAlbum() {
//		return album;
//	}
//	public void setAlbum(String album) {
//		this.album = album;
//	}
//	public int getIdcrement() {
//		return idcrement;
//	}
//	public void setIdcrement(int idcrement) {
//		this.idcrement = idcrement;
//	}
//	public String getState() {
//		return state;
//	}
//	public void setState(String state) {
//		this.state = state;
//	}
}
