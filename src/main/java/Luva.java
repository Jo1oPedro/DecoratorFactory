public class Luva extends SetDecorator {

    public Luva(IConteudoJogo conteudoJogo) {
        super(conteudoJogo);
    }

    @Override
    protected Float getPontuacaoArmaduraComponente() {
        return 5f;
    }

    @Override
    protected String getNomeArmadura() {
        return "luva";
    }
}
