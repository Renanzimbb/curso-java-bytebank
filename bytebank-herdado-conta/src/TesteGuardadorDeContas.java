public class TesteGuardadorDeContas {
    public static void main(String[] args) {
        
        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta cc = new ContaCorrente(22, 11);
        guardador.adiciona(cc);

        ContaPoupanca cp = new ContaPoupanca(33, 11);
        guardador.adiciona(cp);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = guardador.getReferencia(1);
        System.out.println(ref.getAgencia());
    }
}
