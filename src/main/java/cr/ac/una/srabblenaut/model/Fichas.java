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
public class Fichas extends ImageView  {
    private int puntaje;
    private int tipoFicha;
    private String tipodeFicha;
    private String ide;
    private String imagen;
    private int fila;
    private int columna;
    
    public Fichas() {
        imagen = "*";
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
            this.imagen = "cr/ac/una/srabblenaut/resources/LetraA.png";
            Image img1 = new Image("cr/ac/una/srabblenaut/resources/LetraA.png");
            setImage(img1);
                break;
            case 2:
            this.imagen = "cr/ac/una/srabblenaut/resources/LetraB.png";
            Image img2 = new Image("cr/ac/una/srabblenaut/resources/LetraB.png");
            setImage(img2); 
                break;
            case 3:
            this.imagen = "cr/ac/una/srabblenaut/resources/LetraC.png";
            Image img3 = new Image("cr/ac/una/srabblenaut/resources/LetraC.png");
            setImage(img3);
                 break;
            case 4:
            this.imagen = "cr/ac/una/srabblenaut/resources/LetraD.png";    
            Image img4 = new Image("cr/ac/una/srabblenaut/resources/LetraD.png");
            setImage(img4);
                 break;
            case 5:
            this.imagen = "cr/ac/una/srabblenaut/resources/LetraE.png";    
            Image img5 = new Image("cr/ac/una/srabblenaut/resources/LetraE.png");
            setImage(img5);
                 break;
            case 6:
            this.imagen = "cr/ac/una/srabblenaut/resources/LetraG.png";     
            Image img6 = new Image("cr/ac/una/srabblenaut/resources/LetraG.png");
            setImage(img6); 
                 break;
            case 7:
            this.imagen = "cr/ac/una/srabblenaut/resources/LetraH.png";    
            Image img7 = new Image("cr/ac/una/srabblenaut/resources/LetraH.png");
            setImage(img7);
                 break;
            case 8:
            this.imagen = "cr/ac/una/srabblenaut/resources/LetraI.png";     
            Image img8 = new Image("cr/ac/una/srabblenaut/resources/LetraI.png");
            setImage(img8);
                 break;
            case 9:
            this.imagen = "cr/ac/una/srabblenaut/resources/LetraJ.png";     
            Image img9 = new Image("cr/ac/una/srabblenaut/resources/LetraJ.png");
            setImage(img9);
                 break;
            case 10:
            this.imagen = "cr/ac/una/srabblenaut/resources/LetraL.png";     
            Image img10 = new Image("cr/ac/una/srabblenaut/resources/LetraL.png");
            setImage(img10);
                break;
            case 11:
            this.imagen = "cr/ac/una/srabblenaut/resources/LetraLL.png";     
            Image img11 = new Image("cr/ac/una/srabblenaut/resources/LetraLL.png");
            setImage(img11);  
                break;
            case 12:
            this.imagen = "cr/ac/una/srabblenaut/resources/LetraM.png";     
            Image img12 = new Image("cr/ac/una/srabblenaut/resources/LetraM.png");
            setImage(img12);   
                 break;
            case 13:
            this.imagen = "cr/ac/una/srabblenaut/resources/LetraN.png";     
            Image img13 = new Image("cr/ac/una/srabblenaut/resources/LetraN.png");
            setImage(img13);
                break;
            case 14:
            this.imagen = "cr/ac/una/srabblenaut/resources/LetraO.png";     
            Image img14 = new Image("cr/ac/una/srabblenaut/resources/LetraO.png");
            setImage(img14);
                 break;
            case 15:
            this.imagen = "cr/ac/una/srabblenaut/resources/LetraP.png";     
            Image img15 = new Image("cr/ac/una/srabblenaut/resources/LetraP.png");
            setImage(img15);
                break;
            case 16:
            this.imagen = "cr/ac/una/srabblenaut/resources/LetraQ.png";    
            Image img16 = new Image("cr/ac/una/srabblenaut/resources/LetraQ.png");
            setImage(img16);
                break;
            case 17:
            this.imagen = "cr/ac/una/srabblenaut/resources/LetraR.png";    
            Image img17 = new Image("cr/ac/una/srabblenaut/resources/LetraR.png");
            setImage(img17);
                break;
            case 18:
            this.imagen = "cr/ac/una/srabblenaut/resources/LetraRR.png";     
            Image img18 = new Image("cr/ac/una/srabblenaut/resources/LetraRR.png");
            setImage(img18);
                break;
            case 19:
            this.imagen = "cr/ac/una/srabblenaut/resources/LetraS.png";    
            Image img19 = new Image("cr/ac/una/srabblenaut/resources/LetraS.png");
            setImage(img19); 
                 break;
            case 20:
            this.imagen = "cr/ac/una/srabblenaut/resources/LetraT.png";    
            Image img20 = new Image("cr/ac/una/srabblenaut/resources/LetraT.png");
            setImage(img20);
                 break;
            case 21:
            this.imagen = "cr/ac/una/srabblenaut/resources/LetraU.png";    
            Image img21 = new Image("cr/ac/una/srabblenaut/resources/LetraU.png");
            setImage(img21);
                  break;
            case 22:
            this.imagen = "cr/ac/una/srabblenaut/resources/LetraV.png";    
            Image img22 = new Image("cr/ac/una/srabblenaut/resources/LetraV.png");
            setImage(img22);                   
                break;
            case 23:
            this.imagen = "cr/ac/una/srabblenaut/resources/LetraX.png";    
            Image img23 = new Image("cr/ac/una/srabblenaut/resources/LetraX.png");
            setImage(img23); 
                 break;
            case 24:
            this.imagen = "cr/ac/una/srabblenaut/resources/LetraY.png";   
            Image img24 = new Image("cr/ac/una/srabblenaut/resources/LetraY.png");
            setImage(img24);
                 break;
            case 25:
            this.imagen = "cr/ac/una/srabblenaut/resources/LetraÑ.png";    
            Image img25 = new Image("cr/ac/una/srabblenaut/resources/LetraÑ.png");
            setImage(img25); 
                break;
            case 26:
            this.imagen = "cr/ac/una/srabblenaut/resources/LetraCH.png";    
            Image img26 = new Image("cr/ac/una/srabblenaut/resources/LetraCH.png");
            setImage(img26);
                 break;
            case 27:
            this.imagen = "cr/ac/una/srabblenaut/resources/LetraF.png";
            Image img27 = new Image("cr/ac/una/srabblenaut/resources/LetraF.png");
            setImage(img27);
                 break;
            case 28:
            this.imagen = "cr/ac/una/srabblenaut/resources/LetraZ.png";    
            Image img28 = new Image("cr/ac/una/srabblenaut/resources/LetraZ.png");
            setImage(img28);
                break;
            default:
              this.imagen = "cr/ac/una/srabblenaut/resources/LetraZ.png";
              Image img29 = new Image("cr/ac/una/srabblenaut/resources/LetraZ.png");
              setImage(img29);
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

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

  
    
    
    
    
}