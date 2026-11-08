package moves;

import ru.ifmo.se.pokemon.*;
//	Hits twice in one turn.
public final class DoubleKick extends PhysicalMove{
    public DoubleKick() {
        super(Type.FIGHTING, 30, 1.0, 0, 2);
    }

    @Override public String describe() {
        return "применяет физическую атаку Double Kick";
    }
}
