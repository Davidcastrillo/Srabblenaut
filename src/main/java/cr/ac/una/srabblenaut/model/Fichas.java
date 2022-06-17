/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.una.srabblenaut.model;

import java.io.Serializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author David
 */
public class Fichas extends ImageView implements Serializable {
    private int puntaje;
    private int tipoFicha;
    private String tipodeFicha;
    private String ide;
    private int fila;
    private Image image;
    private int columna;
    
    public Fichas() {
        puntaje = 0;
        tipoFicha = 0;
        tipodeFicha = "N"; // N = ninguno , J= jugador , B= bolsa;
        ide = "*"; // todas las letras
        fila = 0;
        columna = 0;
        
        
    }
    
    public void crearFichas(){
    try {
        switch(tipoFicha){
            case 1:
            Image img1 = new Image("cr/ac/una/srabblenaut/resources/LetraA.png");
            setImage(img1);
                break;
            case 2:
            Image img2 = new Image("cr/ac/una/srabblenaut/resources/LetraB.png");
            setImage(img2); 
                break;
            case 3:
            Image img3 = new Image("cr/ac/una/srabblenaut/resources/LetraC.png");
            setImage(img3);
                 break;
            case 4:
            Image img4 = new Image("cr/ac/una/srabblenaut/resources/LetraD.png");
            setImage(img4);
                 break;
            case 5:
            Image img5 = new Image("cr/ac/una/srabblenaut/resources/LetraE.png");
            setImage(img5);
                 break;
            case 6:
            Image img6 = new Image("cr/ac/una/srabblenaut/resources/LetraG.png");
            setImage(img6); 
                 break;
            case 7:
            Image img7 = new Image("cr/ac/una/srabblenaut/resources/LetraH.png");
            setImage(img7);
                 break;
            case 8:
            Image img8 = new Image("cr/ac/una/srabblenaut/resources/LetraI.png");
            setImage(img8);
                 break;
            case 9:
            Image img9 = new Image("cr/ac/una/srabblenaut/resources/LetraJ.png");
            setImage(img9);
                 break;
            case 10:
            Image img10 = new Image("cr/ac/una/srabblenaut/resources/LetraL.png");
            setImage(img10);
                break;
            case 11:
            Image img11 = new Image("cr/ac/una/srabblenaut/resources/LetraLL.png");
            setImage(img11);  
                break;
            case 12:
            Image img12 = new Image("cr/ac/una/srabblenaut/resources/LetraM.png");
            setImage(img12);   
                 break;
            case 13:
            Image img13 = new Image("cr/ac/una/srabblenaut/resources/LetraN.png");
            setImage(img13);
                break;
            case 14:
            Image img14 = new Image("cr/ac/una/srabblenaut/resources/LetraO.png");
            setImage(img14);
                 break;
            case 15:
            Image img15 = new Image("cr/ac/una/srabblenaut/resources/LetraP.png");
            setImage(img15);
                break;
            case 16:
            Image img16 = new Image("cr/ac/una/srabblenaut/resources/LetraQ.png");
            setImage(img16);
                break;
            case 17:
            Image img17 = new Image("cr/ac/una/srabblenaut/resources/LetraR.png");
            setImage(img17);
                break;
            case 18:
            Image img18 = new Image("cr/ac/una/srabblenaut/resources/LetraRR.png");
            setImage(img18);
                break;
            case 19:
            Image img19 = new Image("cr/ac/una/srabblenaut/resources/LetraS.png");
            setImage(img19); 
                 break;
            case 20:
            Image img20 = new Image("cr/ac/una/srabblenaut/resources/LetraT.png");
            setImage(img20);
                 break;
            case 21:
            Image img21 = new Image("cr/ac/una/srabblenaut/resources/LetraU.png");
            setImage(img21);
                  break;
            case 22:
            Image img22 = new Image("cr/ac/una/srabblenaut/resources/LetraV.png");
            setImage(img22);                   
                break;
            case 23:
            Image img23 = new Image("cr/ac/una/srabblenaut/resources/LetraX.png");
            setImage(img23); 
                 break;
            case 24:
            Image img24 = new Image("cr/ac/una/srabblenaut/resources/LetraY.png");
            setImage(img24);
                 break;
            case 25:
            Image img25 = new Image("cr/ac/una/srabblenaut/resources/LetraÑ.png");
            setImage(img25); 
                break;
            case 26:
            Image img26 = new Image("cr/ac/una/srabblenaut/resources/LetraCH.png");
            setImage(img26);
                 break;
            case 27:
            Image img27 = new Image("cr/ac/una/srabblenaut/resources/LetraF.png");
            setImage(img27);
                 break;
            case 28:
            Image img28 = new Image("cr/ac/una/srabblenaut/resources/LetraZ.png");
            setImage(img28);
                break;
            default:
              System.out.println("Error Dando apariencia Fichas ");   

        }
                    
        } catch (Exception e) {
            
            System.out.println("Error creando Fichas");   
            
         
        }
        // tamano de las fichas 
        setFitHeight(55);
        setFitWidth(55);
        
    }
    
  
    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getTipoFicha() {
        return tipoFicha;
    }

    public void setTipoFicha(int tipoFicha) {
        this.tipoFicha = tipoFicha;
    }

    public String getTipodeFicha() {
        return tipodeFicha;
    }

    public void setTipodeFicha(String tipodeFicha) {
        this.tipodeFicha = tipodeFicha;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

  
    
    
    
    
}