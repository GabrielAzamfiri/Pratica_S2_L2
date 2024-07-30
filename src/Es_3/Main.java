package Es_3;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> rubrica = new HashMap<>();
        Rubrica rubrica1 = new Rubrica(rubrica);

        rubrica1.addContatto("Gabriel", "3271936800");
        rubrica1.addContatto("Diego", "123456789");
        rubrica1.addContatto("Eddy", "987654321");
        System.out.println(rubrica1.getRubrica());

        rubrica1.deleteContatto("Gabriel");
        System.out.println(rubrica1.getRubrica());
        rubrica1.cercaNumero("123456789");

        rubrica1.cercaNome("Eddy");
    }


}
