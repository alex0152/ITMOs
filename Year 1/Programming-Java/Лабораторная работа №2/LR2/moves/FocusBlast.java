package moves;

import ru.ifmo.se.pokemon.*;
//	May lower opponent's Special Defense.
public final class FocusBlast extends SpecialMove {
    public FocusBlast() {
        int POWER = 120;
        double ACCURACY = 0.7;
        super(Type.FIGHTING, POWER, ACCURACY);
    }

    @Override public void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.1) {
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }

    @Override public String describe() {
        return "применяет специальную атаку Focus Blast";
    }
}
