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
public class JugarViewController extends Controller implements Initializable {

    @FXML
    private AnchorPane root;
    @FXML
    private AnchorPane contenedor;
    @FXML
    private Label lblScrabblenut;
    @FXML
    private JFXButton btnJugar;
    @FXML
    private JFXButton btnPuntajes;
    @FXML
    private JFXButton btnSalir;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void OnActionBtnJugar(ActionEvent event) {
         FlowController.getInstance().goViewInStage("TableroView", stage);
    }

    @FXML
    private void OnActionBtnPuntajes(ActionEvent event) {
    }

    @FXML
    private void OnActionBtnSalir(ActionEvent event) {
         ((Stage)btnSalir.getScene().getWindow()).close();
    }

    @Override
    public void initialize() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
