package Todo;

import java.util.List;
import java.util.ArrayList;


public class TodoList {
    private List<Task> tasks;
    private int nextId;
    public TodoList() {
        tasks = new ArrayList<>();
        nextId =1;

    }
    public Task addTask (String title){
        Task t = new Task(nextId,title);
        nextId= nextId + 1;
        tasks.add(t);
        return t;
    }

    public List<Task> getTasks() {
        return tasks;
    }
    public boolean markDone (int Id){
        for (Task t:tasks){
            if(t.getId() == Id){
             t.setDone(true);
             return(true);
            }

        }
        return false;
    }

}
