package by.epam.teplouhova.testtask.entities;

import by.epam.teplouhova.testtask.entities.SportEquipment;

/**
 * Class contains information about user's goods. Class has field array of SportEquipment.
 * Also contains methods access to this field.
 */
public class RentUnit {

    private SportEquipment[] units;

    public RentUnit() {
    }

    public RentUnit(SportEquipment[] units) {
        this.units = units;
    }

    public SportEquipment[] getUnits() {
        return units;
    }

    public void setUnits(SportEquipment[] units) {
        this.units = units;
    }

    public boolean isRentUnitAvailable() {

        for (SportEquipment equipment : units) {
            if (equipment == null) {
                return true;
            }
        }
        return false;
    }

    public void addEquipmentRentUnit(SportEquipment sportEquipment) {
        int indexForAddition = 0;

        for (int index = 0; index < units.length; index++) {
            if (units[index] == null) {
                indexForAddition = index;
            }
        }
        units[indexForAddition] = sportEquipment;
    }
}
