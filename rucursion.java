public class rucursion
{
    static int sum (int n)
    {
        if (n == 10)
            return 10;
        else
            System.out.println(n);
        return sum(n+1);
    }
    public static void main (String args [])
    {
        System.out.println(sum(1));
    }
}
