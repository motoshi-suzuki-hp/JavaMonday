import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

public class Login {
    public static void main (String arg[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("id : ");
        String id = scanner.next();
        System.out.println();

        System.out.print("pass : ");
        String pass = scanner.next();
        System.out.println();

        ArrayList<String> list1 = new ArrayList<>(List.of("Alice", "Bob", "Cathaline", "David"));
        ArrayList<String> list2 = new ArrayList<>(List.of("a", "b", "c", "d"));

        ArrayList<ArrayList<String>> list = new ArrayList<>();
        list.add(list1);
        list.add(list2);

        int idx = getIndex(list1, id);

        if (idx != -1) {
            if (pass.equals(list2.get(idx))) {
                System.out.println("Login success!");
            } else {
                System.out.println("Id or password is wrong.");
            }
        } else {
            System.out.println("Id or password is wrong.");
        }

        scanner.close();

    }



    public static int getIndex(ArrayList<String> list1, String id) {
        boolean exist = false;
        int idx = 0;
        for (String str : list1) {
            if (str.equals(id)) {
                exist = true;
                break;
            }
            idx ++;
        }

        if (exist) {
            return idx;
        } else {
            return -1;
        }

    }





}



