package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public final class Nidoqueen extends Nidorina{
    public Nidoqueen(String name, int level) {
        super(name, level);
        this.addType(Type.GROUND);
        this.setStats(90, 92, 87, 75, 85, 76);
        this.addMove(new BodySlam());
    }
}
