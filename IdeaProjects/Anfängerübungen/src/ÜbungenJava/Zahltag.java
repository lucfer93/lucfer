package ÜbungenJava;

public class Zahltag {

    public static void main(String[]args){

        System.out.println("Wie viel wurde zurückgezahlt?");
        double payback = new java.util.Scanner(System.in).nextDouble();
        double schulden = 1000;
        double nochok = schulden*0.9;
        double supi = schulden*1.2;

        if(payback>=nochok && payback<=supi){
            System.out.println("Good Boy!");
        }else{
            System.out.println("You Son of a Bitch! \u2620");
        }
    }
}
