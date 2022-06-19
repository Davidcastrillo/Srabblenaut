/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cr.ac.una.srabblenaut.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

import cr.ac.una.srabblenaut.model.Fichas;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import org.apache.commons.lang.ArrayUtils;
/**
 * FXML Controller class
 *
 * @author David
 */
public class TableroViewController extends Controller implements Initializable {

    private Fichas meza[][] = new Fichas[15][15];
    private  Fichas bolsa[] = new Fichas[102];
    private static  Fichas Mazojug1[] = new Fichas[7];
    private static Fichas Mazojug2[] = new Fichas[7];
    private static Fichas Mazojug3[] = new Fichas[7];
    private static  Fichas Mazojug4[] = new Fichas[7];
    
    @FXML
    private VBox vboxTablero;
    @FXML
    private HBox hBoxbolsaFichas;
    @FXML
    private VBox vBxJugador1;
    @FXML
    private Label lblJugador1;
    @FXML
    private HBox hBoxLosetasJugador1;
    @FXML
    private VBox vBxJugador11;
    @FXML
    private Label lblJugador2;
    @FXML
    private HBox hBoxLosetasJugador2;
    @FXML
    private VBox vBxJugador12;
    @FXML
    private Label lblJugador3;
    @FXML
    private HBox hBoxLosetasJugador3;
    @FXML
    private VBox vBxJugador121;
    @FXML
    private Label lblJugador4;
    @FXML
    private HBox hBoxLosetasJugador4;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        mezalogica();
        crearBolsa();
        CrearMezavisual(1);
        

        
       
    }    

    @Override
    public void initialize() {
       
        
    }
 public void mezalogica(){
     //Creamos una matriz de fichas para la meza ,para asi poder crear la funcionalidad.
     for (int i = 0; i < 15; i++) {
         
         for (int j = 0; j < 15; j++) {
            Fichas fich = new Fichas();
            fich.setTipodeFicha("M");
            fich.setFila(i);
            fich.setColumna(j);
            meza[i][j]=fich;
            
         
         }
         
     }
     
     


    
}
   
