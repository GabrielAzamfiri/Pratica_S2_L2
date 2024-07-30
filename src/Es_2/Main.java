package Es_2;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {


    public static void main(String[] args) {
        System.out.println("Metodo 1 listaN;");
        listaN(10);
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        System.out.println("Metodo 2 listaNNlista;");

        System.out.println(listaNNlista(lista));

        stampaPariDispari(lista, true);
    }

    public static void listaN(int N) {

        TreeSet<Integer> numeriCasuali = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            int numeroRandom = (int) Math.round(Math.random() * 100);
            numeriCasuali.add(numeroRandom);
        }
        System.out.println(numeriCasuali);
    }

    public static List<Integer> listaNNlista(List<Integer> lista) {

        List<Integer> reverseLista = new ArrayList<>();
        reverseLista = lista.reversed();

        List<Integer> newLista = new ArrayList<>();
        newLista.addAll(lista);

        newLista.addAll(reverseLista);

        return newLista;

    }

    public static void stampaPariDispari(List<Integer> lista, boolean scelta) {
        
        if (scelta) {
            System.out.println("Posizioni pari");

            for (int i = 0; i < lista.size(); i = i + 2) {
                System.out.println(lista.get(i));
            }
        } else {
            System.out.println("Posizioni dispari");

            for (int i = 1; i < lista.size(); i = i + 2) {
                System.out.println(lista.get(i));
            }
        }
    }

}
