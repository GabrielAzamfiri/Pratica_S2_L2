package Es_3;

import java.util.Collection;
import java.util.HashMap;

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
        Collection<String> valori = this.rubrica.values();
        System.out.println(valori);
        //System.out.println(this.rubrica.get(numero));

    }

    public void cercaNome(String nome) {

        System.out.println(this.rubrica.get(nome));

    }


    public HashMap<String, String> getRubrica() {
        return rubrica;
    }
}
