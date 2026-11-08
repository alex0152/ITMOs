package lab2;

import ru.ifmo.se.pokemon.*;
import pokemons;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Alomomola("Друг Alomomola", 61));
        b.addAlly(new Mudbray("Друг Mudbray", 30));
        b.addAlly(new Mudsdale("Друг Mudsdale", 30));
        b.addAlly(new NidoranF("Друг Nidoran (Female)", 20));
        b.addAlly(new Nidorina("Друг Nidorina", 20));
        b.addAlly(new Nidoqueen("Друг Nidoqueen", 20));
        b.addFoe(new Alomomola("Враг Alomomola", 61));
        b.addFoe(new Mudbray("Враг Mudbray", 30));
        b.addFoe(new Mudsdale("Враг Mudsdale", 30));
        b.addFoe(new NidoranF("Враг Nidoran (Female)", 20));
        b.addFoe(new Nidorina("Враг Nidorina", 20));
        b.addFoe(new Nidoqueen("Враг Nidoqueen", 20));
        b.go();
    }
}