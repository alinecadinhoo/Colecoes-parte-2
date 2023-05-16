import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class parte1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite nomes separados por , ");
        String nomes = sc.next();
        String [] vetorNomes = nomes.split(",");

        Queue<String> lista = new PriorityQueue<>();

        for (int i =0; i < vetorNomes.length; i++) {
            lista.add(vetorNomes[i]);
        }

        System.out.println("Lista de nomes ordenadas");
        while (lista.size() != 0) {
            System.out.println(lista.remove());
        }

    }
}
