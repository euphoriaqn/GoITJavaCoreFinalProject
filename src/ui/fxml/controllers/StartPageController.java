package ui.fxml.controllers;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import ui.GoITJavaCoreProject;

import java.io.IOException;

public class StartPageController{

    public void analyticsOnMouseClicked(MouseEvent mouseEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(GoITJavaCoreProject.class.getResource("fxml/analyticsPageFXML.fxml"));
        StackPane mainItem = loader.load();
        mainItem.setAlignment(Pos.CENTER);

        GoITJavaCoreProject.mainPane.getChildren().clear();
        GoITJavaCoreProject.mainPane.getChildren().addAll(mainItem);
    }


    public void settingsOnMouseClicked(MouseEvent mouseEvent) throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(GoITJavaCoreProject.class.getResource("fxml/settingsPageFXML.fxml"));
        StackPane mainItem = loader.load();
        mainItem.setAlignment(Pos.CENTER);

        GoITJavaCoreProject.mainPane.getChildren().clear();
        GoITJavaCoreProject.mainPane.getChildren().addAll(mainItem);

    }
}
