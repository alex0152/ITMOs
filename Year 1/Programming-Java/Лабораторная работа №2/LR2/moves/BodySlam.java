package moves;

import ru.ifmo.se.pokemon.*;
//Body Slam	Normal	Physical	85	100	15	May paralyze opponent.
public final class BodySlam extends PhisycalMove  {
    public BodySlam() {
        super(Type.NORMAL, 85, 1.0);
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
