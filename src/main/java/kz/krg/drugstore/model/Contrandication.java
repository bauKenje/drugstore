package kz.krg.drugstore.model;

import kz.krg.drugstore.model.BaseModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Противопоказание
 */
public class Contrandication extends BaseModel {
    public String name;
    public static List<Contrandication> list;

    static {
        list = new ArrayList<Contrandication>();
    }

    public Contrandication(String name){
        super();
        this.name = name;
    }


}
