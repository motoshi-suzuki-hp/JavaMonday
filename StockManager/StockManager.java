package StockManager;

import java.util.ArrayList;
import java.util.Scanner;

// import javax.sound.midi.SysexMessage;

class Stock {
    private String name;
    private int num;
    private String supplier;
    private double value;

    public Stock(String name, int num, String supplier, double value) {
        this.name = name;
        this.num = num;
        this.supplier = supplier;
        this.value = value;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getNum(){
        return this.num;
    }

    public void setNum(int num){
        this.num = num;
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

class Quantity {
    private String name;
    private int inc;
    private int dec;

    public Quantity(String name, int inc, int dec) {
        this.name = name;
        this.inc = inc;
        this.dec = dec;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setInc(int inc) {
        this.inc = inc;
    }

    public int getInc() {
        return this.inc;
    }


    public void setDec(int dec) {
        this.dec = dec;
    }

    public int getDec() {
        return this.dec;
    }

}

class Order {
    private String name;
    private int orderNum;
    private String orderSup;
    private String orderDate;

    public Order(String name, int orderNum, String orderSup, String orderDate) {
        this.name = name;
        this.orderNum = orderNum;
        this.orderSup = orderSup;
        this.orderDate = orderDate;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public void setOrderSup(String orderSup) {
        this.orderSup = orderSup;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public int getOrderNum() {
        return this.orderNum;
    }

    public String getOrderSup() {
        return this.orderSup;
    }

    public String getOrderDate() {
        return this.orderDate;
    }


}

class Sales {
    private String name;
    private int salesNum;
    private double salesVal;

    public Sales(String name, int salesNum, double salesVal) {
        this.name = name;
        this.salesNum = salesNum;
        this.salesVal = salesVal;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getSalesNum(){
        return this.salesNum;
    }

    public void setSalesNum(int salesNum){
        this.salesNum = salesNum;
    }

    public double getSalesVal(){
        return this.salesVal;
    }

    public void setSalesVal(double salesVal){
        this.salesVal = salesVal;
    }

}

public class StockManager {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Stock> stocks = new ArrayList<Stock>();
    private static ArrayList<Quantity> quantities = new ArrayList<Quantity>();
    private static ArrayList<Order> orders = new ArrayList<Order>();
    private static ArrayList<Sales> saleses = new ArrayList<Sales>();
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

            int secondChoice = 0;

            switch (firstChoice) {


                case "M":
                    // Stock Master Managemant System
                    while (secondChoice != 5) {
                        System.out.println("resister stock: 1");
                        System.out.println("edit stock: 2");
                        System.out.println("delete stock: 3");
                        System.out.println("show stock: 4");
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
                    while (secondChoice != 5) {
                        System.out.println("in: 1");
                        System.out.println("out: 2");
                        System.out.println("adjust: 3");
                        System.out.println("show: 4");
                        System.out.println("top menu: 5");
                        System.out.print("number: ");
                        secondChoice = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println();

                        switch (secondChoice) {
                            case 1:
                                increaseQuantity();
                                break;
                            case 2:
                                decreaseQuantity();
                                break;
                            case 3:
                                editQuantity();
                                break;
                            case 4:
                                showQuantity();
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


                case "O":
                    while (secondChoice != 5) {
                        System.out.println("resister order: 1");
                        System.out.println("edit order: 2");
                        System.out.println("delete order: 3");
                        System.out.println("show order: 4");
                        System.out.println("top menu: 5");
                        System.out.print("number: ");
                        secondChoice = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println();

                        switch (secondChoice) {
                            case 1:
                                resisterOrder();
                                break;
                            case 2:
                                editOrder();
                                break;
                            case 3:
                                deleteOrder();
                                break;
                            case 4:
                                showOrder();
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

                case "S":
                    while (secondChoice != 5) {
                        System.out.println("resister sales: 1");
                        System.out.println("edit sales: 2");
                        System.out.println("delete sales: 3");
                        System.out.println("show sales: 4");
                        System.out.println("top menu: 5");
                        System.out.print("number: ");
                        secondChoice = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println();

                        switch (secondChoice) {
                            case 1:
                                resisterSales();
                                break;
                            case 2:
                                editSales();
                                break;
                            case 3:
                                deleteSales();
                                break;
                            case 4:
                                showSales();
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

                case "L":
                    while (secondChoice != 5) {
                        System.out.println("show: 1");
                        System.out.println("show quan: 2");
                        System.out.println("show order: 3");
                        System.out.println("show sales: 4");
                        System.out.println("top menu: 5");
                        System.out.print("number: ");
                        secondChoice = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println();

                        switch (secondChoice) {
                            case 1:
                                showStock();
                                break;
                            case 2:
                                showQuantity();
                                break;
                            case 3:
                                showOrder();
                                break;
                            case 4:
                                showSales();
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
        System.out.print("Num: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Supplier: ");
        String supplier = scanner.nextLine();
        System.out.print("Value: ");
        double value = scanner.nextDouble();
        scanner.nextLine();



        Stock stock = new Stock(name, num, supplier, value);
        stocks.add(stock);

        Quantity quantity = new Quantity(name, 0, 0);
        quantities.add(quantity);

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
        System.out.print("Quantity(" + stocks.get(index).getNum() + "):");
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
            stocks.get(index).setNum(quantity);
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
            System.out.println(i + ". " + stocks.get(i).getName() + " x" + stocks.get(i).getNum() + " @" + stocks.get(i).getSupplier() + " $" + stocks.get(i).getValue());
        }
        System.out.println();
    }


    // Stock Quantity Managemant System
    private static void increaseQuantity() {
        showStock();

        if (stocks.isEmpty()) {
            return;
        }

        System.out.print("Index number: ");
        int index = scanner.nextInt();
        System.out.println();

        System.out.print("Increase quantity(" + stocks.get(index).getNum() + "): +");
        int inc = scanner.nextInt();
        System.out.println();

        stocks.get(index).setNum(stocks.get(index).getNum() + inc);
        quantities.get(index).setInc(inc);

        System.out.println("Stock was increased.");
        System.out.println();
    }

    private static void decreaseQuantity() {
        showStock();
        
        if (stocks.isEmpty()) {
            return;
        }

        System.out.print("Index number: ");
        int index = scanner.nextInt();
        System.out.println();

        System.out.print("Decrease quantity(" + stocks.get(index).getNum() + "): -");
        int dec = scanner.nextInt();
        System.out.println();

        stocks.get(index).setNum(stocks.get(index).getNum() - dec);
        quantities.get(index).setDec(-1*dec);

        System.out.println("Stock was decreased.");
        System.out.println();
    }
    
    private static void editQuantity() {
        showStock();
        
        if (stocks.isEmpty()) {
            return;
        }

        System.out.print("Index number: ");
        int index = scanner.nextInt();
        System.out.println();


        System.out.print("Adjust quantity(" + stocks.get(index).getNum() + "): ");
        int edit = scanner.nextInt();
        System.out.println();

        stocks.get(index).setNum(edit);


        System.out.println("Stock was edited.");
        System.out.println();
    }

    private static void showQuantity() {
        if (quantities.isEmpty()) {
            System.out.println("You have no quantities.");
            System.out.println();
            return;
        }

        for(int i = 0; i < quantities.size(); i++) {
            System.out.println(i + ". " + quantities.get(i).getName() + " +" + quantities.get(i).getInc() + " -" + quantities.get(i).getDec());
        }
        System.out.println();
    }

    // Order Managemant System
    private static void resisterOrder() {
        showStock();
        
        if (stocks.isEmpty()) {
            return;
        }

        System.out.print("Index number: ");
        int index = scanner.nextInt();
        System.out.println();

        if (stocks.get(index).getNum() != 0) {
            System.out.println("You have " + stocks.get(index).getNum() + " stocks.");
            return;
        }

        System.out.print("Name: " + stocks.get(index).getName());
        System.out.print("orderNum: ");
        int orderNum = scanner.nextInt();
        scanner.nextLine();
        System.out.print("orderSup: ");
        String orderSup = scanner.nextLine();
        System.out.print("orderDate: ");
        String orderDate = scanner.nextLine();
        scanner.nextLine();

        Order order = new Order(stocks.get(index).getName(), orderNum, orderSup, orderDate);
        orders.add(order);

        System.out.println("Order was resistered.");
        System.out.println();

    }

    private static void editOrder() {
        System.out.print("Index number: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        if (index > orders.size() || index < -1) {
            System.out.println("Invalid index number.");
            return;
        }

        System.out.println("Name: " + orders.get(index).getName());
        System.out.print("orderNum(" + orders.get(index).getOrderNum() + "):");
        int orderNum = scanner.nextInt();
        scanner.nextLine();
        System.out.print("orderSup(" + orders.get(index).getOrderSup() + "):");
        String orderSup = scanner.nextLine();
        System.out.print("orderDate(" + orders.get(index).getOrderDate() + "):");
        String orderDate = scanner.nextLine();
        System.out.println();


        if (orderNum >= 0) {
            orders.get(index).setOrderNum(orderNum);
        }

        if (!orderSup.equals("")) {
            orders.get(index).setOrderSup(orderSup);
        }

        if (!orderDate.equals("")) {
            orders.get(index).setOrderDate(orderDate);
        }

        System.out.println("Order was edited.");
        System.out.println();

    }

    private static void deleteOrder() {

        System.out.print("Index number: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        if (index > orders.size() || index < -1) {
            System.out.println("Invalid index number.");
            return;
        }

        orders.remove(index);
        System.out.println("Order was deleted.");
        System.out.println();
    }

    private static void showOrder() {
        if (orders.isEmpty()) {
            System.out.println("You have no orders.");
            System.out.println();
            return;
        }

        for(int i = 0; i < orders.size(); i++) {
            System.out.println(i + ". " + orders.get(i).getName() + " x" + orders.get(i).getOrderNum() + " @" + orders.get(i).getOrderSup() + " (" + orders.get(i).getOrderDate() + ")");
        }
        System.out.println();
    }


    // Sales Managemant System

    private static void resisterSales() {
        showStock();
        
        if (stocks.isEmpty()) {
            return;
        }

        System.out.print("Index number: ");
        int index = scanner.nextInt();
        System.out.println();

        System.out.print("Name: " + stocks.get(index).getName());
        System.out.print("salesNum: ");
        int salesNum = scanner.nextInt();
        scanner.nextLine();
        System.out.print("salesVal: ");
        double salesVal = scanner.nextDouble();
        scanner.nextLine();

        Sales sales = new Sales(stocks.get(index).getName(), salesNum, salesVal);
        saleses.add(sales);

        System.out.println("Sales was resistered.");
        System.out.println();
    }

    private static void editSales() {
        System.out.print("Index number: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        if (index > saleses.size() || index < -1) {
            System.out.println("Invalid index number.");
            return;
        }

        System.out.print("Name: " + saleses.get(index).getName());
        System.out.print("salesNum(" + saleses.get(index).getSalesNum() + "):");
        int salesNum = scanner.nextInt();
        scanner.nextLine();
        System.out.print("salesVal(" + saleses.get(index).getSalesVal() + "):");
        double salesVal = scanner.nextDouble();
        scanner.nextLine();
        System.out.println();


        if (salesNum >= 0) {
            saleses.get(index).setSalesNum(salesNum);
        }

        if (salesVal >= 0) {
            saleses.get(index).setSalesVal(salesVal);
        }

        System.out.println("Sales was edited.");
        System.out.println();
    }

    private static void deleteSales() {
        System.out.print("Index number: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        if (index > saleses.size() || index < -1) {
            System.out.println("Invalid index number.");
            return;
        }

        saleses.remove(index);
        System.out.println("Sales was deleted.");
        System.out.println();
    }

    private static void showSales() {
        if (saleses.isEmpty()) {
            System.out.println("You have no sales.");
            System.out.println();
            return;
        }

        for(int i = 0; i < saleses.size(); i++) {
            System.out.println(i + ". " + saleses.get(i).getName() + " x" + saleses.get(i).getSalesNum() + " $" + saleses.get(i).getSalesVal());
        }
        System.out.println();
    }

    // Ledger Managemant System


    

}

// 商品マスター管理機能：商品の情報を登録・更新・削除することができます。商品名、在庫数、仕入先、価格などを登録することができます。

// 在庫数管理機能：在庫の入出庫を管理することができます。商品の入庫、出庫、在庫数の調整を行うことができます。

// 発注管理機能：在庫が不足している場合に発注を行うことができます。発注数、仕入先、注文日などを登録することができます。

// 売上管理機能：売上の管理を行うことができます。販売数、売上金額、商品名などを登録することができます。

// 帳票出力機能：各種帳票を出力することができます。在庫数一覧、売上一覧、発注一覧などがあります。