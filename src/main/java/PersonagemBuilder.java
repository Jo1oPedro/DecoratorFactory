import Exceptions.PersonagemIncompletoException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonagemBuilder extends ArmaduraFactory {

    protected IConteudoJogo personagem = null;
    public PersonagemBuilder() {
        this.personagem = new Personagem();
    }

    public IConteudoJogo build() throws PersonagemIncompletoException {
        String regex = "(?=.*\\bcapacete\\b)(?=.*\\bpeitoral\\b)(?=.*\\bluva\\b)";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(this.personagem.getNomeSet());

        if(matcher.find()) {
            return this.personagem;
        }

        throw new PersonagemIncompletoException();
    }

    @Override
    public PersonagemBuilder adicionaArmadura(String armadura) throws ClassNotFoundException {
        this.personagem = super.adicionaArmadura(armadura, this.personagem);
        return this;
    }
}
