package grocery_list;

import java.util.ArrayList;
import java.util.HashMap;

public class Category {
    private String name;
    private ArrayList<String> items;
    public Category(String name) {
        this.name = name;
        this.items = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addItem(String item) {
        items.add(item);
    };
}
