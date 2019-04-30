/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jssuarezse
 */
public class Ruedas {
    private Motor eje;
    private String marca;
    private double diametro;

    public Ruedas(String marca, double diametro) {
        this.marca = marca;
        this.diametro = diametro;
    }

    public Motor getEje() {
        return eje;
    }

    public void setEje(Motor eje) {
        this.eje = eje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Ruedas{" + "eje=" + eje + ", marca=" + marca + ", diametro=" + diametro + '}';
    }

  
    
    
    
}
