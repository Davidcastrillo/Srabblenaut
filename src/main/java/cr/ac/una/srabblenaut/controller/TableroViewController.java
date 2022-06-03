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
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
/**
 * FXML Controller class
 *
 * @author David
 */
public class TableroViewController extends Controller implements Initializable {


/**
 * FXML Controller class
@ -18,14 +26,321 @@ public class TableroViewController extends Controller implements Initializable {
    /**
     * Initializes the controller class.
     */
    
    private Fichas meza[][] = new Fichas[15][15];
    private Fichas bolsa[] = new Fichas[102];
    private Fichas Mazojug[] = new Fichas[7];
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        mezalogica();
        crearBolsa();
        
       
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
     
     

//   for (int x=0; x < meza.length; x++) {
//  System.out.print("|");
//  for (int y=0; y < meza[x].length; y++) {
//    System.out.print (meza[x][y].getIde());
//    if (y!=meza[x].length-1) System.out.print("\t");
//  }
//  System.out.println("|");
//}
    
    
}
   
public void crearBolsa(){
    for (int i = 0; i < 101; i++) {
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
//                    los.setAccessibleText("Eliminada");
//                    moverLosetaSelvaMezaLogica(los);
//                    hBoxLosetasSelva.getChildren().remove(los);
//                    rellenarHBoxLosetasSelva();
                }
                
                event.consume();
            }
        });
//            los.setIde(String.valueOf(i));
//            losetasSelva[i] = los;
        
     
     
     
     bolsa[i] = fichas ;
     
     
     
     
     
    }
    
   
    
    
    
}
public void rellenarmazoJug(){
    
    
}

    public void setMeza(Fichas[][] meza) {
        this.meza = meza;
    }

    public void setBolsa(Fichas[] bolsa) {
        this.bolsa = bolsa;
    }

    public void setMazojug(Fichas[] Mazojug) {
        this.Mazojug = Mazojug;
    }

    public Fichas[][] getMeza() {
        return meza;
    }

    public Fichas[] getBolsa() {
        return bolsa;
    }

    public Fichas[] getMazojug() {
        return Mazojug;
    }

}
