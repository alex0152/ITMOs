package moves;

import ru.ifmo.se.pokemon.*;
//	Hits twice in one turn.
public final class DoubleKick extends PhysicalMove {
    public DoubleKick() {
        int POWER = 30, PRIORITY = 0, HITS = 2;
        double ACCURACY = 1.0;
        super(Type.FIGHTING, POWER, ACCURACY, PRIORITY, HITS);
    }

    @Override public String describe() {
        return "применяет физическую атаку Double Kick";
    }
}
