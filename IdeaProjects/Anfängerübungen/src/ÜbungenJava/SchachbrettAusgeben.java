package ÜbungenJava;


import java.util.Scanner;

public class SchachbrettAusgeben {


    public static void main(String[]args){

        int breite = new Scanner(System.in).nextInt();
        int hoehe = new Scanner(System.in).nextInt();

        for (int i = 1; i<=hoehe;i++){
            for(int j = 1; j<=breite;j++)
                System.out.print((i+j)%2 == 1 ? "_": "#");
            System.out.println();
        }

    }

}
