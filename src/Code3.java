import java.util.ArrayList;

public class Code3 {
    public static void main(String[] args) {

        // Generic type method
        ArrayList<Integer> AL =  new ArrayList<Integer> ();   // Explicitly we are assigning ONly Non_primitive
        // the Job of Generic is aLlow only integers here

        /*AL.add (31);
        AL.add ("Murali akon");
        AL.add (32.24);
        AL.add ('M');
        System.out.println (AL);*/
        AL.add (32);
        AL.add (23);
        AL.add (42);
        AL.add (43);

        for(Integer I:AL)
        {
            System.out.println (I);
        }



    }
}
