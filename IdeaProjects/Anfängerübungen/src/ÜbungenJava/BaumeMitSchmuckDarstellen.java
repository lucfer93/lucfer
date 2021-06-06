package ÜbungenJava;

public class BaumeMitSchmuckDarstellen {

    public static void main(String[]args){

        System.out.println("Bitte maximale Baumgröße angeben!");
        int width = new java.util.Scanner(System.in).nextInt();

        for(int sterne=1, leer = (width-1)/2; sterne<width; sterne+=2, leer--){
            for (int i=0; i<leer;i++)
                System.out.print(" ");
            for (int j=0; j<sterne;j++)
                System.out.print(Math.random()<0.7 ? "*":"o");
            System.out.println();
        }
        }
}
