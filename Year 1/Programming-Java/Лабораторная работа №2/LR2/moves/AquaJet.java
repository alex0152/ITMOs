package moves;

import ru.ifmo.se.pokemon.*;
//	User attacks first.	
public final class AquaJet extends PhysicalMove{
    public AquaJet() {
        int POWER = 40, PRIORITY = 1, HITS = 1;
        double ACCURACY = 1.0;
        super(Type.WATER, POWER, ACCURACY, PRIORITY, HITS);
    }

    @Override public String describe() {
        return "применяет физическую атаку Aqua Jet";
    }
}
