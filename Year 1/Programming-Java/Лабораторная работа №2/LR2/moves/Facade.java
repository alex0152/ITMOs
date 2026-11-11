package moves;

import ru.ifmo.se.pokemon.*;
//	Power doubles if user is burned, poisoned, or paralyzed.
public final class Facade extends PhysicalMove {
    public Facade() {
        int POWER = 70;
        double ACCURACY = 1.0;
        super(Type.NORMAL, POWER, ACCURACY);
    }

    @Override public void applySelfEffects(Pokemon p) {
        this.power = 70;
        var currentStatus = p.getCondition();
        if (currentStatus == Status.BURN || 
            currentStatus == Status.POISON || 
            currentStatus == Status.PARALYZE) {
            this.power *= 2;
        }
    }

    @Override public String describe() {
        return "применяет физическую атаку Facade";
    }
}
