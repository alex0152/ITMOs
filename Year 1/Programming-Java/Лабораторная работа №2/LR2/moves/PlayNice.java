package moves;

import ru.ifmo.se.pokemon.*;
//Play Nice	Normal	Status	—	—	20	Lowers opponent's Attack. Always hits.
public final class PlayNice extends StatusMove{
    public PlayNice() {
        super(Type.NORMAL, 0, 0);
    }

    @Override public void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, -1);
        this.hits = 1;
    }

    @Override public String describe() {
        return "применяет статусную атаку Play Nice";
    }
}
