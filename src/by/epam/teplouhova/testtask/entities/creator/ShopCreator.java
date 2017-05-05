package by.epam.teplouhova.testtask.entities.creator;

import by.epam.teplouhova.testtask.entities.Category;
import by.epam.teplouhova.testtask.entities.Shop;
import by.epam.teplouhova.testtask.entities.SportEquipment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Class contains method to initialization of Shop class object
 * and method to check correctness  initialization data
 */

public class ShopCreator {

    public void fillShop(Shop shop) throws IOException {
        try (BufferedReader in = new BufferedReader(new FileReader("shop.txt"))) {
            String line = in.readLine();

            while (line != null) {
                String[] good = line.split(" ");

                for (String str : good) {
                    str.trim();
                }
                checkDataInitialization(good);
                //add to shop good
                shop.getGoods().put(new SportEquipment(Category.valueOf(good[0].toUpperCase()), good[1],
                        Integer.valueOf(good[2])), Integer.valueOf(good[3]));
                line = in.readLine();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Can not initialize shop. Check format initialization file");
            System.exit(0);
        }
    }

    //method to check correctness  initialization data
    public void checkDataInitialization(String[] good) throws IllegalArgumentException {
        int price = Integer.valueOf(good[2]);
        int count = Integer.valueOf(good[3]);
        if (price <= 0 || count < 0) {
            throw new IllegalArgumentException();
        }

    }
}
