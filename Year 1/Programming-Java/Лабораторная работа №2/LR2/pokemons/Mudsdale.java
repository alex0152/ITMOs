package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public final class Mudsdale extends Mudbray{
    public Mudsdale(String name, int level) {
        super(name, level);
        this.setStats(hp: 100, att: 125, def: 100, spAtt: 55, spDef: 85, speed: 35);
        this.addMove(new FocusBlast());
    }
}
