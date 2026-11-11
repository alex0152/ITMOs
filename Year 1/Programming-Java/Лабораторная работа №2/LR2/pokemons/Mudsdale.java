package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public final class Mudsdale extends Mudbray{
    public Mudsdale(String name, int level) {
        super(name, level);
        double HP = 100, ATTACK = 125, DEFENSE = 100, 
            SPECIAL_ATTACK = 55, SPECIAL_DEFENSE = 85, SPEED = 35;
        this.setStats(HP, ATTACK, DEFENSE, SPECIAL_ATTACK, 
            SPECIAL_DEFENSE, SPEED);
        this.addMove(new FocusBlast());
    }
}
