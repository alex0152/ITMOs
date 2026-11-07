package lab2;

import ru.ifmo.se.pokemon.*;
import pokemons;

public class Main {
  public static void main(String[] args) {
    Battle b = new Battle();
    Pokemon p1 = new Alomomola("Чужой", 1);
    Pokemon p2 = new Pokemon("Хищник", 1);
    b.addAlly(p1);
    b.addFoe(p2);
    b.go();
  }
}