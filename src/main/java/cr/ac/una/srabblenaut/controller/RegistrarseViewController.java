/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cr.ac.una.srabblenaut.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
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
public class RegistrarseViewController extends Controller implements Initializable {

    @FXML
    private Label lblRegistrarUsuario;
    @FXML
    private JFXTextField txtUsuario;
    @FXML
    private JFXPasswordField txtClave;
    @FXML
    private JFXPasswordField txtConfirmarClave;
    @FXML
    private JFXButton btnAceptar;
    @FXML
    private JFXButton btnCancelar;
    @FXML
    private JFXButton btnIngresar;
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


    @FXML
    private void OnActionBtnCancelar(ActionEvent event) {
    }


    @FXML
    private void OnActonBtnVolver(ActionEvent event) {
    }

    @Override
    public void initialize() {
      


 
    }

    @FXML
    private void OnActionBtnAceptar(ActionEvent event) {
    }

    @FXML
    private void OnActionBtnIngresar(ActionEvent event) {
    }


    
}
