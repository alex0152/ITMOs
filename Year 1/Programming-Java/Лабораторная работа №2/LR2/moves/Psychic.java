package moves;

import ru.ifmo.se.pokemon.*;
//	May lower opponent's Special Defense.
public final class Psychic extends SpecialMove{
    public Psychic() {
        int POWER = 90;
        double ACCURACY = 1.0;
        super(Type.PSYCHIC, POWER, ACCURACY);
    }

    @Override public void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.1) {
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }
    
    @Override public String describe() {
        return "применяет специальную атаку Psychic";
    }
}
