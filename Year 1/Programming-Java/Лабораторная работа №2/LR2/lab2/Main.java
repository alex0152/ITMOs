package lab2;

import ru.ifmo.se.pokemon.*;
import pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Alomomola("Розовая рыбка", 65));
        b.addAlly(new Mudbray("Конь", 47));
        b.addAlly(new Mudsdale("Супер-конь", 52));
        b.addAlly(new NidoranF("Морская свинка", 42));
        b.addAlly(new Nidorina("Черепашка с ушами и шипами", 84));
        b.addAlly(new Nidoqueen("Королева-динозаврик", 84));
        b.addFoe(new Alomomola("Аломомола", 65));
        b.addFoe(new Mudbray("Мадбрей", 47));
        b.addFoe(new Mudsdale("Мадсдейл", 52));
        b.addFoe(new NidoranF("Самка Нидоран", 42));
        b.addFoe(new Nidorina("Нидорина", 84));
        b.addFoe(new Nidoqueen("Нидо-королева", 84));
        b.go();
    }
}