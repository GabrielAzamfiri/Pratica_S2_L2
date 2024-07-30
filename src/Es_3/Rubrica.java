package Es_3;

import java.util.HashMap;
import java.util.Set;

public class Rubrica {
    private HashMap<String, String> rubrica;

    public Rubrica(HashMap<String, String> rubrica) {
        this.rubrica = rubrica;
    }

    public void addContatto(String Nome, String Numero) {
        this.rubrica.put(Nome, Numero);
    }

    public void deleteContatto(String nome) {
        this.rubrica.remove(nome);
    }

    public void cercaNumero(String numero) {
//Collection<String> valori = this.rubrica.values();
        // System.out.println(valori);

        Set<String> chiaviRubrica = this.rubrica.keySet();
        for (String chiave : chiaviRubrica) {

            if (this.rubrica.get(chiave) == numero) {
                System.out.println("Chiave: " + chiave);
                System.out.println("Valore: " + this.rubrica.get(chiave));
            }
        }
    }

    public void cercaNome(String nome) {

        System.out.println(this.rubrica.get(nome));

    }


    public HashMap<String, String> getRubrica() {
        return rubrica;
    }
}
