/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cr.ac.una.srabblenaut.controller;

import com.jfoenix.controls.JFXButton;
import cr.ac.una.srabblenaut.util.FlowController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author maris
 */
public class AcercaDeViewController extends Controller implements Initializable {

    @FXML
    private Label lblScrabblenut;
    @FXML
    private JFXButton btnVolver;
    @FXML
    private AnchorPane root;
    @FXML
    private AnchorPane contenedor;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @Override
    public void initialize() {

    }

    @FXML
    private void OnActionBtnVolver(ActionEvent event) {
        FlowController.getInstance().goViewInStage("inicioView", stage);
    }

    
}
