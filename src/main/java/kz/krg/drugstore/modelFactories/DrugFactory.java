package kz.krg.drugstore.modelFactories;

import kz.krg.drugstore.model.Contrandication;
import kz.krg.drugstore.model.Drug;
import kz.krg.drugstore.model.Indication;
import kz.krg.drugstore.model.PharmacyGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;


/**
 * Created by Reider on 11.06.2015.
 */
public class DrugFactory {
    public static List<Drug> createSome(){
        Map<String,PharmacyGroup> pharmacyGroupDictionary = new HashMap<String, PharmacyGroup>();
        for (PharmacyGroup phG: PharmacyGroup.list)
            pharmacyGroupDictionary.put(phG.name, phG);

        Map<String,Indication> indicationDictionary = new HashMap<String, Indication>();
        for (Indication indication: Indication.list)
            indicationDictionary.put(indication.name, indication);

        Map<String,Contrandication> contrandicationDictionary = new HashMap<String, Contrandication>();
        for (Contrandication contrandication: Contrandication.list)
            contrandicationDictionary.put(contrandication.name, contrandication);

        Drug citramon = new Drug("Цитрамон","Citramon",pharmacyGroupDictionary.get("Анальгетики-антипиретики"));
        citramon.indications.add(indicationDictionary.get("Головная боль"));
        citramon.indications.add(indicationDictionary.get("Лихорадка"));
        citramon.indications.add(indicationDictionary.get("Невролгия"));
        Drug.list.add(citramon);
        Drug ambroxol = new Drug("Амброксол", "Ambroxol", pharmacyGroupDictionary.get("Муколитическое средство"));
        ambroxol.indications.add(indicationDictionary.get("Кашель"));
        ambroxol.indications.add(indicationDictionary.get("Бронхит"));
        ambroxol.indications.add(indicationDictionary.get("Пневмония"));
        Drug.list.add(ambroxol);
        Drug festal = new Drug("Фестал", "Pancreatin", pharmacyGroupDictionary.get("Пищеварительное ферментное средство"));
        festal.indications.add(indicationDictionary.get("Гастрит"));
        festal.indications.add(indicationDictionary.get("Доуденит"));
        festal.indications.add(indicationDictionary.get("Холецистит"));
        Drug.list.add(festal);
        Drug eprosartan = new Drug("Эпросатран","eprosartan", pharmacyGroupDictionary.get("Антагонисты рецепторов ангиотензина II (AT1-подтип)"));
        eprosartan.indications.add(indicationDictionary.get("Артериальная гипертензия"));
        Drug.list.add(eprosartan);
        Drug solpadein = new Drug("Солпадеин","Codeine+Caffein+Paracetamol",pharmacyGroupDictionary.get("Обезболивающие и противовоспалительные лекарственные средства"));
        solpadein.indications.add(indicationDictionary.get("Головная боль"));
        solpadein.indications.add(indicationDictionary.get("Зубная боль"));
        Drug.list.add(solpadein);
        return Drug.list;
    };
}
