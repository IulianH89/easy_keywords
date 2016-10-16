/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources.fxml;

import java.io.IOException;
import javafx.fxml.FXML;
import main.Main;

/**
 *
 * @author MacBook
 */
public class MainButtonsController {
    
    public Main main;
    
    @FXML
    private void goFiles() throws IOException {
        System.out.println("Files Button pressed");
        main.showFilesScreen();
    }
    
    @FXML
    private void goApplyKeywords() throws IOException {
        System.out.println("Apply Keywords Button pressed");
        main.showApplyKeywordsScreen();
    }
}
