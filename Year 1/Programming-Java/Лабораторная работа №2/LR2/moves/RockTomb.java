package moves;

import ru.ifmo.se.pokemon.*;
//	Lowers opponent's Speed.
public final class RockTomb extends PhysicalMove{
    public RockTomb() {
        int POWER = 60;
        double ACCURACY = 0.95;
        super(Type.ROCK, POWER, ACCURACY);
    }

    @Override public void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPEED, -1);
    }

    @Override public String describe() {
        return "применяет физическую атаку Rock Tomb";
    }
}
