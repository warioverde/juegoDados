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
public class Dado {
    int cara;
    private int azar(){
    this.cara=(int)(Math.random()*6+1);
    return this.cara;
} 
    public int mostar(){
        return azar();
}
}
