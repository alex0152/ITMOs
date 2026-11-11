package moves;

import ru.ifmo.se.pokemon.*;
//	Lowers opponent's Speed.
public final class LowSweep extends PhysicalMove{
    public LowSweep() {
        int POWER = 65;
        double ACCURACY = 1.0;
        super(Type.FIGHTING, POWER, ACCURACY);
    }

    @Override public void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPEED, -1);
    }

    @Override public String describe() {
        return "применяет физическую атаку Low Sweep";
    }
}
