package org.examle;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        System.out.println("Enter a word:");
        Scanner scanner=new Scanner(System.in);
        String word=scanner.nextLine();
        System.out.println("Length of the word is "+ word.length());
        String firstPart=word.substring(0,word.length()/2);
        System.out.println("First part of the word: "+firstPart);
        String secondPart=word.substring(word.length()/2);
        System.out.println("Second part of the word: "+secondPart);
        System.out.println("Whole word is "+firstPart+" "+secondPart);
    }
}
