package kz.krg.drugstore.modelFactories;

import kz.krg.drugstore.model.Contrandication;

import java.util.ArrayList;
import java.util.List;

/**
 * Фабрика противопоказаний
 */
public class ContrandicationFactory {
    public static List<Contrandication> createSome(){
        Contrandication.list.add(new Contrandication("Беременность"));
        Contrandication.list.add(new Contrandication("Панкреатит"));
        Contrandication.list.add(new Contrandication("Гемофилия"));
        Contrandication.list.add(new Contrandication("Язва ЖКТ"));
        return Contrandication.list;
    };
}
