/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cr.ac.una.srabblenaut.controller;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void OnAtionBtnIngresar(ActionEvent event) {
    }

    @FXML
    private void OnAtionBtnregistrarse(ActionEvent event) {
    }

    @FXML
    private void OnAtionBtnAcercaDe(ActionEvent event) {
    }

    @FXML
    private void OnActionBtnSalir(ActionEvent event) {
    }

    @Override
    public void initialize() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
