package moves;

import ru.ifmo.se.pokemon.*;
//Facade	Normal	Physical	70	100	20	Power doubles if user is burned, poisoned, or paralyzed.
public final class Facade extends PhisycalMove {
    public Facade() {
        super(Type.NORMAL, 70, 1.0);
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
