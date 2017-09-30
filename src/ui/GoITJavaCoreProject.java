package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GoITJavaCoreProject extends Application {

    private final int WINDOW_WIDTH=800;
    private final int WINDOW_HEIGHT=600;

    private String nameOfProgram = "Name of the program";




    public static StackPane mainPane;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle(nameOfProgram);
        primaryStage.setWidth(WINDOW_WIDTH);
        primaryStage.setHeight(WINDOW_HEIGHT);

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("fxml/startPageFXML.fxml"));
        mainPane = loader.load();
        mainPane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(mainPane);
        scene.getStylesheets().add("ui/css/GoITJavaCoreProject.css");

        primaryStage.setScene(scene);
        primaryStage.show();

    }

    }
