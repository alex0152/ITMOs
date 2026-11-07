package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Nidorina extends NidoranF{
    public Nidorina(String name, int level) {
        super(name, level);
        this.setStats(70, 62, 67, 55, 55, 56);
        this.addMove(new Flatter());
    }
}
