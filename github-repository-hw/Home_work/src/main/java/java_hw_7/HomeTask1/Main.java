package java_hw_7.HomeTask1;

public class Main {

    public static void main(String[] args) {

        Warehouse<String> warehouse = new Warehouse<>();

        warehouse.addItem("Laptop");
        warehouse.addItem("Phone");

        System.out.println("Items count: " + warehouse.getItemCount());
        System.out.println("Items: " + warehouse.getItems());

        warehouse.removeItem("Phone");

        System.out.println("After remove: " + warehouse.getItems());
        System.out.println("Is empty: " + warehouse.isEmpty());

        warehouse.clear();

        System.out.println("After clear: " + warehouse.getItems());
    }
}
