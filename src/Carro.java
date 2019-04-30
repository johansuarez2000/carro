
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
public class Carro {
    private Motor m;
    private Ruedas[]frontales ;
    private Ruedas []traseras;
    private String marcac;

    public Carro(String marcac,double potenciam,String marcam) {
        Motor motor= new Motor(marcam,potenciam);
        m = motor;
        this.marcac = marcac;
    }

    public Motor getM() {
        return m;
    }
    

    public Ruedas[] getFrontales() {
        return frontales;
    }

    public void setFrontales(Ruedas[] frontales) {
        this.frontales = frontales;
    }

    public Ruedas[] getTraseras() {
        return traseras;
    }

    public void setTraseras(Ruedas[] traseras) {
        this.traseras= traseras;
        //relacion ruedas con motor
        for(int i=0; i<traseras.length;i++){
            this.traseras[i].setEje(this.m);
        }//relacion motor rueda
        this.m.setEje(traseras);
    }

    public String getMarcac() {
        return marcac;
    }

    public void setMarcac(String marcac) {
        this.marcac = marcac;
    }

    @Override
    public String toString() {
        return "Carro{" + "m=" + m + ", frontales=" + Arrays.toString(frontales) + ", traseras=" + Arrays.toString(traseras) + ", marcac=" + marcac + '}';
    }

    
    
    
}
