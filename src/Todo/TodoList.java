package Todo;

import java.util.List;
import java.util.ArrayList;


public class TodoList {
    //List all the task in TodoList
    private List<Task> tasks;
    private int nextId;
    public TodoList() {
        tasks = new ArrayList<>();
        nextId =1;

    }
    /**
     *
     * @param title
     * @return all the added task
     */
    public Task addTask (String title){
        Task t = new Task(nextId,title);
        nextId= nextId + 1;
        tasks.add(t);
        return t;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    /**
     *
     * Tick mark all the task that is done in the TodoList
     * @return Id
     */
    public boolean markDone (int Id){
        for (Task t:tasks){
            if(t.getId() == Id){
             t.setDone(true);
             return(true);
            }

        }
        return false;
    }

    /**
     *
     * Check if the task is equals to the Id, and deletes it
     * @return
     */
    public boolean deleteTask(int Id){
        for(int i=0; i< tasks.size(); i++){
            Task t = tasks.get(i);
            if (t.getId()==Id){
                tasks.remove(i);
                return(true);
            }
        }
          return(false);
    }
}
