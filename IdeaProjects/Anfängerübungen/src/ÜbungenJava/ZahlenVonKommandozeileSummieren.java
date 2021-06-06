package ÜbungenJava;

public class ZahlenVonKommandozeileSummieren {

    public static void main(String[] args){

        final int inputende = 0;
        int input;
        int sum=0;

        System.out.println("Wie viel wurde erbeutet?");
        do {
            input = new java.util.Scanner(System.in).nextInt();
            sum=sum+input;
        } while ( input != inputende);

        System.out.println("Ergebnis: " + sum);
    }

}
