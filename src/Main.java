import java.util.Scanner;

public class Main {


    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    public static void pause(Scanner sc) {
        System.out.println("\nPresiona ENTER para continuar...");
        sc.nextLine();
    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int option;

        TaskManager taskManager = new TaskManager();

        do {
            clearScreen();
            System.out.println("====================================");
            System.out.println("          TASK MANAGER");
            System.out.println("====================================");
            System.out.println("1. Add task");
            System.out.println("2. List tasks");
            System.out.println("3. Mark task as completed");
            System.out.println("0. Exit");
            System.out.println("====================================");
            System.out.print("Select an option: ");

            option = keyboard.nextInt();
            keyboard.nextLine();

            switch (option) {

                case 1:
                    clearScreen();
                    System.out.println("ADD NEW TASK");
                    System.out.println("------------------------------");
                    System.out.print("Task description: ");
                    String addTask = keyboard.nextLine();
                    taskManager.addTask(addTask);
                    System.out.println("\nTask added successfully!");
                    pause(keyboard);
                    break;

                case 2:
                    clearScreen();
                    System.out.println("TASK LIST");
                    System.out.println("------------------------------");
                    taskManager.listTasks();
                    pause(keyboard);
                    break;

                case 3:
                    clearScreen();
                    System.out.println("✔ MARK TASK AS COMPLETED");
                    System.out.println("------------------------------");
                    taskManager.listTasks();
                    System.out.print("\nEnter task number: ");
                    int completeTask = keyboard.nextInt();
                    keyboard.nextLine();
                    taskManager.markTask(completeTask);
                    pause(keyboard);
                    break;

                case 0:
                    clearScreen();
                    System.out.println("Exiting Task Manager...");
                    break;

                default:
                    System.out.println(" Invalid option");
                    pause(keyboard);
                    break;
            }

        } while (option != 0);

        keyboard.close();
    }
}
