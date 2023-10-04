public class Returntype {
    static void parameter (String name,int age)
    {
        System.out.println(name+" "+"is"+" "+age+" "+"years old");
    }
    public static void main (String args [])
    {
        parameter ("ragul",21);
        parameter ("gokul",24);
        parameter ("kalai",25);
        System.out.println (Return(30));
    }
    static int Return (int age)
    {
        return  age;
    }
}
