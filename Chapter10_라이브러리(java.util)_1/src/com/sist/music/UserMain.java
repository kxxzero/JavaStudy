package com.sist.music;

public class UserMain {

	public static void main(String[] args) {
		MusicManager m=new MusicManager();
		Music[] music=m.musicAllData();
		for(Music mm:music)
		{
			System.out.println(mm.getRank()+"."+mm.getTitle());
		}
	}
}
