public class TesteArrayDeReferencias{
    public static void main(String[] args) {

        Object [] referencias = new Object[5];
        ContaCorrente cc1 = new ContaCorrente(22, 11);
        referencias[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22, 11);
        referencias[1] = cc2;

        Cliente cliente = new Cliente();
        referencias[2] = cliente;

        System.out.println(cc2.getNumero());
        System.out.println(((Conta) referencias[1]).getNumero());

        ContaPoupanca ref = (ContaPoupanca) referencias[1];
        System.out.println(ref.getNumero());
    }

}