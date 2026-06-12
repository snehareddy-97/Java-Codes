package com.GQT.javacodes.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Cricketer implements Serializable{
	String name;
	String country;
	transient int runs;
	int wickets;
	transient int catches;
	public Cricketer(String name,String country,int runs,int wickets,int catches) {
		super();
		this.name=name;
		this.country=country;
		this.runs=runs;
		this.wickets=wickets;
		this.catches=catches;
	}
	void display() {
		System.out.println(name);
		System.out.println(country);
		System.out.println(runs);
		System.out.println(wickets);
		System.out.println(catches);
	}
}
public class Program10Serialization  {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		//Serialization
		/*Cricketer c1=new Cricketer("virat","India",19000,20,300);
		c1.display();
		String p1="\\C:\\Users\\poola\\Desktop\\Gqt_JavaBasics\\IOFile\\Cricketer.txt";
		FileOutputStream fos=new FileOutputStream(p1);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(c1);
		*/
		//Deserialization
		String p1="\\C:\\Users\\poola\\Desktop\\Gqt_JavaBasics\\IOFile\\Cricketer.txt";
		FileInputStream fis=new FileInputStream(p1);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Cricketer c1=(Cricketer)ois.readObject();
		c1.display();
		
	}

}
