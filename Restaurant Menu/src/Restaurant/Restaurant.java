package Restaurant;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("Pizza", "Hot and Ready", 10, "main course");
        MenuItem item2 = new MenuItem("steak and potato", "Relatively mild potatoes practically serve as a canvas for the savory meat", 15, "main course");
        MenuItem item3 = new MenuItem("Toasted Ravioli","A St.Louis favorite, served with a side of pizza souce",7.99,"appetizer");
        MenuItem item4 = new MenuItem("Garlic bread", "Hot and garlicky",5.88, "appetizer");
        MenuItem item5 = new MenuItem("ice cream sundae", "3 scoops of ice cream topped with chocolate syrup, sprinkles and whipped cream", 6.50,"dessert");
        MenuItem item6 = new MenuItem("ice cream sundae", "3 scoops of ice cream topped with chocolate syrup, sprinkles and whipped cream", 6.50,"dessert");
        Menu menu = new Menu();

        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);
        System.out.println(menu);
//        System.out.println();

//
//        menu.removeItem(item2);
//        System.out.println(menu);
    }
}
