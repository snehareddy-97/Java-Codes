package com.GQT.javacodes.filehandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program5 {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		String P1="C:\\Users\\poola\\Desktop\\Gqt_JavaBasics\\IOFile\\Narendra-Modi.jpeg";
		String P2="C:\\Users\\poola\\Desktop\\Gqt_JavaBasics\\IOFile\\Narendra-Modi1.jpeg";
		
		FileInputStream fis=new FileInputStream(P1);
		BufferedInputStream bis=new BufferedInputStream(fis);
		int temp=0;
		FileOutputStream fos=new FileOutputStream(P2);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		while((temp=bis.read())!=-1) {
			bos.write(temp);
		}
		bos.close();
		bis.close();
		fos.close();
		fis.close();
	}

}
