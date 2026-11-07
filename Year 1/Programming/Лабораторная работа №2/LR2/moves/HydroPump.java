package moves;

import ru.ifmo.se.pokemon.*;
//Hydro Pump	Water	Special	110	80	5	
public final class HydroPump extends SpecialMove{
    public HydroPump() {
        super(Type.WATER, 110, 0.8);
    }

    @Override public String describe() {
        return "применяет специальную атаку Hydro Pump";
    }
}
