package Array;

import java.util.ArrayList;
import java.util.List;

public class TaskScheduler {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(1, 3)); // Task with start time 1 and end time 3
        tasks.add(new Task(2, 5)); // Task with start time 2 and end time 5
        tasks.add(new Task(4, 6)); // Task with start time 4 and end time 6
        tasks.add(new Task(7, 8)); // Task with start time 7 and end time 8

        List<Task> schedule = new ArrayList<>();
        List<List<Task>> schedules = new ArrayList<>();
        scheduleTasks(tasks, 0, schedule, schedules);

        // Print all possible schedules
        for (List<Task> s : schedules) {
            System.out.println("Schedule:");
            for (Task task : s) {
                System.out.println("Start: " + task.start + " End: " + task.end);
            }
            System.out.println();
        }
    }

    public static void scheduleTasks(List<Task> tasks, int index, List<Task> schedule, List<List<Task>> schedules) {
        if (index == tasks.size()) {
            schedules.add(new ArrayList<>(schedule)); // Add valid schedule to the list
            return;
        }

        // Include the task at index 'index' in the schedule
        schedule.add(tasks.get(index));
        scheduleTasks(tasks, index + 1, schedule, schedules);
        schedule.remove(schedule.size() - 1);

        // Skip the task at index 'index' and proceed
        scheduleTasks(tasks, index + 1, schedule, schedules);
    }

    static class Task {
        int start;
        int end;

        Task(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
