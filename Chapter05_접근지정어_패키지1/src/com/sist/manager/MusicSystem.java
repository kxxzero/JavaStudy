
package com.sist.manager;

import lombok.Getter;
import lombok.Setter;

/*
 * 	class A
 *	{
 *		int aa;
 *		static int bbb;
 *	}
 *	A a=new A(); => a.aa
 *	A.bb
 *	
 */

public class MusicSystem {
	
	@Getter // 불러오기(가져오기)
	@Setter // 저장
	// 데이터는 감추고 메소드를 통해 데이터에 접근할 수 있음 => 메소드는 주소값만 저장되기 때문에 노출되어도 상관없음
	private static Music[] musics=new Music[50]; // 값을 채움
	
	static
	{
		// 초기화 블록 => static 변수만 사용 가능 => 자동 인식(실행)
		// 상속 불가 => 호출 없이 실행 가능	
		// 생성자 이용 가능
	}
}
