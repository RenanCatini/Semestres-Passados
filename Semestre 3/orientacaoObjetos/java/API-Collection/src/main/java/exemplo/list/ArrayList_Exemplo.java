package exemplo.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Exemplo {
    public static void main(String[] args) {
        String brasil = "Brasil";
        String mexico = "México";
        String argentina = "Argentina";

        List<String> paises = new ArrayList<>();

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
