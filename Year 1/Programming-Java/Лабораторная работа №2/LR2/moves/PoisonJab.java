package moves;

import ru.ifmo.se.pokemon.*;
//	May poison the opponent.
public final class PoisonJab extends PhysicalMove {
    public PoisonJab() {
        int POWER = 80;
        double ACCURACY = 1.0;
        super(Type.POISON, POWER, ACCURACY);
    }

    @Override public void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.3) {
            Effect.poison(p);
        }
    }

    @Override public String describe() {
        return "применяет физическую атаку Poison Jab";
    }
}
