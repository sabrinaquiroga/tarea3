package jsont;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        JSONObject persona1 = new JSONObject();
        persona1.put("Nombre", "Silvana");
        persona1.put("Apellido", "Quiroga");
        persona1.put("edad", "15");
        persona1.put("Direccion", "Achumani");

        JSONObject persona2 = new JSONObject();
        persona2.put("Nombre", "Erika");
        persona2.put("Apellido", "Sotelo");
        persona2.put("edad", "20");
        persona2.put("Direccion", "Los pinos");

        JSONArray aA = new JSONArray();
        aA.add(persona2);
        aA.add(persona2);

        JSONObject ejemplo = new JSONObject ();
        ejemplo.put("ejemplo", aA);
        System.out.println(ejemplo);
        FileWriter fw = new FileWriter("PersonasJson.txt");
        PrintWriter pw = new PrintWriter(fw);

        pw.println(ejemplo);

        pw.close();


    }

}
