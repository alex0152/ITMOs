package moves;

import ru.ifmo.se.pokemon.*;
//	Confuses opponent, but raises its Special Attack.
public final class Flatter extends StatusMove{
    public Flatter() {
        super(Type.DARK, 0, 1.0);
    }
    
    @Override public void applyOppEffects(Pokemon p) {
        p.confuse();
        p.setMod(Stat.SPECIAL_ATTACK, 1);
    }

    @Override public String describe() {
        return "применяет статусную  атаку Flatter";
    }
}
