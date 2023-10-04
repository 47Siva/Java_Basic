public class Methodsifelse {
    public static void main (String args [])
    {
        mymethod(21,"ragul");
    }

    static void  mymethod (int age,String Name)
    {
        if (age < 20)
        {
            System.out.println (Name+" "+"your not able to maride");
        }
        else
            System.out.println (Name+" "+ "your able to maride");
//        return mymethod(21,"ragul");
    }
}
