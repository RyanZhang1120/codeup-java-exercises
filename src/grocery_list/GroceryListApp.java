package grocery_list;
import java.util.*;
import util.Input;

//public class GroceryListApp {
//    private HashMap<GroceryCategory, List<GroceryItem>> itemsByCategory;
//    private List<GroceryItem> items;
//    private Input input = new Input();
//    public GroceryList() {
//        itemsByCategory = new HashMap<>();
//        items = new ArrayList<>();
//
//        for (GroceryCategory category : GroceryCategory.values()) {
//            itemsByCategory.put(category, new ArrayList<>());
//        }
//    }
//
//    public void addItem() {
//        System.out.println("Add an item to the grocery list:");
//
//        GroceryCategory category = input.getCategory("Select a category:\n" + GroceryCategory.printCategories());
//
//        String name = input.getString("Enter the name of the item:");
//
//        int quantity = input.getInt(1, Integer.MAX_VALUE, "Enter the quantity:");
//
//        GroceryItem item = new GroceryItem(name, category, quantity);
//
//        itemsByCategory.get(category).add(item);
//        items.add(item);
//
//        System.out.println("Item added!");
//    }
//
//    public void editItem() {
//        System.out.println("Select an item to edit:");
//
//        int index = 1;
//        Map<Integer, GroceryItem> indexedItems = new HashMap<>();
//
//        for (GroceryItem item : items) {
//            System.out.printf("%d. %s\n", index, item.toString());
//            indexedItems.put(index, item);
//            index++;
//        }
//
//        int choice = input.getInt(1, items.size(), "Enter your choice: ");
//        GroceryItem item = indexedItems.get(choice);
//
//        System.out.printf("You selected: %s\n", item.toString());
//
//        item.setName(input.getString("Enter a new name or press enter to keep the existing name: "));
//
//        item.setQuantity(input.getInt(1, Integer.MAX_VALUE,
//                "Enter a new quantity or press enter to keep the existing quantity: "));
//
//        item.setCategory(input.getCategory("Select a new category or press enter to keep the existing category:\n"
//                + GroceryCategory.printCategories()));
//    }
//
//    public void printList() {
//        System.out.println("\nHere is your grocery list:");
//
//        for (GroceryCategory category : GroceryCategory.values()) {
//            List<GroceryItem> categoryItems = itemsByCategory.get(category);
//
//            if (!categoryItems.isEmpty()) {
//                System.out.printf("\n%s:\n", category);
//
//                for (GroceryItem item : categoryItems) {
//                    System.out.printf("- %s (%d)\n", item.getName(), item.getQuantity());
//                }
//            }
//        }
//    }
//
//    public void printByCategory() {
//        GroceryCategory category = input.getCategory("Select a category:\n" + GroceryCategory.printCategories());
//
//        List<GroceryItem> categoryItems = itemsByCategory.get(category);
//
//        if (!categoryItems.isEmpty()) {
//            System.out.printf("\n%s:\n", category);
//
//            for (GroceryItem item : categoryItems) {
//                System.out.printf("- %s (%d)\n", item.getName(), item.getQuantity());
//            }
//        } else {
//            System.out.printf("\nThere are no items in the %s category.\n", category);
//        }
//    }
//
//    public static void main(String[] args) {
//        GroceryList groceryList = new GroceryList();
//
//        while (true) {
//            boolean createList = groceryList.input.yesNo("Would you like to create a grocery list? ");
//
//            if (createList) {
//                boolean addItem = true;
//
//                while (addItem) {
//                    groceryList.addItem();
//
//                    addItem = groceryList.input.yesNo("Would you like to add another item? ");
//                }
//
//                boolean editItem = true;
//
//                while (editItem) {
//                    groceryList.editItem();
//
//                    editItem = groceryList.input.yesNo("Would you like to edit another item? ");
//                }
//
//                boolean printByCategory = true;
//
//                while (printByCategory) {
//                    groceryList.printByCategory();
//
//                    printByCategory = groceryList.input.yesNo("Would you like to print items by another category? ");
//                }
//
//                groceryList.printList();
//            } else {
//                System.out.println("Goodbye!");
//                break;
//            }
//        }
//    }
//}

