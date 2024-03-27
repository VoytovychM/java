package org.homework.six;

public class Main {
    public static void main(String[] args) {
        Item apple = new Item("apple", 2.5, 5);
        Item mango = new Item("mango", 2.3, 3);
        Item banana = new Item("banana", 5.1, 4);
        Category fruits = new Category("fruits", new Item[]{apple, mango, banana});
        Item rom = new Item("rom", 10, 2);
        Item whisky = new Item("whisky", 43.5, 4 );
        Category alcohol = new Category("alcohol", new Item[]{rom, whisky});
        Basket basket = new Basket(new Item[]{banana, rom});
        User user = new User("Masha", "5834", basket);
        double sum = 0;
        Item[] selectedItems = user.getBasket().getSelectedItems();
        for (int i = 0; i < selectedItems.length ; i++) {
            sum = sum + selectedItems[i].getPrice();

        }
        System.out.println(sum);
    }
}
