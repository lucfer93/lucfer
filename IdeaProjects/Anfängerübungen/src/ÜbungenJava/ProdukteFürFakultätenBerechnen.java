package ÜbungenJava;

public class ProdukteFürFakultätenBerechnen {

    public static void main(String[]args) {


        System.out.println("Bitte zu errechnende Fakultät eingeben");
        long Faku = new java.util.Scanner(System.in).nextLong();

        if(Faku==0){
            System.out.println(" 0! = 1");
        }else if(Faku<0){
            System.out.println("Fakultät darf nicht negativ sein!");
        }else if(Faku==1) {
            System.out.println(" 1! = 1");
        } else{
            int ergebnis = 1;
            System.out.print( "!" + Faku + " = 1 *  \b");
            for(long i=2; i<=Faku;i++){
                ergebnis*=i;
                System.out.print(i + " *  \b");
            }
            System.out.println("= " + ergebnis);
        }

































        /*System.out.println( "Enter a number:" );
        int n = new java.util.Scanner( System.in ).nextInt();

        if ( n < 0 )
            System.err.println( "Number must not be negative" );
        else if ( n < 2 )
            System.out.printf( "%d! = 1%n", n );
        else {
            System.out.printf( "%d! = 1", n );
            long factorial = 1;

            for ( int multiplier = 2; multiplier <= n; multiplier++ ) {
                System.out.printf( " * %d", multiplier );
                factorial *= multiplier;
            }

            System.out.printf( " = %d%n", factorial );
        }*/

       }

    }




