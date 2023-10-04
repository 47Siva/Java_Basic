public class rcursion {
    static int fact(int f)
    {
        if (f == 0)
            return 1;
        return f*fact(f-1);
    }
    static int add (int s)
    {
        if (s == 0)
            return 0;
        else
            System.out.print(s);
        return s + add(s-1);
    }
    public static void main (String args [])
    {
        System.out.println ("the Factorialuuu :"+fact(5));
        System.out.println("The add number :"+add(4));
    }
}