package moves;

import ru.ifmo.se.pokemon.*;
// Don't have effects	
public final class HydroPump extends SpecialMove {
    public HydroPump() {
        int POWER = 110;
        double ACCURACY = 0.8;
        super(Type.WATER, POWER, ACCURACY);
    }

    @Override public String describe() {
        return "применяет специальную атаку Hydro Pump";
    }
}
