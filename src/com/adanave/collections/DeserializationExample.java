package com.adanave.collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub

		try {
			ObjectInputStream input = new ObjectInputStream(new FileInputStream("C:\\Users\\adanave\\Documents\\Atul\\output.txt"));
			Employee e1 = (Employee)input.readObject();
			Employee e2 = (Employee)input.readObject();
			Employee e3 = (Employee)input.readObject();
			System.out.println(e1.id + " "+ e1.name);
			System.out.println(e2.id + " "+ e2.name);
			System.out.println(e3.id + " "+ e3.name);
			input.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
