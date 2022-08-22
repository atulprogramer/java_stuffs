package com.adanave.programs.strings;

//lower case ascii value 97 to 122
//upper case ascii value 65 to 90
public class PS1_FindUpperCaseLowerCaseCount {
 
    public static void main(String[] args) {
        
        String name= "My Name is Atul";

        int lowerCaseCount= 0;
        int upperCaseCount=0;

        for (int i =0;i<name.length();i++){
            char ch= name.charAt(i);
        
        
        if (ch >= 'a' && ch<='z'){
            lowerCaseCount++;}
            else if (ch >='A' && ch<='Z'){
                upperCaseCount++;
            }

        }

        System.out.println("lowercase count is "+lowerCaseCount);
        System.out.println("upper case count is "+upperCaseCount);
        }

    }

