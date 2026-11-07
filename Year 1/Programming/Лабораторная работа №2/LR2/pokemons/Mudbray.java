package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Mudbray extends Pokemon{
    public Mudbray(String name, int level) {
        super(name, level);
        setType(Type.GROUND);
        this.setStats(hp: 70, att: 100, def: 70, spAtt: 45, spDef: 55, speed: 45);
        this.setMove(new RockTomb(), new LowSweep(), new DoubleKick());
    }
}
