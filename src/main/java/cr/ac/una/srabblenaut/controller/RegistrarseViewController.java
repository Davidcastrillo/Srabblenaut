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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void OnAtionBtnAceptar(ActionEvent event) {
    }

    @FXML
    private void OnActionBtnCancelar(ActionEvent event) {
    }

    @FXML
    private void OnActionIngresar(ActionEvent event) {
    }

    @FXML
    private void OnActonBtnVolver(ActionEvent event) {
    }

    @Override
    public void initialize() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
<<<<<<< HEAD
=======

    @FXML
    private void OnActionBtnVolver(MouseEvent event) {
    }
>>>>>>> fde96c66ac746a7f54144b2e738c4c17860dc77c
    
}
