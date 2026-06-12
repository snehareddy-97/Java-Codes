package com.GQT.javacodes.filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		try {
			String p1="C:\\Users\\poola\\Desktop\\Gqt_JavaBasics\\IOFile\\File3.txt";
			FileWriter fw=new FileWriter(p1);
			fw.write("Hello Welcome to GQT");
			fw.close();
			System.out.println("Reading the data from the file:");
			FileReader fr=new FileReader(p1);
			Scanner sc=new Scanner(fr);
			while(sc.hasNextLine()) {//Checks for next line,true (Line 1 exists)
				String temp=sc.next();//Reads next word ,which reads one word, not one line.
				System.out.print(temp);
			}
			
			sc.close();
			fr.close();
			/*File f1=new File(p1);
			System.out.println(f1.delete());*/
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

	
}
