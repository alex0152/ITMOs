package moves;

import ru.ifmo.se.pokemon.*;
//	Lowers opponent's Attack. Always hits.
public final class PlayNice extends StatusMove{
    public PlayNice() {
        int POWER = 0;
        double ACCURACY = 0;
        super(Type.NORMAL, POWER, ACCURACY);
    }

    @Override public void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, -1);
        this.hits = 1;
    }

    @Override public String describe() {
        return "применяет статусную атаку Play Nice";
    }
}
