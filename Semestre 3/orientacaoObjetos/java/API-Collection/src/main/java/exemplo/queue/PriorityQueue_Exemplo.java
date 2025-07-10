package exemplo.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_Exemplo {
    public static void main(String[] args) {
        int[] elementos = {1,5,3,2,4,7,8,9,6};
        Queue<Integer> queue = new PriorityQueue<>();

        // Adicionar cada elemento da lista dentro da fila
        for(int i: elementos)
            queue.offer(i); // Adicionar

        for(int i = 0; i < elementos.length; i++) {
            System.out.println(queue.poll() + " "); // Retirando elemento por elemento de dentro da fila
        }

        for(int i : elementos)
            queue.offer(i);

        System.out.println();
        System.out.println("Mostrando o elemento de maior prioridade: " + queue.peek());
        System.out.println("Verificando a diferença entre o peek() e o poll()");
        System.out.println("Tamanho da fila antes do peek(): " + queue.size());

        queue.peek();

        System.out.println("Tamanho da fila depois do peek(): " + queue.size());
        System.out.println("Tamanho da fila antes de poll(): " + queue.size());

        queue.poll();

        System.out.println("Tamanho da fila depois do poll(): " + queue.size());
    }
}
