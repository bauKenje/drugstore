package kz.krg.drugstore.model;

import java.util.*;

/**
 * Препарат
 */
public class Drug extends BaseModel {
    public String name;
    public String internacionalName;
    public PharmacyGroup pharmacyGroup;
    public String pharmaceuticalForm;
    public String pozology;
    public List<Indication> indications;
    public List<Contrandication> contrandications;

    public static List<Drug> list;

    static {
        list = new ArrayList<Drug>();
    }

    // спросить про необязательный параметр
    public Drug(String name) {
        super();
        this.name = name;
        this.indications = new ArrayList<Indication>();
        this.contrandications = new ArrayList<Contrandication>();
    }

    public Drug(String name, String internacionalName){
        super();
        this.name = name;
        this.internacionalName = internacionalName;
        this.indications = new ArrayList<Indication>();
        this.contrandications = new ArrayList<Contrandication>();
    }

    public Drug(String name, String internacionalName, PharmacyGroup pharmacyGroup){
        super();
        this.name = name;
        this.internacionalName = internacionalName;
        this.pharmacyGroup = pharmacyGroup;
        this.indications = new ArrayList<Indication>();
        this.contrandications = new ArrayList<Contrandication>();
    }

    // поиск препаратов по имени
    public static List<Drug> getDrugsByName(String query){
        query = query.toLowerCase();
        List<Drug> result = new ArrayList<Drug>();
        for (Drug drug : Drug.list) {
            String str1 = drug.internacionalName.toLowerCase();
            String str2 = drug.name.toLowerCase();
            boolean bool1 = str1.contains(query);
            boolean bool2 = str2.contains(query);
            if (bool1 || bool2)
                result.add(drug);
        }
        return result;
    }

    public static List<Drug> getDrugsPharmacyGroup(String query){
        query = query.toLowerCase();
        List<Drug> result = new ArrayList<Drug>();
        for (Drug drug : Drug.list)
            if (drug.pharmacyGroup.name.toLowerCase().contains(query) || drug.pharmacyGroup.name.toLowerCase().contains(query))
                result.add(drug);
        return result;
    }

    //поиск препаратов по показаниям к применению
    public static List<Drug> getDrugsByIndication(String query){
        Map <Drug, Integer> drugFrequency = new HashMap<Drug, Integer>();
        String[] splittedQuery = query.split(",");
        for (Drug drug : Drug.list)
            for (Indication indication : drug.indications)
                for (String indicationInQuery : splittedQuery)
                    if (indicationInQuery == indication.name)
                        if (drugFrequency.get(drug) == null) {
                            drugFrequency.put(drug, 1);
                        } else {
                            drugFrequency.put(drug, drugFrequency.get(drug) + 1);
                        }

        List<Drug> result = new ArrayList<Drug>();

        while (drugFrequency.size() > 0) {
            int i = 1;
            for (Map.Entry<Drug, Integer> drugIntegerMap : drugFrequency.entrySet()) {
                if (drugIntegerMap.getValue() == i) {
                    result.add(drugIntegerMap.getKey());
                    drugFrequency.remove(drugIntegerMap.getKey());
                }
            }
            i++;
        }
        Collections.reverse(result);
        return result;
    }
}
