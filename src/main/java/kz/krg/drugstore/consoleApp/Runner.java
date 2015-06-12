package kz.krg.drugstore.consoleApp;

import kz.krg.drugstore.model.Drug;
import kz.krg.drugstore.modelFactories.DrugFactory;
import kz.krg.drugstore.modelFactories.IndicationFactory;
import kz.krg.drugstore.modelFactories.ContrandicationFactory;
import kz.krg.drugstore.modelFactories.PharmacyGroupFactory;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.*;

/**
 * Created by Reider on 11.06.2015.
 */
public class Runner {

    public static void main(String[] args) throws UnsupportedEncodingException {
        /*if(System.getProperty("os.name").startsWith("Windows")) {
            System.setOut(new PrintStream(System.out,true,"utf-8"));
        }*/
        try {
            IndicationFactory.createSome();
            System.out.println("Список показаний успешно заполнен.");
        } catch (Exception e) {
            System.out.println("Ошибка в заполнении списка показаний");
            return;
        }

        try {
            ContrandicationFactory.createSome();
            System.out.println("Список противопоказаний успешно заполнен.");
        } catch (Exception e) {
            System.out.println("Ошибка в заполнении списка противопоказаний");
            return;
        }

        try {
            PharmacyGroupFactory.createSome();
            System.out.println("Список фармакологических групп успешно заполнен.");
        } catch (Exception e) {
            System.out.println("Ошибка в заполнении списка фармакологических групп");
            return;
        }

        try {
            DrugFactory.createSome();
            System.out.println("Список препаратов успешно заполнен.");
        } catch (Exception e) {
            System.out.println("Ошибка в заполнении списка препаратов");
            return;
        }

        System.out.println("Поиск препаратов по имени: ____");
        System.out.println("Поиск препаратов по фармакологической группе: g ____");
        System.out.println("Поиск препаратов по показаниям к применению: i ____,____,...");
        System.out.println("Для выхода из программы: q");
        Scanner in = new Scanner(System.in);
        while (true) {
            List<Drug> drugs = new ArrayList<Drug>();
            String query = in.nextLine();
            if (query.isEmpty()) {
                //Вывод всех препаратов
                drugs = Drug.list;
            } else if (query.equals("q")) {
                    return;
            } else if (query.length() <= 2 || query.substring(0,1) != "g " && query.substring(0,1) != "i "){
                //Поиск препаратов по имени
                drugs = Drug.getDrugsByName(query);
            } else if (query.charAt(0) == 'g'){
                // Поиск препаратов по фармакологической группе
                drugs = Drug.getDrugsPharmacyGroup(query.substring(2));
            } else if (query.charAt(0) == 'i'){
                // Поиск препаратов по показаниям к применению
                drugs = Drug.getDrugsByIndication(query.substring(2));
            }
            for (Drug drug : drugs) {
                System.out.println(drug.name);
            }
        }
    }
}
