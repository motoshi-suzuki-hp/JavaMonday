package ScheduleManager;
import java.util.ArrayList;
import java.util.Scanner;

class Schedule {
    private String name;
    private String date;

    public Schedule (String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return this.name;
    }

    public String getDate() {
        return this.date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

public class ScheduleManager {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Schedule> schedules = new ArrayList<Schedule>();
    public static void main (String args[]) {
        while (true) {
            System.out.println("-------------------");
            System.out.println("Add schedule: 1");
            System.out.println("Edit schedule: 2");
            System.out.println("Delete schedule: 3");
            System.out.println("Show schedule: 4");
            System.out.println("Terminate: 5");
            System.out.println("--------------------");
            System.out.print("Number: ");
            int choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    addSchedule();
                    break;
                case 2:
                    editSchedule();
                    break;
                case 3:
                    deleteSchedule();
                    break;
                case 4:
                    showSchedules();
                    break;
                case 5:
                    System.out.println("System was terminated.");
                    System.out.println();
                    return;
                default:
                    System.out.println("Invalid input.");
                    System.out.println();             
            }
        }
    }

    private static void addSchedule() {
        scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Date: ");
        String date = scanner.nextLine();
        System.out.println();

        Schedule schedule = new Schedule(name, date);
        schedules.add(schedule);

        System.out.println("Schedule was added.");
        System.out.println();
    }

    private static void editSchedule() {
        System.out.print("Index number: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        if (index > schedules.size() || index < 0) {
            System.out.println("Invalid index number.");
            System.out.println();
            return;
        }

        System.out.print("Name(" + schedules.get(index).getName() + "):");
        String name = scanner.nextLine();
        System.out.print("Date(" + schedules.get(index).getDate() + "):");
        String date = scanner.nextLine();
        System.out.println();

        if (!name.equals("")) {
            schedules.get(index).setName(name);
        }

        if (!date.equals("")) {
            schedules.get(index).setDate(date);
        }

        System.out.println("Schedule was edited.");
        System.out.println();
    }

    private static void deleteSchedule() {
        System.out.print("Index number: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        if (index > schedules.size() || index < 0) {
            System.out.println("Invalid index number.");
            System.out.println();
        }

        schedules.remove(index);
        System.out.println("Schedule was deleted.");
        System.out.println();
    }

    private static void showSchedules() {
        if (schedules.isEmpty()) {
            System.out.println("You have no schedule.");
            System.out.println();
            return;
        }

        for(int i = 0; i < schedules.size(); i++) {
            System.out.println(i + ". " + schedules.get(i).getName() + " (" + schedules.get(i).getDate() + ")");
        }
        System.out.println();
    }




}
