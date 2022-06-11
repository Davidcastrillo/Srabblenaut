module cr.ac.una.srabblenaut {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;
    requires java.base;
    requires com.jfoenix;
    requires commons.lang3;
    requires commons.lang;
    
    opens cr.ac.una.srabblenaut to javafx.fxml;
    opens cr.ac.una.srabblenaut.controller to javafx.fxml;
    exports cr.ac.una.srabblenaut.controller;
    exports cr.ac.una.srabblenaut.util;
    exports cr.ac.una.srabblenaut;
    
}
