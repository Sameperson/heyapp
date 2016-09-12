package com.sameperson;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/sample.fxml"));


//        Group root = new Group();
//
//        Text txt = new Text();
//        txt.setFont(new Font("Papyrus", 80));
//        Label label = new Label("Name: ");
//        TextField nameField = new TextField();
//        GridPane grid = new GridPane();
//        Button button = new Button("HEY");
//
//        grid.add(label, 0, 0);
//        grid.add(nameField, 1, 0);
//        grid.add(button, 1, 1);
//        grid.setHgap(5);
//        grid.setVgap(5);
//
//        //DEBUGGING FEATURE
//        grid.setGridLinesVisible(true);
//
//        button.setOnAction(evt -> txt.setText(String.format("HEY %s!", nameField.getText())));
//        txt.setY(50);
//
//        VBox box = new VBox();
//        box.getChildren().addAll(txt, grid);
//        root.getChildren().add(box);
        primaryStage.setTitle("Hey");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
