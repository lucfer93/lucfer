package com.company;

public class CoinMachine {

    public static void main(String[]args){

       int noOfBottles=0;

        System.out.println(noOfBottles + " " + (noOfBottles != 1 ? "bottles" : "bottle") + " of rum");

        if(noOfBottles!=1){
            System.out.println(noOfBottles + " bottles of rum");
        }else{
            System.out.println(noOfBottles + " bottle of rum");
        }
    }

}
