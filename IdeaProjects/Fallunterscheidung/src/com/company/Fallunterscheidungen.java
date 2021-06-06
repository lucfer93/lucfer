package com.company;

public class Fallunterscheidungen {

    public static void main (String[]args){

        System.out.println("Wie viel Liter sollen umgerechnet werden?");
        double liquid = new java.util.Scanner(System.in).nextDouble();

        if(liquid>=1){
            System.out.println(liquid==1 ? "Es ist ca. " + (int)liquid +" Liter":"Es sind ca. " + (int)liquid + " Liter");
        }else if (liquid>=0.1){
            liquid=liquid*100;
            System.out.println("Es sind ca. " + (int)liquid + " Centiliter");
        }else if (liquid>=0.001){
            liquid=liquid*1000;
            System.out.println("Es sind ca. "+ (int)liquid + " Milliliter");
        }else{
            System.out.println("Die Zahl ist zu klein!");
        }


    }
}
