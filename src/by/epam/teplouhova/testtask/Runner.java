package by.epam.teplouhova.testtask;

import by.epam.teplouhova.testtask.actions.actionfactory.ActionFactory;
import by.epam.teplouhova.testtask.entities.RentUnit;
import by.epam.teplouhova.testtask.entities.Shop;
import by.epam.teplouhova.testtask.entities.SportEquipment;
import by.epam.teplouhova.testtask.entities.creator.ShopCreator;

import java.io.*;
import java.util.*;

/**
 * Main class of application
 */
public class Runner {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Shop shop = new Shop(new HashMap<SportEquipment, Integer>(), new HashMap<SportEquipment, Integer>());
        RentUnit rent = new RentUnit(new SportEquipment[3]);
        try {
            new ShopCreator().fillShop(shop);           //initialization shop
            while (true) {
                System.out.println("Choose");
                System.out.println("1 - Rent good ");
                System.out.println("2 - Print report goods available ");
                System.out.println("3 - Print report goods in rent ");
                System.out.println("Input on some letter to exit ");
                int action = 0;
                if (sc.hasNextInt()) {
                    action = sc.nextInt();
                } else {
                    break;
                }
                ActionFactory.doActionFromFactory(action, shop, rent);      //do chosen action
            }
        } catch (IOException e) {
            System.out.println("Check way or name  initialization file");
        } finally {
            sc.close();
        }
    }
}
