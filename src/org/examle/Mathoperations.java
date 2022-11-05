package org.examle;

import java.util.Scanner;

public class Mathoperations {
    public static void main(String[]args){
    System.out.println("Enter EUR : ");
    Scanner scanner= new Scanner(System.in);
    double eurValue=scanner.nextDouble();
    double coeff=0.99;
    double usd=eurValue*coeff;
    System.out.println("Eur equivalent "+eurValue+" is "+ usd +" $ ");}
}
