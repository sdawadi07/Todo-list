package Todo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class TodoListGUI extends Application {

    private TodoList todoList = new TodoList();
    private ListView<String> listView = new ListView<>();
    private ComboBoxBase<Object> inputField;

    public static void main(String[] args) {
        launch(args);  // Start JavaFX app
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("TODO LIST APP");

        TextField  taskTitleField = new TextField();
        inputField.setPromptText("Enter task title");

        Button addButton = new Button("Add Task");
        Button addMarkDone = new Button("Mark Done");
        Button deleteButton = new Button("Delete Task");


        VBox vbox = new VBox(10);
        vbox.setPadding(new javafx.geometry.Insets(10));


        HBox hbox = new HBox(10);
        hbox.getChildren().addAll(inputField, addButton, addMarkDone, deleteButton);

        vbox.getChildren().addAll(new Label("Todo List"), listView,hbox);



        addButton.setOnAction(event ->{

            String title = inputField.getTooltip().getText();
            if (!title.isEmpty()){
                Task t = todoList.addTask(title);
                refreshList;
                inputField.clear();


            }

        } );
       addMarkDone.setOnAction(event -> {
           int selectedIndex = listView.getSelectionModel().getSelectedIndex();
           if (selectedIndex != -1) {
               int id = todoList.getTasks().get(selectedIndex).getId();
               todoList.markDone(id);
               refreshList();
           }
       });
    }
}
