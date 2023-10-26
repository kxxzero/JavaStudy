package com.sist.io;

/*
 * 자바 입출력
 * 	= 반드시 예외 처리
 *  = 데이터 이동 통로를 이용 => Stream
 *  = 이동 통로

 * 	바이트 스트림 => File
 * 		- InputStream
 * 			· FileInputStream
 * 			· ObjectInputStream
 * 		- OuputStream
 * 			· FileOutputStream
 * 			· ObjectOutputStream
 * 		- Reader
 * 			· FileReader
 * 		- Writer
 * 			· FileWriter
 * 		
 * 	보조 스트림 => Buffered~
 * 		- BufferedReader
 * 		- BufferedWriter
 * 		- BufferedInputStream
 * 		- BufferedOuyputStream
 * 
 * 	----------------------------------------
 * 
 * 	1) 자바 특징 : 자바에서 IO는 Stream(데이터를 이통하는 통로)을 사용
 * 		- FIFO(First In First Out) = Queue
 * 		- LIFO(Last In First Out) = Stack(메모리)
 * 
 * 	2) IO : 단방향 통신(입력 따로 출력 따로) ↔ 양방향 통신(쓰레드를 통해 2개의 프로그램을 동시 처리 - 예: 채팅)
 * 		- 메모리 입출력
 * 		- 파일 입출력
 *		- 네트워크 입출력 => 웹
 *		- 읽기 / 쓰기(1byte, 2byte) 
 *		=> 인코딩 / 디코딩
 *			1byte : 바이트 스트림
 *				~InputStream, ~OutputStream
 *			2byte : 문자 스트림
 *				~Reader, ~Writer
 *				한글은 1글자 2byte => 한글이 깨짐
 *		
 *		*** 메모리(데이터 저장) ===(InputStream)===> 자바응용프로그램 ===(OutputStream)===> 모니터 전송
 *								System.in						System.out
 *			class System
 *			{
 *				InputStream in;
 *				OutputStream out;
 *			}
 *		
 *		*** 관련 클래스
 *			Object
 *				= ★★★File
 *				= InputStream
 *					- ★★★FileInputStream
 *					- FilterInputStream
 *						· ★★★BufferedInputStream
 *				= OutputStream
 *					- ★★★FileOutputStream
 *					- FilterOutputStream
 *						· ★★★BufferedOutputStream
 *				= Reader
 *					- ★★★BufferedReader
 *					- ★★★FileReader
 *				= Writer
 *					- BufferedWriter
 *					- ★★★FileWriter
 *				★★★ ObjectInputStream
 *				★★★ ObjectOutputStream
 *
 *			=> 파일 모드(mode) => r, w, a
 *				r-- w--...
 *
 *				r
 *				FileReader r=new FileReader("경로");
 *				w
 *				FileWriter w=new FileWriter("경로"); => create
 *				a
 *				FileWriter w=new FileWriter("경로", true); => append
 *
 *	3) File : 독립된 클래스
 *		- File 정보
 *			new File("경로명\\파일명")
 *		- 디렉토리 정보
 *			new File("경로명")
 *		- 주요 기능
 *			· getName() : 파일명, 폴더명 가져오기
 *			· getPath() : 경로명 ~ 파일명
 *			· getParent() : 경로명
 *		- 특성
 *			· canRead() : 읽기 전용인지 확인
 *			· canWriter() : 쓰기 전용인지 확인
 *			· isHidden() : 숨김 파일인지 확인
 *		- 파일/폴더 구분
 *			· isFile() : 
 *			· isDirectory() : 
 *			
 *	
 */ 

/*
 * 	<큐(Queue)>
 * 	int[] arr=new int[10];
 * 	int index=0;
 * 	for(int i=0; i<arr.length; i++)
 * 	{
 * 	}
 * 
 * 	<스택(Stack)>
 * 	int index=9;
 * 	for(int i=9; i>=0; i--)
 * 	{
 * 	}
 * 
 */

import java.util.*;
public class MainClass_1 {

	public static void main(String[] args) {
		System.out.println("===== FIFO =====");
		Queue<Integer> q=new LinkedList<Integer>();
		// 데이터 첨부
		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		q.offer(50);
		
		while(!q.isEmpty()) // 빈 공간이 아닐 때까지 루프
		{
			System.out.println(q.poll());
		}
		
		
		System.out.println("===== LIFO =====");
		Stack<Integer> s=new Stack<Integer>();
		// 저장
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		while(!s.isEmpty())
		{
			System.out.println(s.pop());
		}
		
		
		
		String str="자바";
		byte[] b=str.getBytes();
		System.out.println(Arrays.toString(URL));
		
		
		
	}
}
