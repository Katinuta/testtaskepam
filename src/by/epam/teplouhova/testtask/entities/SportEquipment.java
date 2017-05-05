package by.epam.teplouhova.testtask.entities;

/**
 * Class describe sport equipment. Class has fields category, title, price,
 * also contains set and get methods for access to fields
 */
public class SportEquipment {

    private Category category;

    private String title;

    private int price;

    public SportEquipment(Category category, String title, int price) {
        this.category = category;
        this.title = title;
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SportEquipment that = (SportEquipment) o;

        if (price != that.price) return false;
        if (category != that.category) return false;
        return title.equals(that.title);
    }

    @Override
    public int hashCode() {
        int result = category.hashCode();
        result = 31 * result + title.hashCode();
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return category + " " + title +
                " price " + price;
    }
}
