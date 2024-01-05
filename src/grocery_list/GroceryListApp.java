package grocery_list;
import java.util.*;

public class GroceryListApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Item>> groceryList = new HashMap<>();
        List<String> categories = Arrays.asList("Produce", "Dairy", "Meat", "Bakery", "Frozen", "Canned", "Dry", "Snacks");

        System.out.println("Would you like to create a grocery list? (yes/no)");
        String createList = scanner.nextLine().trim().toLowerCase();

        while (createList.equals("yes") || createList.equals("y")) {
            System.out.println("Do you want to enter a new item? (yes/no)");
            String newItem = scanner.nextLine().trim().toLowerCase();

            while (newItem.equals("yes") || newItem.equals("y")) {
                System.out.println("Select the category for the item:");
                for (int i = 0; i < categories.size(); i++) {
                    System.out.println((i + 1) + ". " + categories.get(i));
                }
                int categoryIndex = Integer.parseInt(scanner.nextLine().trim()) - 1;
                String category = categories.get(categoryIndex);

                System.out.println("Enter the name of the item:");
                String itemName = scanner.nextLine().trim();

                System.out.println("Enter the quantity of the item:");
                int itemQuantity = Integer.parseInt(scanner.nextLine().trim());

                groceryList.putIfAbsent(category, new ArrayList<>());
                groceryList.get(category).add(new Item(itemName, itemQuantity));

                System.out.println("Do you want to add another item? (yes/no)");
                newItem = scanner.nextLine().trim().toLowerCase();
            }

            System.out.println("Do you want to filter the list by category? (yes/no)");
            String filter = scanner.nextLine().trim().toLowerCase();

            if (filter.equals("yes")) {
                System.out.println("Select a category to filter by:");
                for (int i = 0; i < categories.size(); i++) {
                    System.out.println((i + 1) + ". " + categories.get(i));
                }
                int filterIndex = Integer.parseInt(scanner.nextLine().trim()) - 1;
                String filterCategory = categories.get(filterIndex);

                System.out.println("Grocery list filtered by " + filterCategory + ":");
                displayItems(groceryList, filterCategory);
            } else {
                System.out.println("Complete grocery list:");
                for (String category : categories) {
                    displayItems(groceryList, category);
                }
            }

            System.out.println("Do you want to create a new grocery list? (yes/no)");
            createList = scanner.nextLine().trim().toLowerCase();
        }

        scanner.close();
    }

    private static void displayItems(Map<String, List<Item>> groceryList, String category) {
        if (groceryList.containsKey(category)) {
            List<Item> items = groceryList.get(category);
            Collections.sort(items);
            System.out.println(category + ":");
            for (Item item : items) {
                System.out.println("  " + item.getName() + " - " + item.getQuantity());
            }
        }
    }

    static class Item implements Comparable<Item> {
        private String name;
        private int quantity;

        public Item(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public int getQuantity() {
            return quantity;
        }

        @Override
        public int compareTo(Item o) {
            return this.name.compareToIgnoreCase(o.name);
        }
    }
}


