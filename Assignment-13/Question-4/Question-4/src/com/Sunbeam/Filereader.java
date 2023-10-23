package com.Sunbeam;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;

public class Filereader {

	public static void main(String[] args) {
	
	}
	
	String path = "/home/nishant-pc/DAC/Java/Assignment-13/Question-4/Question-4/src/com";
	File file = new File(path);
	if(!file.exists()) {
		System.out.println("Path doesnt exits.");
		System.exit(1);
	
	  if(file.isFile()) {
	
		try(FileReader fr = new FileReader("File.txt")){
	try(	BufferedReader br = new BufferedReader(fr)){
		String line;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		

	}

}
	  catch(Exception e) {
	e.printStackTrace();
}
}
	}
}
}
