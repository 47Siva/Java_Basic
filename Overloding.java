public class Overloding {
    static int Overlod (int a , int b)
    {
        return(a+b);
    }
    static char Overlod (char x,char y )
    {
        return x>y?x:y;
    }
    public static void main (String args [])
    {
        System.out.println(Overlod(5,10));
        System.out.println(Overlod ('p','a'));
    }
}
