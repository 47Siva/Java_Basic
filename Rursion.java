import java.util.Scanner;

public class Rursion {
    static int fibnace(int n)
    {
       if (n == 0)
           return 1;
       else
           return  + fibnace(n-1);
    }
    public static void main (String args [])
    {
        System.out.println(fibnace(10));
    }
}
