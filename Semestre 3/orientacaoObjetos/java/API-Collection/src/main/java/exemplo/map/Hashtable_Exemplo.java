package exemplo.map;

import java.util.*;

public class Hashtable_Exemplo {
    public static void main(String[] args) {
        String[] chaves = {"zero", "um", "dois", "tres", "quatro", "cinco"};

        Map<String, Integer> mapa = new Hashtable<>();

        for(int i = 0; i < chaves.length; i++) {
            mapa.put(chaves[i], i); // Adicionando no mapa
        }

        Integer i1 = mapa.get("two");
        System.out.println("Valor da chave do número dois: " + i1);

        // Retorna todas as chaves
        Set<String> set = mapa.keySet();

        // Usar todas as chaves para poder iterar entre elas
        Iterator<String> i = set.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println();

        // Mapeia todas as chaves e valores associados, para String
        System.out.println("Mapeando: " + mapa.toString());
    }
}
