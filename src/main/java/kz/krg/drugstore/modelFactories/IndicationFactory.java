package kz.krg.drugstore.modelFactories;

import kz.krg.drugstore.model.Contrandication;
import kz.krg.drugstore.model.Indication;

import java.util.List;

/**
 * Фабрика симптомов
 */
public class IndicationFactory {
    public static List<Indication> createSome(){
        Indication.list.add(new Indication("Диарея"));
        Indication.list.add(new Indication("Метеоризм"));
        Indication.list.add(new Indication("Брадикардия"));
        Indication.list.add(new Indication("Кашель"));
        Indication.list.add(new Indication("Бронхит"));
        Indication.list.add(new Indication("Пневмания"));
        Indication.list.add(new Indication("Головная боль"));
        Indication.list.add(new Indication("Лихорадка"));
        Indication.list.add(new Indication("Гипертония"));
        Indication.list.add(new Indication("Невролгия"));

        return Indication.list;
    };
}
