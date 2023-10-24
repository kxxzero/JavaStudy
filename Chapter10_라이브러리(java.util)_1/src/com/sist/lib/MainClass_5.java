package com.sist.lib;


/*
 * 	StringTokenizer
 */
import java.util.*;
public class MainClass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String data="red|green|blue|black|white|yellow|pink|cyan|magenta";
		
		// \\|
		StringTokenizer st=new StringTokenizer(data,"|");
		System.out.println("컬러 개수:"+st.countTokens());
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken()); // 값을 가져옴
		}
		
		/*
		 * 	hasMoreTokens
		 * 	1) cursor
		 * 	--------------------
		 * 		before First
		 * 	--------------------
		 * 		red => st.nextToken() => true
		 * 	--------------------
		 * 		blue => st.nextToken() => true
		 * 	--------------------
		 * 		green => st.nextToken() => true
		 * 	--------------------
		 * 		after Last => st.nextToken() => false
		 * 	--------------------
		 * 	
		 */
	}

}
