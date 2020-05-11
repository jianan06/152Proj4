package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.file.Path;

import java.util.Scanner;


public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public void exit(ActionEvent event) {
        System.exit(0);
    }

    public void openRecipeWindow(ActionEvent event) {
        Parent root = null;
        var loc = getClass().getResource("RecipeWindow.fxml");
        try {
            Files.write(Paths.get(path), content.getBytes());
            root = FXMLLoader.load(loc);
        } catch (IOException e) {
            System.out.println("Couldn't Find FXML file");
        }
        // new window
        Scene windowContents = new Scene(root, 900, 400);
        Stage recipeWindow = new Stage();
        recipeWindow.setScene(windowContents);
        recipeWindow.setTitle("Recipe Finder Demo");
        recipeWindow.show();
    }

}

