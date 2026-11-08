package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;
 
public final class Alomomola extends Pokemon{
    public Alomomola(String name, int level) {
        super(name, level);
        setType(Type.WATER);
        this.setStats(hp: 165, att: 75, def: 80, spAtt: 40, spDef: 45, speed: 65);
        this.setMove(new Psychic(), new AquaJet(), new PlayNice(), new HydroPump());
    }
}