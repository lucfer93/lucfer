package ÜbungenJava;

public class EinWimpelImWindDurchGeschachtelteSchleife {

    public static void main(String[] args) {

        System.out.println("Wie viel Reihen soll der Wimpel haben?");
        int reihe = new java.util.Scanner(System.in).nextInt();

        for (int i = 1; i <= reihe; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(i);
                System.out.println();
            }
            System.out.println();


    }
}
