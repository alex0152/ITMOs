package moves;

import ru.ifmo.se.pokemon.*;
//	May lower opponent's Special Defense.
public final class FocusBlast extends SpecialMove{
    public FocusBlast() {
        super(Type.FIGHTING, 120, 0.7);
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
