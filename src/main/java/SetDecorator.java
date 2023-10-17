public abstract class SetDecorator implements IConteudoJogo {

    IConteudoJogo conteudoJogo = null;

    public SetDecorator(IConteudoJogo conteudoJogo) {
        this.conteudoJogo = conteudoJogo;
    }
    @Override
    public Float getPontuacaoArmadura() {
        return this.conteudoJogo.getPontuacaoArmadura() + this.getPontuacaoArmaduraComponente();
    }

    protected abstract Float getPontuacaoArmaduraComponente();
    @Override
    public String getNomeSet() {
        return this.conteudoJogo.getNomeSet() + " / " + this.getNomeArmadura();
    }

    protected abstract String getNomeArmadura();
}
