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
                  try {
                      doneId = Integer.parseInt(doneinput);
                  } catch(NumberFormatException e){
                      System.out.println("Invalid number format:");
                      break;
                  }
                  boolean wasMarked = todo.markDone(doneId);
                  if (wasMarked){
                      System.out.println("Task" + doneId + "marked done.");
                  }
                  else{
                      System.out.println("Task" + doneId + "not marked done");

                  }




               break;

                case "4":
                    //Delete a task
                    System.out.println("Enter a task id you need to delete:");
                    String deleteinput = scanner.nextLine();
                    int deleteId;
                    try {
                        deleteId = Integer.parseInt(deleteinput);
                    } catch(NumberFormatException e){
                        System.out.println("Invalid number format:");
                        break;
                    }
                    boolean wasDeleted = todo.deleteTask(deleteId);
                    if (wasDeleted){
                        System.out.println("Task" + deleteId + "was deleted.");
                    }
                    else{
                        System.out.println("Task" + deleteId + "was not deleted.");

                    }

                    break;

                case"0":
                    // exit from the Todo-List app
                    System.out.println("Thank you! Have a Good day");
                    scanner.close();
                   return;

                default:
                    //If none of the above cases are used

                    System.out.println(" Invalid input. Please try again");

                    break;

            }
        }
    }
}
