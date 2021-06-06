package ÜbungenJava;

public class Line3 {

    public static void line(int len, char c) {

        while (len-- > 0)
            System.out.print(c);
    }

    public static void line(int len) {

        line(len, '-');
    }

    public static void line(String prefix, int len, char c, String suffix) {
        System.out.print(prefix);
        line(len, '=');
        System.out.print(suffix);
    }

    public static void line(int len, String s) {
         int reststring = len % s.length();

         for(int i = len; s.length()<=len; len-=s.length() )
             System.out.print(s);

         if(reststring>0) {
             for(int j = reststring; reststring==1; reststring--)
             System.out.print(s.charAt(0));
             for(int j = reststring, k = 0; reststring>0; reststring--, k++ )
                 System.out.print(s.charAt(k));
         }
    }
}

