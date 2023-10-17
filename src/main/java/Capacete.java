public class Capacete extends SetDecorator {

    public Capacete(IConteudoJogo conteudoJogo) {
        super(conteudoJogo);
    }

    @Override
    protected Float getPontuacaoArmaduraComponente() {
        return 10f;
    }

    @Override
    protected String getNomeArmadura() {
        return "capacete";
    }
}
