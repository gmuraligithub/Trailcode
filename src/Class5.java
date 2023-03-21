import java.util.ArrayList;

public class Class5 {

    public static void main(String[] args) {
        Class4 call = new Class4 (32,"Murali");
        Class4 c1 = new Class4 (32,"Winter");
        Class4 c2 = new Class4 (32,"Winter");

        ArrayList<Class4> H1  = new ArrayList<Class4> ();
        H1.add (call);
        H1.add (c1);
        H1.add (c2);

        for(Class4 obj :H1)
        {

            System.out.print (obj.age);
            System.out.print (obj.name);

        }




    }
}
