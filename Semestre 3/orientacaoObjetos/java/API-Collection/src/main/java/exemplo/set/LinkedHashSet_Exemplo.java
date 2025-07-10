package exemplo.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*
    - Perde um pouco da performace
    - Garante a ordem de iteração
 */

public class LinkedHashSet_Exemplo {
    public static void main(String[] args) {
        String brasil = "Brasil";
        String mexico = "México";
        String argentina = "Argentina";

        Set<String> paises = new LinkedHashSet<>();

        paises.add(brasil);
        paises.add(brasil); // So vai escrever 1 vez porque ele não permite elementos repetidos
        paises.add(mexico);
        paises.add(argentina);
        paises.add("Chile");

        System.out.println("Países originais:");
        Iterator<String> i = paises.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println();

        Iterator<String> i2 = paises.iterator();
        while(i2.hasNext()) {
            if(i2.next() == "Chile") {
                i2.remove();
            }
        }

        System.out.println("Países após a remoção:");
        Iterator<String> i3 = paises.iterator();
        while(i3.hasNext()) {
            System.out.println(i3.next());
        }
    }
}
