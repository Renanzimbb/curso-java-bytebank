public class GuardadorDeContas {
    
    private Conta [] referencias;
    private int posicaoLivre;

    public GuardadorDeContas() {
        this.referencias =  new Conta[10];
        this.posicaoLivre = 0;
    }

    public void adiciona(Conta cc) {
        this.referencias[posicaoLivre] = cc;
        this.posicaoLivre++;
    }

    public int getQuantidadeDeElementos() {
        return posicaoLivre;
    }

    public Conta getReferencia(int i) {
        return this.referencias[i];
    }

    public void remove(Conta cp) {
        
       
    }

    
}
