package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;
 
public final class Alomomola extends Pokemon{
    public Alomomola(String name, int level) {
        super(name, level);
        setType(Type.WATER);
        double HP = 165, ATTACK = 75, DEFENSE = 80, 
            SPECIAL_ATTACK = 40, SPECIAL_DEFENSE = 45, SPEED = 65;
        this.setStats(HP, ATTACK, DEFENSE, SPECIAL_ATTACK, 
            SPECIAL_DEFENSE, SPEED);
        this.setMove(new Psychic(), new AquaJet(), new PlayNice(), new HydroPump());
    }
}