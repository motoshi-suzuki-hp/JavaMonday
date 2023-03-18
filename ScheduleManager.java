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
}

public class ScheduleManager {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Schedule> schedules = new ArrayList<Schedule>();
    public static void main (String args[]) {

    }
}
