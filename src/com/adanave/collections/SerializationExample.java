package com.adanave.collections;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		try {
			Employee emp1 = new Employee(1, "Atul");
			Employee emp2 = new Employee(2, "Geeta");
			Employee emp3 = new Employee(3, "Test");

			FileOutputStream fout =  new FileOutputStream("C:\\Users\\adanave\\Documents\\Atul\\output.txt");
			ObjectOutputStream objout= new ObjectOutputStream(fout);
			objout.writeObject(emp1);
			objout.writeObject(emp2);
			objout.writeObject(emp3);
			objout.flush();
			objout.close();
			System.out.println("Serialization and deserialization is successfully executed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
