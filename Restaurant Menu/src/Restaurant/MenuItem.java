package Restaurant;
import java.util.Date;
import java.util.Objects;


public class MenuItem {

    private String name;
    private String description;
    private double price;
    private String category;
    private Date dateAdded;

    public MenuItem(String name, String description, double price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = new Date();
    }

    @Override
    public String toString() {
        String newText = isNew() ? " - NEW" : "";
        return name + newText + '\n' +
                description + " | $" + price + "\n \n";
    }

    Boolean isNew(){
        Date toDay = new Date();

        if (toDay.getTime() != this.dateAdded.getTime()){

            return true;
        }

        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem item = (MenuItem) o;
        return Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
