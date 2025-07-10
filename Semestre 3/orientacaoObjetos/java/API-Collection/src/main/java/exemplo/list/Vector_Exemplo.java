package exemplo.list;

import java.util.Iterator;
import java.util.Vector;

// Não usar vector pois é LENTO
public class Vector_Exemplo {

    public static void main(String[] args) {
        String brasil = "Brasil";
        String mexico = "México";
        String argentina = "Argentina";

        Vector<String> paises = new Vector<>();

        paises.add(brasil);
        paises.add(mexico);
        paises.add(argentina);
        paises.add(2,"Chile");

        System.out.println("Países originais:");
        for(String p : paises) {
            System.out.println(p);
        }

        System.out.println("");

        Iterator<String> i = paises.iterator();
        while (i.hasNext()) {
            if(i.next().equals("Chile")) {
                i.remove();
            }
        }

        System.out.println("Países após a remoção:");
        for(String p : paises) {
            System.out.println(p);
        }

    }
}
