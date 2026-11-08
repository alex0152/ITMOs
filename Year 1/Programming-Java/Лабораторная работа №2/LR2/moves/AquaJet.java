package moves;

import ru.ifmo.se.pokemon.*;
//	User attacks first.	
public final class AquaJet extends PhysicalMove{
    public AquaJet() {
        super(Type.WATER, 40, 1.0, 1, 1);
    }

    @Override public String describe() {
        return "применяет физическую атаку Aqua Jet";
    }
}
