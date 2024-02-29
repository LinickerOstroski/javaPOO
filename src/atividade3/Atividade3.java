/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade3;

/**
 *
 * @author Iksortso K2
 */
public class Atividade3 {
    public static void main(String[] args) {
        
        Casa casa1 = new Casa();
        
        casa1.setAberta(true);
        casa1.setCor("Marrom");
        
        System.out.println("Cor da casa:" + casa1.getCor());
        
        casa1.pinta("verde");
        
        System.out.println("Cor da casa:" + casa1.getCor());
        
        casa1.abre();
        
        System.out.println(casa1.estaAberta());
        
        casa1.fecha();
        
        System.out.println(casa1.estaAberta());
        
        casa1.setDimensaoX(20);
        casa1.setDimensaoZ(100);
        casa1.setDimensaoY(30);
    }
}
