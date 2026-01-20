import java.util.ArrayList;

public class TaskManager {

    private final ArrayList<Task> list = new ArrayList<>();

    public void addTask(String task) {
        list.add(new Task(task));
    }

    public void listTasks() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }

    public void markTask(int index) {
        index--;

        if (index >= 0 && index < list.size()) {
            list.get(index).setCompleted(true);
            System.out.println("Task completed");
        } else {
            System.out.println("Invalid task number");
        }
    }
}
