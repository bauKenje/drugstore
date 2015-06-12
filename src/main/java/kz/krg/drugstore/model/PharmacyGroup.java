package kz.krg.drugstore.model;

import kz.krg.drugstore.model.BaseModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Фармокологическая группа
 */
public class PharmacyGroup extends BaseModel {
    public String name;

    public static List<PharmacyGroup> list;

    static {
        list = new ArrayList<PharmacyGroup>();
    }

    public PharmacyGroup(String name){
        super();
        this.name = name;
    }
}
