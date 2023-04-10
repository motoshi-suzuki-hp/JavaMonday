package LogicalOperation;

import java.util.Scanner;

public class LogicalOperation {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]) {
        while(true) {
            System.out.println("AND/ OR/ NOT/ NAND/ NOR/ XOR/ XNOR");

            String operation = scanner.next();
            switch (operation) {
                case "AND":
                    System.out.println("A B Z");
                    System.out.println("0 0 0");
                    System.out.println("0 1 0");
                    System.out.println("1 0 0");
                    System.out.println("1 1 1");
                    break;
                case "OR":
                    System.out.println("A B Z");
                    System.out.println("0 0 0");
                    System.out.println("0 1 1");
                    System.out.println("1 0 1");
                    System.out.println("1 1 1");
                    break;

                case "NOT":
                    System.out.println("A Z");
                    System.out.println("0 1");
                    System.out.println("1 0");
                    break;

                case "NAND":
                    System.out.println("A B Z");
                    System.out.println("0 0 1");
                    System.out.println("0 1 1");
                    System.out.println("1 0 1");
                    System.out.println("1 1 0");
                    break;

                case "NOR":
                    System.out.println("A B Z");
                    System.out.println("0 0 1");
                    System.out.println("0 1 0");
                    System.out.println("1 0 0");
                    System.out.println("1 1 0");
                    break;
                
                case "XOR":
                    System.out.println("A B Z");
                    System.out.println("0 0 0");
                    System.out.println("0 1 1");
                    System.out.println("1 0 1");
                    System.out.println("1 1 0");
                    break;
                
                case "XNOR":
                    System.out.println("A B Z");
                    System.out.println("0 0 1");
                    System.out.println("0 1 0");
                    System.out.println("1 0 0");
                    System.out.println("1 1 1");
                    break;
                
                default:
                    System.out.println("We don't have such a operation.");

            }
        }
    }
}
