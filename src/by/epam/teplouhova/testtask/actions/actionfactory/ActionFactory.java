package by.epam.teplouhova.testtask.actions.actionfactory;

import by.epam.teplouhova.testtask.actions.RentAction;
import by.epam.teplouhova.testtask.actions.ReportAction;
import by.epam.teplouhova.testtask.entities.RentUnit;
import by.epam.teplouhova.testtask.entities.Shop;

/**
 * Class contain method to do chosen action
 */
public class ActionFactory {

    public static void doActionFromFactory(int action, Shop shop, RentUnit units) {
        switch (action) {
            case 1: {
                if (units.isRentUnitAvailable()) {                   //condition checks user ability for rent
                    new RentAction().doAction(shop, units);
                } else {
                    System.out.println("Client can not rent more than 3 e");
                }
                break;
            }

            case 2: {
                System.out.println("Report goods available");
                new ReportAction().printGoods(shop.getGoods());
                break;
            }

            case 3: {
                System.out.println("Report  goods in rent");
                new ReportAction().printGoods(shop.getGoodsInRent());
                break;
            }

            default:
                System.out.println("Operation " + action + "does not exist");
        }
    }
}
