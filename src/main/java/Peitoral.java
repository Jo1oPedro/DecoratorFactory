public class Peitoral extends SetDecorator {
    public Peitoral(IConteudoJogo conteudoJogo) {
        super(conteudoJogo);
    }

    @Override
    protected Float getPontuacaoArmaduraComponente() {
        return 15f;
    }

    @Override
    protected String getNomeArmadura() {
        return "peitoral";
    }
}
