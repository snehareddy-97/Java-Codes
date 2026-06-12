package com.GQT.javacodes.filehandling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Program3 {

	public static void main(String[] args) throws IOException {
		String p1="C:\\Users\\poola\\Desktop\\Gqt_JavaBasics\\IOFile\\input2.txt";
		String p2="C:\\Users\\poola\\Desktop\\Gqt_JavaBasics\\IOFile\\output2.txt";
		FileReader fr=new FileReader(p1);
		BufferedReader br=new BufferedReader(fr);
		int temp;
		FileWriter fw=new FileWriter(p2);
		BufferedWriter bw=new BufferedWriter(fw);
		while((temp=br.read())!=-1) {
			bw.write(temp);
	}
		bw.close();
		br.close();
		fw.close();
		fr.close();
}
}
