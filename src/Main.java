import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        ArrayList al  = new ArrayList ();
        al.add(31);
        al.add (32);
        LinkedList ll = new LinkedList (al);

        ll.add (42);
        ll.add ("Linkedlist");

        Vector vv = new Vector (ll);

        vv.add (32);
        vv.add ("murali");

        System.out.println (vv);

    }



}