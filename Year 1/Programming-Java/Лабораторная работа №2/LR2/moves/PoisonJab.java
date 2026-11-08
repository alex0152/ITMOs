package moves;

import ru.ifmo.se.pokemon.*;
//	May poison the opponent.
public final class PoisonJab extends PhysicalMove{
    public PoisonJab() {
        super(Type.POISON, 80, 1.0);
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
