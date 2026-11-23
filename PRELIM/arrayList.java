
package PRELIM;
import java.util.ArrayList;

public class arrayList {
    public static void main (String[]args){
        
        ArrayList<String> names = new ArrayList<>();
        
        names.add("Ahreda");
        names.add("Akira");
        names.add("Jamaica");
        names.add("MJ");
        names.add("Monmon");
        
        names.set(0, "siya");
        
        
        System.out.println(names.contains("mga idol pa kiss daw ang taga B si letchejan mwamwaaa ka sakin ana sya si kokie ni"));
        
        
        
          // System.out.println(names.getFirst());
           
           for(int i = 2; i<names.size(); i++){
               System.out.println(names.get(i)+ " ");
           }
    }
}
