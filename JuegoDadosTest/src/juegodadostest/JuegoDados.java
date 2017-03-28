/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodadostest;

/**
 *
 * @author tatan
 */
public class JuegoDados {
     
    public int sumar(){
        int suma;
        Dado Dado1 = new Dado();
        Dado Dado2 = new Dado();
        
        suma=Dado1.mostar()+Dado2.mostar();
        return suma;
    }
    public void juego(){
        
        if (sumar()>7){
            System.out.println("su suma es "+sumar());
            System.out.println("ganaste pe");
            
        }
        else{
            System.out.println("su suma es "+sumar());
            System.out.println("perdiste we");
        }
        
    }
    
    
    
}
