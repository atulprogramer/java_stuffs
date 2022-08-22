package com.adanave.javastuffs;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * DifferentTimestamps
 */
public class DifferentTimestamps {

  public DifferentTimestamps() {
	  System.out.println("this is constructor");
	  }

    public static void main(String[] args) {
        //String timestmpFormat= "MM/dd/yyyy";

System.out.println("calling getCurrentTimeStamp in string method ");   
	
	DifferentTimestamps obj = new DifferentTimestamps();
System.out.println(obj.getCurrentTimeStamp("MM/dd/yyyy"));


    }

    public Timestamp getCurrentTimeStamp(){
    	Timestamp timestamp= new Timestamp(System.currentTimeMillis());

        return timestamp;

    }
    public String getCurrentTimeStamp(String dateTimeFormat){

        DateFormat dateFormat= new SimpleDateFormat(dateTimeFormat);

        String timeStampInString= dateFormat.format(getCurrentTimeStamp()).toString();

        return timeStampInString;

    }
}