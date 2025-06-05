package Todo;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main (String[] args){
        TodoList todo  = new TodoList();
        Scanner scanner= new Scanner(System.in);

        while (true) {
            System.out.println("\n   TODO LIST MENU   ");
            System.out.println("1) List of task");
            System.out.println("2) Add Task");
            System.out.println("3) Mark task as done");
            System.out.println("4) Delete any task");
            System.out.println("5) Exit from app");
            System.out.println("6) Choose any options");


            String choice = scanner.nextLine();

            switch (choice) {
                //List of all the task in todolist
                case "1":
                    List<Task> allTasks = todo.getTasks();
                    if(allTasks.isEmpty()){
                        System.out.println("There are no tasks to show");

                    }
                    else{
                        for(Task t: allTasks){
                            System.out.println(t);
                    }
                    }

                break;

                case "2":
                    //Add the title of the task
                    System.out.println("Tiltle of the task");

                    String newTitle = scanner.nextLine();

                    Task created = todo.addTask(newTitle);

                    System.out.println("Added task"+ created);



                break;

                case "3":
                    //Mark task as done
                    System.out.println("Enter a task id that needs to be marked done:");

                    String doneinput = scanner.nextLine();
                    int doneId;



               break;

                case "4":
                    break;

                case"0":
                   return;

                default:

                    break;
            }
        }
    }
}
