package lab2;

import ru.ifmo.se.pokemon.*;
import pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle fight = new Battle();
        fight.addAlly(new Alomomola("Розовая рыбка", 61));
        fight.addAlly(new Mudbray("Конь", 47));
        fight.addAlly(new Mudsdale("Супер-конь", 52));
        fight.addAlly(new NidoranF("Морская свинка", 42));
        fight.addAlly(new Nidorina("Черепашка с ушами и шипами", 84));
        fight.addAlly(new Nidoqueen("Королева-динозаврик", 84));
        fight.addFoe(new Alomomola("Аломомола", 61));
        fight.addFoe(new Mudbray("Мадбрей", 47));
        fight.addFoe(new Mudsdale("Мадсдейл", 52));
        fight.addFoe(new NidoranF("Самка Нидоран", 42));
        fight.addFoe(new Nidorina("Нидорина", 84));
        fight.addFoe(new Nidoqueen("Нидо-королева", 84));
        fight.go();
    }
}