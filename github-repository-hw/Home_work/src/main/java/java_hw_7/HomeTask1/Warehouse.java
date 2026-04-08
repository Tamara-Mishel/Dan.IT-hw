package java_hw_7.HomeTask1;

import java.util.ArrayList;
import java.util.List;

public class Warehouse<T> {

    private final List<T> items = new ArrayList<>();
    public void addItem(T item) {
        items.add(item);
    }
    public int getItemCount() {
        return items.size();
    }
    public List<T> getItems() {
        return items;
    }
    public void removeItem(T item) {
        items.remove(item);
    }
    public boolean isEmpty() {
        return items.isEmpty();
    }
    public void clear() {
        items.clear();
    }
}