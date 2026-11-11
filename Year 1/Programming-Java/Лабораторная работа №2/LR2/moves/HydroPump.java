package moves;

import ru.ifmo.se.pokemon.*;
//Hydro Pump	Water	Special	110	80	5	
public final class HydroPump extends SpecialMove{
    public HydroPump() {
        int POWER = 110;
        double ACCURACY = 0.8;
        super(Type.WATER, POWER, ACCURACY);
    }

    @Override public String describe() {
        return "применяет специальную атаку Hydro Pump";
    }
}
