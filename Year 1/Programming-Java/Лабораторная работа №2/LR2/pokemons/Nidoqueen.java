package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public final class Nidoqueen extends Nidorina{
    public Nidoqueen(String name, int level) {
        super(name, level);
        this.addType(Type.GROUND);
        double HP = 90, ATTACK = 92, DEFENSE = 87, 
            SPECIAL_ATTACK = 75, SPECIAL_DEFENSE = 85, SPEED = 76;
        this.setStats(HP, ATTACK, DEFENSE, SPECIAL_ATTACK, 
            SPECIAL_DEFENSE, SPEED);
        this.addMove(new BodySlam());
    }
}
