package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class NidoranF extends Pokemon{
    public NidoranF(String name, int level) {
        super(name, level);
        setType(Type.POISON);
        double HP = 55, ATTACK = 47, DEFENSE = 52, 
            SPECIAL_ATTACK = 40, SPECIAL_DEFENSE = 40, SPEED = 41;
        this.setStats(HP, ATTACK, DEFENSE, SPECIAL_ATTACK, 
            SPECIAL_DEFENSE, SPEED);
        this.setMove(new Facade(), new PoisonJab());
    }
}
