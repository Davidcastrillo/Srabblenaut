/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.una.srabblenaut.model;


/**
 *
 * @author David
 */
public class Jugador {
    private int id;
    private String Nombre;
    private int marcador;
    private Boolean bot;
    private Fichas[] fichasjugador = new Fichas[7];

    public Jugador() {
        
    }

    public Jugador(int id, String Nombre, int marcador, boolean bot) {
        this.id = id;
        this.Nombre = Nombre;
        this.marcador = marcador;
        this.bot = bot;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getMarcador() {
        return marcador;
    }

    public void setMarcador(int marcador) {
        this.marcador = marcador;
    }

    public Fichas[] getFichasjugador() {
        return fichasjugador;
    }

    public void setFichasjugador(Fichas[] fichasjugador) {
        this.fichasjugador = fichasjugador;
    }

    public Boolean getBot() {
        return bot;
    }

    public void setBot(Boolean bot) {
        this.bot = bot;
    }
    
    
}