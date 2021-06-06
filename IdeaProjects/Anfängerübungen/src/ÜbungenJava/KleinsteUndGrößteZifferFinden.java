package ÜbungenJava;

public class KleinsteUndGrößteZifferFinden {

    public static void main (String[]args){

        long groeßteZiffer = 0;
        long kleinsteZiffer = 10;
        long ziffer = 0;

        System.out.println("Bitte Zahl eingeben: ");
        long zahl = new java.util.Scanner(System.in).nextLong();

        if(zahl<0){
            zahl *= -1;
            }
        while (zahl>0){
            ziffer = zahl % 10;
            if(ziffer>groeßteZiffer){
                groeßteZiffer = ziffer;
            }
            if (ziffer<kleinsteZiffer) {
                kleinsteZiffer = ziffer;
            }
            zahl = zahl/10;

        }
        System.out.println("Größte Ziffer: " + groeßteZiffer);
        System.out.println("Kleinste Ziffer: " + kleinsteZiffer);

        }

    }
