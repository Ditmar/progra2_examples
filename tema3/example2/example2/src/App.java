import java.util.ArrayList;
import java.util.function.Predicate;

import arrayextension.ArrayData;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayData<String, String> names = new ArrayData<String, String>();
        names.add("Pedro");
        names.add("Juan");
        names.add("Gary");
        names.add("Jesus");
        names.add("Mayumi");
        names.add("Leon");
        names.add("Bryan");
        names.add("Alejandra");
        ArrayData<String, String> result =  names.map(name -> {
            String newData = name + " grade " + Math.ceil((Math.random() * 100));
            return newData;
        });
        for (String item : result) {
            System.out.println(item);
        }
        ArrayData<String, String> results2 = names.filter(name -> {
             if (name.contains("Juan"))  {
                return true;
             }
             return false;
        });
        for (String item : results2) {
            System.out.println("-> " + item);
        }
    }
}
