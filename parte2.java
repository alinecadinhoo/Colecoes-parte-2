import java.util.*;

public class parte2 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Thiago-M", "Joyce-F", "Lucas-M", "Maria-F");
        Collections.sort(nomes);

        List<String> nomesMasculinos = new ArrayList<>();
        List<String> nomesFemininos = new ArrayList<>();

        for (String nome : nomes) {
            String[] partes = nome.split("-");
            if (partes[1].equals("M")) {
                nomesMasculinos.add(partes[0]);
            } else {
                nomesFemininos.add(partes[0]);
            }
        }

        System.out.println("Nomes masculinos:");
        for (String nome : nomesMasculinos) {
            System.out.println(nome);
        }

        System.out.println("Nomes femininos:");
        for (String nome : nomesFemininos) {
            System.out.println(nome);
        }
    }
}