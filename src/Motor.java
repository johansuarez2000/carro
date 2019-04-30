
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jssuarezse
 */
public class Motor {
    private Ruedas[] eje;
    private String marcam;
    private double potenciam;

    public Motor(String marcam, double potencia) {
        this.marcam = marcam;
        this.potenciam = potencia;
    }

    public Ruedas[] getEje() {
        return eje;
    }

    public void setEje(Ruedas[] eje) {
        this.eje = eje;
    }

    public String getMarcam() {
        return marcam;
    }

    public void setMarcam(String marcam) {
        this.marcam = marcam;
    }

    public double getPotenciam() {
        return potenciam;
    }

    public void setPotenciam(double potenciam) {
        this.potenciam = potenciam;
    }

    @Override
    public String toString() {
        return "Motor{" + "eje=" + eje + ", marcam=" + marcam + ", potenciam=" + potenciam + '}';
    }

    
    
   
}