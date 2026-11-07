package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class NidoranF extends Pokemon{
    public NidoranF(String name, int level) {
        super(name, level);
        setType(Type.POISON);
        this.setStats(hp: 55, att: 47, def: 52, spAtt: 40, spDef: 40, speed: 41);
        this.setMove(new Facade(), new PoisonJab());
    }
}
