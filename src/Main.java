/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jssuarezse
 */
public class Main {
    public static void main(String [] args){
        Ruedas[] frontales = new Ruedas[2];
        Ruedas[] traseras = new Ruedas[2];
        
        frontales[0]= new Ruedas("michelin",30);
        frontales[1]= new Ruedas("michelin",30);
        
        traseras[0]= new Ruedas("michelin",40);
        traseras[1]= new Ruedas("michelin",40);
        
        Carro jey= new Carro("mazda",80,"roll rois");
        jey.setFrontales(frontales);
        jey.setTraseras(traseras);
    
        System.out.println(jey);
    }
    
}
