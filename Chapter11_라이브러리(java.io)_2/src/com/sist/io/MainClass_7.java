package com.sist.io;
// ObjectInputStream : FileInputStream

import java.io.*;
import java.util.*;
public class MainClass_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			FileInputStream fis=new FileInputStream("c:\\java_data\\emp.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			ArrayList<Sawon> list=(ArrayList<Sawon>)ois.readObject();
			// 형변환 시 제네릭 포함
			fis.close();
			ois.close();
			
			for(Sawon s:list)
			{
				System.out.println(s.getSabun());
				System.out.println(s.getName());
				System.out.println(s.getDept());
				System.out.println(s.getJob());
				System.out.println(s.getPay());
			}
		}catch(Exception ex) {}
	}

}
