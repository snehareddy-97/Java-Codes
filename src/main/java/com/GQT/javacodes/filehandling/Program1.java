package com.GQT.javacodes.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program1 {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		String P1="C:\\Users\\poola\\Desktop\\Gqt_JavaBasics\\IOFile\\input.txt";
		String P2="C:\\Users\\poola\\Desktop\\Gqt_JavaBasics\\IOFile\\output.txt";
		
		FileInputStream fis=new FileInputStream(P1);
		int temp=0;
		FileOutputStream fos=new FileOutputStream(P2);
		while((temp=fis.read())!=-1) {
			fos.write(temp);
		}
		fos.close();
		fis.close();
	}

}
