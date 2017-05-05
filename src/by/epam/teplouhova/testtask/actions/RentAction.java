package by.epam.teplouhova.testtask.actions;

import by.epam.teplouhova.testtask.Runner;
import by.epam.teplouhova.testtask.entities.RentUnit;
import by.epam.teplouhova.testtask.entities.Shop;
import by.epam.teplouhova.testtask.entities.SportEquipment;

import java.util.ArrayList;
import java.util.Map;

/**
 * Class contains method to check opportunity rent chosen good and
 * method do action to chose and rent good
 */
public class RentAction {

    //methods check opportunity rent chosen good
    public boolean getForRent(Shop shop, SportEquipment equipment) {
        Integer countBalance = shop.getGoods().get(equipment);        //get count available good in shop
        Integer countRent = shop.getGoodsInRent().get(equipment);     //get count the good in rent
        if (countBalance != 0) {
            if (shop.getGoodsInRent().get(equipment) != null) {
                shop.getGoodsInRent().put(equipment, countRent + 1);  //change balance  good in rent
            } else {
                shop.getGoodsInRent().put(equipment, 1);
            }
            shop.getGoods().put(equipment, countBalance - 1);          //change balance available good in shop
            return true;
        } else {
            return false;
        }
    }

    //method do action to chose and rent good
    public void doAction(Shop shop, RentUnit units) {
        Map<SportEquipment, Integer> goods = shop.getGoods();
        System.out.println("Report goods available");
        new ReportAction().printGoods(goods);                           //print list available goods in shop
        System.out.println("Choose number good and enter number");
        if (Runner.sc.hasNextInt()) {
            int number = Runner.sc.nextInt();
            if (number - 1 < shop.getGoods().size()) {
                //get chosen equipment
                SportEquipment equipment = new ArrayList<>(goods.keySet()).get(number - 1);
                if (getForRent(shop, equipment)) {
                    units.addEquipmentRentUnit(equipment);              //add to RentUnit
                } else {
                    System.out.println("not enough good in the shop");
                }
            } else {
                System.out.println("Good with number " + number + "doesn't exist");
            }
        } else {
            System.out.println("You input not number");
        }
    }

}
