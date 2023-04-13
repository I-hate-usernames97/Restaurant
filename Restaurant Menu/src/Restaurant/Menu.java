package Restaurant;

import java.util.Date;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;


    public void addItem(MenuItem item) {
            menuItems.add(item);
            this.lastUpdated = new Date();
    }

    public void removeItem(MenuItem item){
        menuItems.remove(item);
        this.lastUpdated = new Date();

    }

    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("appetizer")) {
                appetizers.append(item.toString());
            }
        }
        StringBuilder mainCourses = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("main course")) {
                mainCourses.append(item.toString());
            }
        }
        StringBuilder desserts = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("dessert")) {
                desserts.append(item.toString());
            }
        }

        return "Hanzen House of fun\n" +
                "\nAPPETIZERS\n" + appetizers.toString() +
                "MAIN COURSE \n" + mainCourses.toString() +
                "DESSERTS \n" + desserts.toString();
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
