package kz.krg.drugstore.modelFactories;

import kz.krg.drugstore.model.Contrandication;
import kz.krg.drugstore.model.PharmacyGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Фабрика фармокологических групп
 */
public class PharmacyGroupFactory {
    public static List<PharmacyGroup> createSome(){
        PharmacyGroup.list.add(new PharmacyGroup("Пищеварительное ферментное средство"));
        PharmacyGroup.list.add(new PharmacyGroup("Нестероидные противовоспалительные лекарственные средства"));
        PharmacyGroup.list.add(new PharmacyGroup("Обезболивающие и противовоспалительные лекарственные средства"));
        PharmacyGroup.list.add(new PharmacyGroup("Анальгетики-антипиретики"));
        PharmacyGroup.list.add(new PharmacyGroup("Муколитическое средство"));
        PharmacyGroup.list.add(new PharmacyGroup("Антагонисты рецепторов ангиотензина II (AT1-подтип)"));
        return PharmacyGroup.list;
    };
}
