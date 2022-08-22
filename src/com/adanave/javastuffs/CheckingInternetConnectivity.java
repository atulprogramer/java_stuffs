package com.adanave.javastuffs;

import java.util.*;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class CheckingInternetConnectivity {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException {

		//method 1
		Process process= Runtime.getRuntime().exec("ping www.google.com");
        int x=process.waitFor();
        if (x==0){
            System.out.println("Connection successful, output was " +x);

        }else
        {
            System.out.println("internet is not connected, output was  "+x);
        }
        
        //method2
        try {
			URL url = new URL("https://www.google.com/");
			URLConnection connection= url.openConnection();
			connection.connect();
			
			System.out.println("Connection is successful");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Internet is not connected");
		}
    }
}
