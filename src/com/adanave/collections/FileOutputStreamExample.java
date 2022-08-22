package com.adanave.collections;

import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream out = new FileOutputStream("C:\\Users\\adanave\\Documents\\Atul\\file\\output.txt");
		String s= "I love my family";
		byte b[]=s.getBytes();
		out.write(b);
out.close();		
		System.out.println("success");
	}
}
