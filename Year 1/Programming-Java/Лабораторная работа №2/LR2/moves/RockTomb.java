package moves;

import ru.ifmo.se.pokemon.*;
//	Lowers opponent's Speed.
public final class RockTomb extends PhysicalMove{
    public RockTomb() {
        super(Type.ROCK, 60, 0.95);
    }

    @Override public void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPEED, -1);
    }

    @Override public String describe() {
        return "применяет физическую атаку Rock Tomb";
    }
}
