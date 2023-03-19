package StockManager;
import java.util.ArrayList;
import java.util.Scanner;

class Stock {
    private String name;
    private int quantity;
    private String supplier;
    private double value;

    public Stock(String name, int quantity, String supplier, double value) {
        this.name = name;
        this.quantity = quantity;
        this.supplier = supplier;
        this.value = value;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public String getSupplier(){
        return this.supplier;
    }

    public void setSupplier(String supplier){
        this.supplier = supplier;
    }

    public double getValue(){
        return this.value;
    }

    public void setValue(double value){
        this.value = value;
    }

}

public class StockManager {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Stock> stocks = new ArrayList<Stock>();
    public static void main(String args[]) {
        while (true) {
            System.out.println("Master: M");
            System.out.println("Quantity: Q");
            System.out.println("Order: O");
            System.out.println("Sales: S");
            System.out.println("Ledger: L");
            System.out.println("terminate: T");
            System.out.print("Character: ");
            String firstChoice = scanner.next();
            System.out.println();

            switch (firstChoice) {
                case "M":
                    // Stock Master Managemant System
                    int secondChoice = 0;
                    while (secondChoice != 5) {
                        System.out.println("resister: 1");
                        System.out.println("edit: 2");
                        System.out.println("delete: 3");
                        System.out.println("show: 4");
                        System.out.println("top menu: 5");
                        System.out.print("number: ");
                        secondChoice = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println();

                        switch (secondChoice) {
                            case 1:
                                resisterStock();
                                break;
                            case 2:
                                editStock();
                                break;
                            case 3:
                                deleteStock();
                                break;
                            case 4:
                                showStock();
                                break;
                            case 5:
                                System.out.println("top menu.");
                                System.out.println();
                                break;
                            default:
                                System.out.println("Invalid input.");
                        }
                    }
                    break;
                    

                case "Q":
                    editStock();
                    break;
                case "O":
                    deleteStock();
                    break;
                case "S":
                    showStock();
                    break;
                case "L":
                    break;
                case "T":
                    System.out.println("System was terminated.");
                    System.out.println();
                    return;
                default:
                    System.out.println("Invalid input.");
            }



        }
    }


    // Stock Master Managemant System
    private static void resisterStock(){
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Supplier: ");
        String supplier = scanner.nextLine();
        System.out.print("Value: ");
        double value = scanner.nextDouble();
        scanner.nextLine();

        Stock stock = new Stock(name, quantity, supplier, value);
        stocks.add(stock);


        System.out.println("Stock was added.");
        System.out.println();
    }

    private static void editStock(){
        System.out.print("Index number: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        if (index > stocks.size() || index < -1) {
            System.out.println("Invalid index number.");
            return;
        }

        System.out.print("Name(" + stocks.get(index).getName() + "):");
        String name = scanner.nextLine();
        System.out.print("Quantity(" + stocks.get(index).getQuantity() + "):");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Supplier(" + stocks.get(index).getSupplier() + "):");
        String supplier = scanner.nextLine();
        System.out.print("Value(" + stocks.get(index).getValue() + "):");
        double value = scanner.nextDouble();
        scanner.nextLine();
        System.out.println();

        if (!name.equals("")) {
            stocks.get(index).setName(name);
        }

        if (quantity >= 0) {
            stocks.get(index).setQuantity(quantity);
        }

        if (!supplier.equals("")) {
            stocks.get(index).setSupplier(supplier);
        }

        if (value >= 0) {
            stocks.get(index).setValue(value);
        }

        System.out.println("Stock was edited.");
        System.out.println();
    }

    private static void deleteStock(){
        System.out.print("Index number: ");
        int index = scanner.nextInt();
        System.out.println();

        if (index > stocks.size() || index < -1) {
            System.out.println("Invalid index number.");
            return;
        }

        stocks.remove(index);
        System.out.println("Stock was deleted.");
        System.out.println();
    }

    private static void showStock(){
        if (stocks.isEmpty()) {
            System.out.println("You have no stocks.");
            System.out.println();
            return;
        }

        for(int i = 0; i < stocks.size(); i++) {
            System.out.println(i + ". " + stocks.get(i).getName() + " x" + stocks.get(i).getQuantity() + " @" + stocks.get(i).getSupplier() + " $" + stocks.get(i).getValue());
        }
        System.out.println();
    }


    // Stock Quantity Managemant System

    // Order Managemant System

    // Sales Managemant System

    // Ledger Managemant System



}
