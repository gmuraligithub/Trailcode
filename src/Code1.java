import java.util.ArrayList;

public class Code1
 {
     public static void main(String[] args) {

         ArrayList A =  new ArrayList ();

         A.add (21);
         A.add ("Murali");
         A.add (32.23);

         System.out.println (A);
         for(Object Obj :A)
         {
             System.out.println (Obj);
         }
     }
 }