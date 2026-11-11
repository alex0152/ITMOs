package moves;

import ru.ifmo.se.pokemon.*;
//	Confuses opponent, but raises its Special Attack.
public final class Flatter extends StatusMove {
    public Flatter() {
        int POWER = 0;
        double ACCURACY = 1.0;
        super(Type.DARK, POWER, ACCURACY);
    }
    
    @Override public void applyOppEffects(Pokemon p) {
        p.confuse();
        p.setMod(Stat.SPECIAL_ATTACK, 1);
    }

    @Override public String describe() {
        return "применяет статусную  атаку Flatter";
    }
}
