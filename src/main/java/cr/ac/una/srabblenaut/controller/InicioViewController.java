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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author maris
 */
public class InicioViewController extends Controller implements Initializable {

    @FXML
    private AnchorPane root;
    @FXML
    private Label lblScrabblenut;
    @FXML
    private JFXButton btnIngresar;
    @FXML
    private JFXButton btnRegistrarse;
    @FXML
    private JFXButton btnAcercaDe;
    @FXML
    private JFXButton btnSalir;
    @FXML
    private AnchorPane contenedor;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
 
    }    

    @FXML
    private void OnActionBtnIngresar(ActionEvent event) {
         FlowController.getInstance().goViewInStage("LogInView", stage);
        
        
    }

    @FXML
    private void OnActionBtnRegistrarse(ActionEvent event) {
        FlowController.getInstance().goViewInStage("RegistrarseView", stage);
    }

    @FXML
    private void OnActionBtnAcercaDe(ActionEvent event) {
        FlowController.getInstance().goViewInStage("AcercaDeView", stage);
    }

    @FXML
    private void OnActionBtnSalir(ActionEvent event) {
        ((Stage)btnSalir.getScene().getWindow()).close();
    }

    @Override
    public void initialize() {

    }
    
}
