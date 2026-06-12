package com.GQT.javacodes.filehandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program4 {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		String P1="C:\\Users\\poola\\Desktop\\Gqt_JavaBasics\\IOFile\\input3.txt";
		String P2="C:\\Users\\poola\\Desktop\\Gqt_JavaBasics\\IOFile\\output3.txt";
		
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
