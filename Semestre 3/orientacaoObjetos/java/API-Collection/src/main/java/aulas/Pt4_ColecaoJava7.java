package aulas;

import java.util.ArrayList;

public class Pt4_ColecaoJava7 {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(3);
        lista.add(6);
        lista.add(1);

        Integer elemento = lista.get(1);
        int resultado = elemento.intValue();
        System.out.println("Elemento da posição 1: " + resultado);


    }
}
