import com.thoughtworks.xstream.XStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Gera {
//    public  XStream test = new XStream();
    public static void main (String[] args) throws IOException {
        Personas p = new Personas();
        Personas e= new Personas();
        XStream test = new XStream();

        String xml = test.toXML(p);
        System.out.println(xml);

            FileWriter fw = new FileWriter("Personas.txt");
            PrintWriter pw = new PrintWriter(fw);

            pw.println(xml);

            pw.close();


    }


}
