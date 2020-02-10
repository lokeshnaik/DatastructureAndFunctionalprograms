package com.bridgelabz.datastructureprograms;
import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityScanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UnOrderedList {

	public static void main(String[] args) throws IOException
	{
		String path="/home/bridgelabz/eclipse-workspace/BridgeLabz7/java9/src/main/java/com/bridgelabz/datastructureprograms/sample.txt";
		String string=" ";
		FileReader str=new FileReader(path); 
		BufferedReader  buffer=new BufferedReader(str);
	     string=buffer.readLine();
	     String []array=string.split(" ");
	    for(int i=0;i<array.length;i++)
	     {
	    	  Utility.insert(array[i]);
	     }
	    System.out.println("Enter the string which you want to enter or wanted to find:");
	    String word=UtilityScanner.stringInput();
	    Utility.search(word);
	   String read=Utility.show();
	    write(read,path);
	     buffer.close();

	}
	public static void write(String read,String path)throws IOException
	{
		FileWriter fw=new FileWriter(path);
		fw.write(read);
		fw.close();
	}

}
