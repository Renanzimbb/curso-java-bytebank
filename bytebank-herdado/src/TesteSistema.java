public class TesteSistema {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(222);

        Administrador admin = new Administrador();
        admin.setSenha(22);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);
        si.autentica(admin);
    }
}
