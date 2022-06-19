/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cr.ac.una.srabblenaut.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import cr.ac.una.srabblenaut.util.FlowController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
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
    private AnchorPane root;
    @FXML
    private AnchorPane contenedor;
    @FXML
    private JFXButton btnAceptar;
    @FXML
    private JFXButton btnCancelar;
    @FXML
    private JFXButton btnIngresar;
    @FXML
    private TextField txtUsuario;
    @FXML
    private PasswordField txtClave;
    @FXML
    private PasswordField txtConfirmarClave;

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
    private void OnActionBtnAceptar(ActionEvent event) {
    }

    @FXML
    private void OnActionBtnCancelar(ActionEvent event) {
        FlowController.getInstance().goViewInStage("inicioView", stage);
    }

    @FXML
    private void OnActionBtnIngresar(ActionEvent event) {
        FlowController.getInstance().goViewInStage("LogInView", stage);
    }
    
}
