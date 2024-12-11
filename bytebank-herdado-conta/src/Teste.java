import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        System.out.println(lista.size());
        Conta ref = (Conta) lista.get(0);
        System.out.println(ref);

        // for (int i = 0; i < lista.size(); i++){
        //     Object oRef = lista.get(i);
        //     System.out.println(oRef);
        // }

        for(Object oRef : lista){
            System.err.println(oRef);
        }
    }
}