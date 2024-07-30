package Es_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero!");
        int numUtente = Integer.parseInt(scanner.nextLine());

        Set<String> parolaSet = new HashSet<>();
        ArrayList<String> duplicatiList = new ArrayList<>();
        for (int i = 0; i < numUtente; i++) {
            System.out.println("Inserisci una parola!");
            String parola = scanner.nextLine();
            if (parolaSet.contains(parola)) {
                System.out.println("Parola gia inserita nella lista!");
                duplicatiList.add(parola);
              
            } else {
                parolaSet.add(parola);
                System.out.println(parolaSet);

            }

        }
        System.out.println("array distinti: " + parolaSet);
        System.out.println("numero parole array distinti: " + parolaSet.size());

        System.out.println("array duplicati: " + duplicatiList);

    }
}