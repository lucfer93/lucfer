package ÜbungenJava;

public class FischigeStickmotiveZeichnen {

    public static void main(String[]args){

        int repetitions = new java.util.Scanner(System.in).nextInt();

        for(int i = 1; i<=repetitions; i++) {
            for (int k = 1; k <= (repetitions); k++)
                System.out.print("><> ");
            for (int j = 1; j <= (repetitions); j++)
                System.out.print("<>< ");

            System.out.println();
        }

    }


}