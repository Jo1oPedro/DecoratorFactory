import java.lang.reflect.Constructor;

public abstract class ArmaduraFactory {

    public abstract PersonagemBuilder adicionaArmadura(String armadura) throws ClassNotFoundException;
    public IConteudoJogo adicionaArmadura(String armadura, IConteudoJogo personagem) throws ClassNotFoundException {
        Class<?> classe = null;
        Object objeto = null;

        try {
            classe = Class.forName(armadura);
            Constructor<?> constructor = classe.getConstructor(IConteudoJogo.class);
            objeto = constructor.newInstance(personagem);
            return (IConteudoJogo) objeto;
        } catch (Exception exception) {
            throw new IllegalArgumentException("Armadura invalida");
        }
    }

}
