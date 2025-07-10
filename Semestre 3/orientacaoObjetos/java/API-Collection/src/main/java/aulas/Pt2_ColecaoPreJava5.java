package aulas;

import java.util.ArrayList;
import java.util.Iterator;

public class Pt2_ColecaoPreJava5 {
    public static void main(String[] args) {
        String[] paises = {"Brasil", "México", "Argentina"};
        ArrayList<String> lista = new ArrayList();

        lista.add(paises[0]);
        lista.add(paises[1]);
        lista.add(paises[2]);

        // Desloca o item que estava no lugar para frente
        lista.add(2,"Chile");

        for(int j = 0; j < lista.size(); j++) {
            System.out.println(lista.get(j));
        }

        System.out.println("");

        Iterator i = lista.iterator();  // Iterator unidirecional
        while(i.hasNext()) {
            if(i.next().equals("Chile")) {
                i.remove();
            }
        }
    }
}
