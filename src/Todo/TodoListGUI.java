package Todo;

import javafx.application.Application;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.awt.*;

public class TodoListGUI extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        TextField  taskTitleField = new TextField();

        Button addButton = new Button("Add Task");
        Button addMarkDone = new Button("Mark Done");
        Button deleteButton = new Button("Delete Task");
        ListView<String> taskView = new ListView<>();



    }
}
