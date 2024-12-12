import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteArrayListEquals {
    public static void main(String[] args) {
        List<Conta> lista = new LinkedList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(22, 22);
        //lista.add(cc3);

        boolean existe = lista.contains(cc3);
        System.out.println("Já existe ? " + existe);

        for(Conta conta : lista){
            if(conta == cc3){
                System.out.println("Já tenho essa conta!");
            }
        }
        for(Object oRef : lista){
            System.err.println(oRef);
        }


    }
}