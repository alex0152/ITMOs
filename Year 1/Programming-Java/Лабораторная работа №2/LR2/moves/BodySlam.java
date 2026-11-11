package moves;

import ru.ifmo.se.pokemon.*;
//	May paralyze opponent.
public final class BodySlam extends PhisycalMove  {
    public BodySlam() {
        int POWER = 85;
        double ACCURACY = 1.0;
        super(Type.NORMAL, POWER, ACCURACY);
    }

    @Override public void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.3) {
            Effect.paralyze(p);
        }
    }
    
    @Override public String describe() {
        return "применяет физическую атаку Body Slam";
    }
}
