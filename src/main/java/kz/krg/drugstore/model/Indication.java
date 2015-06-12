package kz.krg.drugstore.model;

import kz.krg.drugstore.model.BaseModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Симптом заболевания
 */
public class Indication extends BaseModel {
    public String name;

    public static List<Indication> list;

    static {
        list = new ArrayList<Indication>();
    }
    public Indication(String name){
        super();
        this.name = name;
    }
}
