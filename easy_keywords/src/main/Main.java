/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author MacBook
 */
public class Main extends Application {
    
    private Stage primaryStage;         //application window
    private static BorderPane mainLayout;      //main screen
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Easy Keywords");
        showMainView();                 //display the mainLsyout (first screen)
    }
    
    private void showMainView() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        //load the MainView of mainLayout in the Main class
        loader.setLocation(Main.class.getResource("/resources/fxml/MainView.fxml"));
        mainLayout = loader.load(); 
        //display the MainView
        Scene scene = new Scene(mainLayout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void showFilesScreen() throws IOException {
        System.out.println("showFilseScreen called");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("/resources/fxml/Files.fxml"));
        BorderPane mainItems = loader.load();
        mainLayout.setCenter(mainItems);
    }
    
    public static void showApplyKeywordsScreen() throws IOException {
        System.out.println("showApplyKeywordsScreen called");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("/resources/fxml/ApplyKeywrods.fxml"));
        BorderPane mainItems = loader.load();
        mainLayout.setCenter(mainItems);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
