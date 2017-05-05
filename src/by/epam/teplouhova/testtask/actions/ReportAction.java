package by.epam.teplouhova.testtask.actions;

import by.epam.teplouhova.testtask.entities.SportEquipment;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Class contains method to print report
 */
public class ReportAction {

    //methods print report goods
    public void printGoods(Map<SportEquipment, Integer> goods) {
        int i = 1;
        List<SportEquipment> list = new ArrayList<>(goods.keySet());
        for (SportEquipment equipment : list) {
            System.out.println(i + " " + equipment + " " + "balance " + goods.get(equipment));
            i++;
        }
    }
}
