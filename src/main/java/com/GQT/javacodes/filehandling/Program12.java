package com.GQT.javacodes.filehandling;

import java.io.File;
import java.io.IOException;

public class Program12 {

	public static void main(String[] args) throws IOException {
		String p1="\\C:\\Users\\poola\\Desktop\\Gqt_JavaBasics\\IOFile\\File1.txt";
		File f1=new File(p1);
		f1.createNewFile();//create the file specified in the pathf1.createNewFile();//create the file specified in the path
		System.out.println(f1.exists());//checks if the file in the path is present or not
		System.out.println(f1.canExecute());//checks if the file is having execute rights or not
		System.out.println(f1.canWrite());//checks if the file is having write access or not
		System.out.println(f1.canRead());//checks if the file is having Read rights or not
		System.out.println(f1.getAbsoluteFile());//display the file path
		System.out.println(f1.getCanonicalPath());//display the file path
		System.out.println(f1.getFreeSpace());//display the space unallocated in bytes
		System.out.println(f1.getName());//display the file name
		System.out.println(f1.getParent());//display the root path
		System.out.println(f1.getPath());//display the file path
		System.out.println(f1.getTotalSpace());//display the total Space Available in bytes
		System.out.println(f1.getUsableSpace());//display the usable space
		System.out.println(f1.hashCode());//displays the unique value for the file object
		System.out.println(f1.isAbsolute());//checks it it is an absolute path
		System.out.println(f1.isDirectory());//checks if the path points to directory
		System.out.println(f1.isFile());//checks if the path points to File
		System.out.println(f1.isHidden());//checks if the path points to hidden 
		File f2=new File("\\C:\\Users\\poola\\Desktop\\Gqt_JavaBasics\\IOFile\\Hidden.txt");
		System.out.println(f2.isHidden());//checks if the path points to hidden
		System.out.println(f1.lastModified());//last modified value in terms of long
		System.out.println(f1.length());//prints the length of characters in the file
		//System.out.println(f1.delete());it will delete the whole file
	    
		
		
	}

}
