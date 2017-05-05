package by.epam.teplouhova.testtask.entities;

import by.epam.teplouhova.testtask.entities.SportEquipment;

import java.util.Map;

/**
 * Class describes shop. Class has field available goods and goods in rent,also contains set and get methods for
 * access to fields
 */
public class Shop {

    private Map<SportEquipment, Integer> goods;

    private Map<SportEquipment, Integer> goodsInRent;

    public Shop() {
    }

    public Shop(Map<SportEquipment, Integer> goods, Map<SportEquipment, Integer> goodsInRent) {
        this.goods = goods;
        this.goodsInRent = goodsInRent;
    }

    public Map<SportEquipment, Integer> getGoods() {
        return goods;
    }

    public void setGoods(Map<SportEquipment, Integer> goods) {
        this.goods = goods;
    }


    public Map<SportEquipment, Integer> getGoodsInRent() {
        return goodsInRent;
    }

    public void setGoodsInRent(Map<SportEquipment, Integer> goodsInRent) {
        this.goodsInRent = goodsInRent;
    }

    @Override
    public String toString() {
        return "Shop" + goods;
    }
}
