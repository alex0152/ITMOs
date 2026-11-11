package lab2;

import ru.ifmo.se.pokemon.*;
import pokemons;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Alomomola("Друг Alomomola", 65));
        b.addAlly(new Mudbray("Друг Mudbray", 47));
        b.addAlly(new Mudsdale("Друг Mudsdale", 52));
        b.addAlly(new NidoranF("Друг Nidoran (Female)", 42));
        b.addAlly(new Nidorina("Друг Nidorina", 84));
        b.addAlly(new Nidoqueen("Друг Nidoqueen", 84));
        b.addFoe(new Alomomola("Враг Alomomola", 65));
        b.addFoe(new Mudbray("Враг Mudbray", 47));
        b.addFoe(new Mudsdale("Враг Mudsdale", 52));
        b.addFoe(new NidoranF("Враг Nidoran (Female)", 42));
        b.addFoe(new Nidorina("Враг Nidorina", 84));
        b.addFoe(new Nidoqueen("Враг Nidoqueen", 84));
        b.go();
    }
}