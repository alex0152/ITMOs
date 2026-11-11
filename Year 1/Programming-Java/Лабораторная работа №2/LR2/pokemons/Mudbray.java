package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Mudbray extends Pokemon{
    public Mudbray(String name, int level) {
        super(name, level);
        setType(Type.GROUND);
        double HP = 70, ATTACK = 100, DEFENSE = 70, 
            SPECIAL_ATTACK = 45, SPECIAL_DEFENSE = 55, SPEED = 45;
        this.setStats(HP, ATTACK, DEFENSE, SPECIAL_ATTACK, 
            SPECIAL_DEFENSE, SPEED);
        this.setMove(new RockTomb(), new LowSweep(), new DoubleKick());
    }
}
