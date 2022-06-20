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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import cr.ac.una.srabblenaut.util.FlowController;

/**
 * FXML Controller class
 *
 * @author maris
 */
public class LogInViewController extends Controller implements Initializable {

    @FXML
    private AnchorPane root;
    @FXML
    private Label lblIngresarUsuario;
    @FXML
    private TextField txtUsuario;
    @FXML
    private PasswordField txtClave;
    @FXML
    private JFXButton btnAceptar;
    @FXML
    private JFXButton btnCancelar;
    @FXML
    private JFXButton btnRegistrarse;
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
    private void OnAtionBtnAceptar(ActionEvent event) {
        FlowController.getInstance().goViewInStage("JugarView", stage);
    }

    @FXML
    private void OnActionBtnCancelar(ActionEvent event) {
         FlowController.getInstance().goViewInStage("inicioView", stage);
    }

    @FXML
    private void OnActionBtnRegistrarse(ActionEvent event) {
        FlowController.getInstance().goViewInStage("RegistrarseView", stage);
    }

    @Override
    public void initialize() {

    }

    
}
