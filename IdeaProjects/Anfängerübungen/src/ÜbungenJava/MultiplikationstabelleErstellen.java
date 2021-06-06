package ÜbungenJava;

public class MultiplikationstabelleErstellen {

    public static void main(String[]args){

        System.out.println("<html>");
        System.out.println("<table>");
        System.out.println("<tr><th>Quantity</th><th>Flamethrower</th><th>Fire extinguisher</th></tr>");
        reihe();
        System.out.println("<table>");
        System.out.println("<html>");

    }


    public static void reihe (){

        for(int i=1; i<=10; i++){
            System.out.println("<tr><td>"+i+"</td><td>"+(i*500)+"</td><td>"+(i*100)+"</td></tr");
        }

    }



}
