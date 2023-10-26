package com.sist.lib;

/*
 * 	제네릭 : 데이터형을 통일화(기존에 설정된 데이터를 변경) // 데이터형을 한 번에 바꿈
 * 		=> 기본형은 사용할 수 없고 클래스형만 사용 가능 => Wrapper를 이용해서 기본형을 사용할 수 있게 만듦
 * 		<클래스형> => 자바에서는 컬렉션 => Object로 설정이 되어 있음 => 지정된 클래스형으로 변경
 * 		<T> = type(클래스형)
 * 		<E> = element(요소)
 * 		<K> = key
 * 		<V> = value
 * 
 * 		List<E>
 * 		Vector<E>
 * 		Set<E>
 * 		Map<K,V>
 * 
 * 		*** 장점 : 소스가 간결해짐 => 형변환이 필요함
 * 			단점 : 무조건 지정된 데이터형만 첨부
 * 			ArraysList => Object
 * 			ArrayList<String> => String
 * 			ArrayList<Integer> => int ArrayList<int> (X)
 * 			ArrayList<Music> => Music => 사용자 정의 클래스도 가능
 * 			=> 저장된 데이터는 같은 데이터형을 사용해야 편리
 * 			
 */

class Data<T>
{
	private T t;
	public void setT(T t)
	{
		this.t=t;
	}
	public T getT()
	{
		return t;
	}
	
}

public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Data data=new Data();
//		Data<String> d=new Data<String>();
		Data d=new Data();
		Data<String> d1=new Data<String>();
	}

}
