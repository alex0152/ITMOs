package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Nidorina extends NidoranF{
    public Nidorina(String name, int level) {
        super(name, level);
        double HP = 70, ATTACK = 62, DEFENSE = 67, 
            SPECIAL_ATTACK = 55, SPECIAL_DEFENSE = 55, SPEED = 56;
        this.setStats(HP, ATTACK, DEFENSE, SPECIAL_ATTACK, 
            SPECIAL_DEFENSE, SPEED);
        this.addMove(new Flatter());
    }
}
