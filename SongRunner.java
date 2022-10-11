package com.Instantiation.boot.Runner;
import  com.Instantiation.boot.Song;
public class SongRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Song old = new Song();
		System.out.println(old.name);
		System.out.println(old.slang);
		System.out.println(old.singer);
        System.out.println(old.lyrics);
        System.out.println(old.type);
        
       old.name="jeena yeha marna yeha ";
       old.slang="hindi";
       old.singer="Mukesh";
       old.lyrics="jeena yeha";
       old.type="soul music";
		
		System.out.println(old.name);
		System.out.println(old.slang);
		System.out.println(old.singer);
		System.out.println(old.lyrics);
		System.out.println(old.type);
		
		
	}

}
