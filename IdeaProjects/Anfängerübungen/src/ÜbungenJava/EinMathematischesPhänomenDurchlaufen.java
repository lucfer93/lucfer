package ÜbungenJava;

public class EinMathematischesPhänomenDurchlaufen {

    public static void main(String[]args){

        double t = Math.random()*10;

        while(t>0){
            System.out.println(t);
            if(t>=1){
                t=t-1;      //Warum funktioniert es nicht mit 't=t--' ?
            }else if(t<1)
            t=t*2;          //Warum funktioniert es nicht mit 't*=2'  ?
        }


    }

}
