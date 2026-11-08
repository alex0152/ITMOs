package moves;

import ru.ifmo.se.pokemon.*;
//	Lowers opponent's Speed.
public final class LowSweep extends PhysicalMove{
    public LowSweep() {
        super(Type.FIGHTING, 65, 1.0);
    }

    @Override public void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPEED, -1);
    }

    @Override public String describe() {
        return "применяет физическую атаку Low Sweep";
    }
}