public void crearBolsa(){
    for (int i = 0; i <102; i++) {
        Fichas fichas = new Fichas();
        fichas.setTipodeFicha("B");
        
        if(i>=0 && i<2){//Fichas blancas
//           fichas.setTipoFicha(1);
           fichas.setPuntaje(0);
           fichas.setIde("W");
            
        }
        if(i >= 2 && i<15){//Fichas A
         fichas.setTipoFicha(1);
           fichas.setPuntaje(1); 
           fichas.setIde("A");
            
        }
        if(i>=15 && i<18){//Fichas B
         fichas.setTipoFicha(2);
           fichas.setPuntaje(3);
           fichas.setIde("B");
            
        }
        if(i>=18 && i<22){//Fichas C
        fichas.setTipoFicha(3);
           fichas.setPuntaje(3);
           fichas.setIde("C");
            
        }
        if(i>=22 && i<27){//Fichas D
         fichas.setTipoFicha(4);
           fichas.setPuntaje(2);
           fichas.setIde("D");
            
        }
        if(i>=27 && i<39){//Fichas E
        fichas.setTipoFicha(5);
           fichas.setPuntaje(1);
           fichas.setIde("E");
 
            
        }
        if(i==39){//Fichas F
         fichas.setTipoFicha(27);
           fichas.setPuntaje(4);
           fichas.setIde("F");
           
            
        }
        if(i>=40 && i<46){//Fichas I
        fichas.setTipoFicha(8);
           fichas.setPuntaje(1);    
           fichas.setIde("I");
            
        }
        if(i==46){//Fichas J
        fichas.setTipoFicha(9);
           fichas.setPuntaje(8);    
           fichas.setIde("J");
            
        }
        if(i>=47 && i<51){//Fichas L
        fichas.setTipoFicha(10);
           fichas.setPuntaje(1);
           fichas.setIde("L");
           
            
        }
        if(i==51 ){//Fichas LL
         fichas.setTipoFicha(11);
           fichas.setPuntaje(8);   
           fichas.setIde("LL");
            
        }
        if(i==52 ){//Fichas CH
        fichas.setTipoFicha(26);
           fichas.setPuntaje(5);
           fichas.setIde("CH");
           
            
        }
        if(i==53){//Fichas Ñ
         fichas.setTipoFicha(25);
           fichas.setPuntaje(8);
           fichas.setIde("Ñ");
          
            
        }
        if(i>=54 && i<63){//Fichas O
         fichas.setTipoFicha(14);
           fichas.setPuntaje(1);
           fichas.setIde("O");
           
            
        }
        if(i>=63 && i<65){//Fichas P
         fichas.setTipoFicha(15);
           fichas.setPuntaje(3);   
           fichas.setIde("P");
            
        }
        if(i==65){//Fichas Q
         fichas.setTipoFicha(16);
           fichas.setPuntaje(5);   
           fichas.setIde("Q");
            
        }
        if(i>=66 && i<72){//Fichas S
         fichas.setTipoFicha(19);
           fichas.setPuntaje(1);   
           fichas.setIde("S");
            
        }
        if(i>=72 && i<76){//Fichas T
         fichas.setTipoFicha(20);
           fichas.setPuntaje(1);   
           fichas.setIde("T");
            
        }
        if(i==76){//Fichas V
         fichas.setTipoFicha(22);
           fichas.setPuntaje(4);   
           fichas.setIde("V");
            
        }
        if(i==77){//Fichas X
         fichas.setTipoFicha(23);
           fichas.setPuntaje(8);   
           fichas.setIde("X");
            
        }
        if(i==78){//Fichas Y
         fichas.setTipoFicha(24);
           fichas.setPuntaje(4);   
           fichas.setIde("Y");
            
        }
        if(i>=79 && i<81){//Fichas H
        fichas.setTipoFicha(7);
           fichas.setPuntaje(4);    
           fichas.setIde("H");
            
        }
        if(i>=81 && i<83){//Fichas G
         fichas.setTipoFicha(6);
           fichas.setPuntaje(2);   
           fichas.setIde("G");
            
        }
        if(i>=83 && i<88){//Fichas U
         fichas.setTipoFicha(21);
           fichas.setPuntaje(1);   
           fichas.setIde("U");
            
        }
        if(i>=88 && i<90){//Fichas M
         fichas.setTipoFicha(12);
           fichas.setPuntaje(3);   
           fichas.setIde("M");
            
        }
        if(i>=90 && i<95){//Fichas R
        fichas.setTipoFicha(17);
           fichas.setPuntaje(1);    
           fichas.setIde("R");
           
        }
        if(i==95){//Fichas RR
        fichas.setTipoFicha(18);
           fichas.setPuntaje(8);    
           fichas.setIde("RR");
            
        }
        if(i>=96 && i<100){//Fichas N
        fichas.setTipoFicha(13);
           fichas.setPuntaje(1);
           fichas.setIde("N");

            
        }
        if(i==100){//Fichas Z
         fichas.setTipoFicha(28);
           fichas.setPuntaje(10);
           fichas.setIde("Z");

            
        }        
     fichas.crearFichas();
     //Funcionalidad de drag and drop de las fichas.
                 
            fichas.setOnDragDetected(new EventHandler <MouseEvent>() {
            public void handle(MouseEvent event) {
                /* drag was detected, start drag-and-drop gesture*/
//                System.out.println("onDragDetected");
                
                /* allow any transfer mode */
                Dragboard db = fichas.startDragAndDrop(TransferMode.ANY);
                
                /* put a string on dragboard */
                ClipboardContent content = new ClipboardContent();
                content.putImage(fichas.getImage());
                db.setContent(content);
                
                event.consume();
            }
        });
                 
            fichas.setOnDragDone(new EventHandler <DragEvent>() {
            public void handle(DragEvent event) {
                /* the drag-and-drop gesture ended */
//                System.out.println("onDragDone");
                /* if the data was successfully moved, clear it */
                if (event.getTransferMode() == TransferMode.MOVE) {
                    fichas.setAccessibleText("Eliminada");
                    moverFichasMezalogia(fichas);
                    hBoxbolsaFichas.getChildren().remove(fichas);
                rellenarHBoxBolsa();
                }
                
                event.consume();
            }
        });

     bolsa[i]= fichas;
     DesordenarFichas();
     rellenarHBoxBolsa();

     
    }
    
   
    
    
    
}
public void CrearMezavisual(int dif){
    
    if(dif == 1){
        for (int i = 0; i < 15; i++) {//filas
         HBox fila = new HBox();// se crean intastancias de Hbox para para filas 
         fila.setSpacing(5); 
        for (int j = 0; j < 15; j++) { //columnas
             Image img12 = new Image("cr/ac/una/srabblenaut/resources/cuadrado.png");
                ImageView img = new ImageView();
                img.setImage(img12);
                img.setFitHeight(30);
                img.setFitWidth(30);
                  //Fucncionalidad del drag and drop de todas la Fichas.      
                img.setOnDragOver(new EventHandler <DragEvent>() {
                public void handle(DragEvent event) {
                    /* data is dragged over the target */
//                    System.out.println("onDragOver");
                    /* accept it only if it is  not dragged from the same node 
                     * and if it has a string data */
                    if (event.getGestureSource() != img &&
                            event.getDragboard().hasImage()) {
                        /* allow for both copying and moving, whatever user chooses */
                        event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
                    }
                    event.consume();
                }
            });
                
                img.setOnDragDropped(new EventHandler <DragEvent>() {
                public void handle(DragEvent event) {
                    /* data dropped */
//                    System.out.println("onDragDropped");
                    /* if there is a string data on dragboard, read it and use it */
                    Dragboard db = event.getDragboard();
                    boolean success = false;
                    if (db.hasImage()) {
                        img.setImage(db.getImage());
                        img.setAccessibleText("Agregada"); //bandera que determina que le acaban de soltar algo adentro
                        success = true;
                    }
                    /* let the source know whether the string was successfully 
                     * transferred and used */
                    event.setDropCompleted(success);
                    event.consume();
                }
            });
                fila.getChildren().add(img);
        }
                        vboxTablero.getChildren().add(fila);            
    }   
            
            
            
            
            
        }
           
    }

   
    
    
    
    

   public void moverFichasMezalogia(Fichas Fichs){
        for (int i=0;i<15;i++){ //filas
             HBox fila = new HBox();
             fila = (HBox)vboxTablero.getChildren().get(i);
            for(int j=0;j<15;j++){//columnas
                if("Agregada".equals(fila.getChildren().get(j).getAccessibleText())){
                    Fichs.setFila(i);
                    Fichs.setColumna(j);
                    meza[i][j]=Fichs;
                    fila.getChildren().get(j).setAccessibleText("MovimientoCompleto");
//                    System.out.println("id agrgardo en meza: "+meza[i][j].getIde());
                }
            }
        }
    }
public void rellenarmazoJug(){
    
    
}
    public void rellenarHBoxBolsa(){
       
        
          
        if (hBoxbolsaFichas.getChildren().isEmpty()){ // si esta vacia solo la primer vez agrega 2 losetas
//            hBoxbolsaFichas.getChildren().add((Fichas));  
            bolsa = (Fichas[]) ArrayUtils.remove(bolsa, 0);
        }
          
   }

    public void DesordenarFichas(){//desordena las losetas selva solo si el jugador es el 1
        Random r = new Random();
        for (int i=0; i<bolsa.length; i++) {
            int posAleatoria = r.nextInt(bolsa.length);
            Fichas temp = bolsa[i];
            bolsa[i]= bolsa[posAleatoria];
            bolsa[posAleatoria]= temp;
            
            
            

        }
    }

    public void setMeza(Fichas[][] meza) {
        this.meza = meza;
    }

    public Fichas[] getBolsa() {
        return bolsa;
    }

    public void setBolsa(Fichas[] bolsa) {
        this.bolsa = bolsa;
    }




}
